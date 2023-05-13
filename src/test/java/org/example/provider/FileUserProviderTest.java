package org.example.provider;

import org.assertj.core.api.Assertions;
import org.example.model.Address;
import org.example.model.User;
import org.junit.jupiter.api.Test;


import java.util.List;
import java.util.Set;

import static org.example.UserDataFactory.getExampleUserData;
import static org.example.model.Role.ADMIN;
import static org.example.model.Role.USER;

class FileUserProviderTest {

    @Test
    void shouldProvideAndMapAllUsersFromFile() {
        // given
        UserProvider userProvider = new FileUserProvider("src/main/resources/users");
        // when
        Set<User> result = userProvider.getAllUsers();
        // then
        Assertions.assertThat(result).containsAll(getExampleUserData());
    }

}