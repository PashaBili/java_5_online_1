package ua.com.alevel;

import ua.com.alevel.controller.UserController;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Створюєм читаєм оновлюєм видаляєм ");

        UserController userController = new UserController();
        userController.start();
    }
}
