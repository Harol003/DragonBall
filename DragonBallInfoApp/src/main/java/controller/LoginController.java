/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// LoginController.java

package controller;

import view.LoginView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JOptionPane;
import view.CharacterSelectView;

public class LoginController {
    private final LoginView loginView;

    public LoginController(LoginView loginView) {
        this.loginView = loginView;
        this.loginView.addLoginListener(new LoginListener());
    }

    private class LoginListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String username = loginView.getUsername();
            char[] password = loginView.getPassword();

            // Perform authentication logic here
            // For demonstration purposes, we're using a simple password "password"
            if (username.equals("admin") && Arrays.equals(password, "password".toCharArray())) {
                showCharacterSelection();
            } else {
                JOptionPane.showMessageDialog(loginView, "Invalid username or password.");
            }
        }

        private void showCharacterSelection() {
            loginView.setVisible(false);
            CharacterSelectView characterSelectView = new CharacterSelectView();
            CharacterSelectController characterSelectController = new CharacterSelectController(characterSelectView);
            characterSelectView.setVisible(true);
        }
    }
}
