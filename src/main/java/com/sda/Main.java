package com.sda;

import com.sda.view.AllBooksView;
import com.sda.view.BooksByAuthorView;
import com.sda.view.LoginView;
import com.sda.view.View;

public class Main {

    public static void main(String[] args) {
        View view = new LoginView();
        view.display();
    }

}
