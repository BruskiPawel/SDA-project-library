package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String name;
    private String lastName;
    private String userName;
    private String email;
    private String password;
    private Address address;
    private List<Role> roles;
}
