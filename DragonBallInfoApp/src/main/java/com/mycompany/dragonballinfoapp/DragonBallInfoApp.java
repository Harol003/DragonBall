/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dragonballinfoapp;

/**
 *
 * @author Harol
 */
// DragonBallInfoApp.java

import view.LoginView;
import controller.LoginController;

public class DragonBallInfoApp {
    public static void main(String[] args) {
        LoginView loginView = new LoginView();
        LoginController loginController = new LoginController(loginView);
        loginView.setVisible(true);
    }
}