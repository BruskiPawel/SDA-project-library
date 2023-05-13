package org.example.provider;

import org.example.model.Address;
import org.example.model.Role;
import org.example.model.User;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FileUserProvider implements UserProvider {

    private final String filePath = "src/main/resources/users";

    @Override
    public Set<User> getAllUsers() {
        Set<User> users = Set.of();

        try (BufferedReader bufferedReader =
                     new BufferedReader(new FileReader(filePath))) {
            users = bufferedReader.lines().map(this::mapToUser).collect(Collectors.toSet());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return users;
    }

    private User mapToUser(String userDataLine) {

        String[] splitUserData = userDataLine.split(";");

        return User.builder()
                .firstName(splitUserData[0])
                .lastName(splitUserData[1])
                .login(splitUserData[2])
                .email(splitUserData[3])
                .password(splitUserData[4])
                .address(mapToAddress(splitUserData))
                .roles(mapToRole(splitUserData))
                .build();
    }

    private Address mapToAddress(String[] address) {
        return Address.builder()
                .street(address[5])
                .buildingNo(address[6])
                .apartmentNo(address[7])
                .postalCode(address[8])
                .build();
    }

    private List<Role> mapToRole(String[] splitUserData) {

      return Arrays.stream(splitUserData[9].split("/"))
               .map(splitRoles -> Role.valueOf(splitRoles))
               .collect(Collectors.toList());
    }


}
