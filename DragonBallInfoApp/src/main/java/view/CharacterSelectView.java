/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// CharacterSelectView.java
package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CharacterSelectView extends JFrame {
    private JButton gokuButton;
    private JButton vegetaButton;

    public CharacterSelectView() {
        setTitle("DragonBall Character Selection");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1));

        gokuButton = new JButton("Goku");
        vegetaButton = new JButton("Vegeta");

        panel.add(gokuButton);
        panel.add(vegetaButton);

        add(panel);
    }

    public void addCharacterButtonListener(String characterName, ActionListener listener) {
        if (characterName.equalsIgnoreCase("Goku")) {
            gokuButton.addActionListener(listener);
        } else if (characterName.equalsIgnoreCase("Vegeta")) {
            vegetaButton.addActionListener(listener);
        }
    }
}
