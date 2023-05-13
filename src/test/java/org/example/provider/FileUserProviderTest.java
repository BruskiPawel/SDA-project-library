package org.example.provider;

import org.assertj.core.api.Assertions;
import org.example.model.Address;
import org.example.model.User;
import org.junit.jupiter.api.Test;


import java.util.List;
import java.util.Set;

import static org.example.model.Role.ADMIN;
import static org.example.model.Role.USER;

class FileUserProviderTest {

    Set<User> expectedData = Set.of(
            new User("Jan",
                    "Nowak",
                    "jano",
                    "jano@gmail.com",
                    "password123",
                    new Address(
                            "Wiejska",
                            "16",
                            "",
                            "01-256"),
                    List.of(USER, ADMIN)
            ),
            new User("Adam",
                    "Kowalski",
                    "adko",
                    "adko@gmail.com",
                    "password345",
                    new Address(
                            "Inna",
                            "5",
                            "2",
                            "01-256"
                    ),
                    List.of(USER)
            )
    );

    @Test
    void shouldProvideAndMapAllUsersFromFile() {
        // given
        UserProvider userProvider = new FileUserProvider("src/main/resources/users");
        // when
        Set<User> result = userProvider.getAllUsers();
        // then
        Assertions.assertThat(result).containsAll(expectedData);
    }

}