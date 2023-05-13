package org.example;

import org.example.provider.FileUserProvider;
import org.example.provider.UserProvider;
import org.example.view.LoginView;
import org.example.view.View;

public class App {
    public static void main(String[] args) {

        View view = new LoginView();
        view.display();
    }
}
