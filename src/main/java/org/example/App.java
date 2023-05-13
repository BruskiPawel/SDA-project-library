package org.example;

import org.example.provider.FileUserProvider;
import org.example.provider.UserProvider;

public class App {
    public static void main(String[] args) {

        UserProvider userProvider = new FileUserProvider();
        System.out.println(userProvider.getAllUsers());
    }
}
