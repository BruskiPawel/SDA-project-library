package org.example.view;

import org.example.api.UserLoginData;
import org.example.controller.LoginController;
import org.example.controller.LoginControllerImpl;
import org.example.model.User;

import java.util.Scanner;

public class LoginView implements View {
    private Scanner scanner;
    private LoginController loginController;
    public LoginView() {
        this.scanner = new Scanner(System.in);
        this.loginController = new LoginControllerImpl();
    }

    @Override
    public void display() {
        loginController.login(getData()).display();
    }

    UserLoginData getData() {
        System.out.println("Podaj login");
        String login = scanner.nextLine();
        System.out.println("Podaj haslo");
        String password = scanner.nextLine();
        return  new UserLoginData(login, password);
    }
}
