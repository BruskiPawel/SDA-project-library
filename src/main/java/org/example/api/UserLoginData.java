package org.example.api;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserLoginData {

    private String login;
    private String password;
}
