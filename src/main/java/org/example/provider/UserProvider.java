package org.example.provider;

import org.example.model.User;

import java.util.Set;

public interface UserProvider {

    Set<User> getAllUsers();

}
