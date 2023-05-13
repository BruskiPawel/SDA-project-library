package org.example.view;

import org.example.api.UserLoginData;
import org.example.controller.LoginController;
import org.example.controller.LoginControllerImpl;
import org.example.model.User;

import java.util.Optional;
import java.util.Scanner;

public class LoginView implements View {
    private Scanner scanner;
    private LoginController loginController;
    private Optional<String> message;
    public LoginView() {
        this.scanner = new Scanner(System.in);
        this.loginController = new LoginControllerImpl();
        this.message = Optional.empty();
    }

    public LoginView(Optional<String> message) {
        this.scanner = new Scanner(System.in);
        this.loginController = new LoginControllerImpl();
        this.message = message;
    }

    @Override
    public void display() {
        loginController.login(getData()).display();
    }

    UserLoginData getData() {
        message.ifPresent(System.out::println);
        System.out.println("Podaj login");
        String login = scanner.nextLine();
        System.out.println("Podaj haslo");
        String password = scanner.nextLine();
        return  new UserLoginData(login, password);
    }
}
