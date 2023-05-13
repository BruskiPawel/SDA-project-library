package org.example.controller;

import org.example.api.UserLoginData;
import org.example.view.View;


public interface LoginController {

    View login(UserLoginData userLoginData);
}
