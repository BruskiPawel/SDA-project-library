package org.example.service;

import org.example.api.UserLoginData;

public interface UserLoginChecker {
    boolean checkLogin(UserLoginData userLoginData);

}
