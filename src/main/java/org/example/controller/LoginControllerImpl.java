package org.example.controller;

import org.example.api.UserLoginData;
import org.example.service.UserLoginChecker;
import org.example.service.UserService;
import org.example.view.LoginView;
import org.example.view.MainMenuView;
import org.example.view.View;


public class LoginControllerImpl implements LoginController{

    private UserLoginChecker userLoginChecker;

    public LoginControllerImpl() {
        this.userLoginChecker = new UserService();
    }

    @Override
    public View login(UserLoginData userLoginData) {

        if (userLoginChecker.checkLogin(userLoginData)) {
            return new MainMenuView();
        }
        return new LoginView();
    }
}
