/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// CharacterView.java
package view;

import javax.swing.*;
import java.awt.*;
import model.Character;

public class CharacterView extends JFrame {
    private JLabel nameLabel;
    private JLabel raceLabel;
    private JLabel powerLabel;
    private JLabel speedLabel;
    private JLabel defenseLabel;
    private JTextArea descriptionArea;
    private JLabel characterImage;

    public CharacterView() {
        setTitle("DragonBall Character Info");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 600);
        setLocationRelativeTo(null);

        JPanel characterPanel = new JPanel();
        characterPanel.setLayout(new GridLayout(8, 2));

        nameLabel = new JLabel();
        raceLabel = new JLabel();
        powerLabel = new JLabel();
        speedLabel = new JLabel();
        defenseLabel = new JLabel();
        descriptionArea = new JTextArea(4, 20);
        descriptionArea.setWrapStyleWord(true);
        descriptionArea.setLineWrap(true);
        descriptionArea.setOpaque(false);
        descriptionArea.setEditable(false);
        characterImage = new JLabel();

        characterPanel.add(new JLabel("Name:"));
        characterPanel.add(nameLabel);
        characterPanel.add(new JLabel("Race:"));
        characterPanel.add(raceLabel);
        characterPanel.add(new JLabel("Power Level:"));
        characterPanel.add(powerLabel);
        characterPanel.add(new JLabel("Speed:"));
        characterPanel.add(speedLabel);
        characterPanel.add(new JLabel("Defense:"));
        characterPanel.add(defenseLabel);
        characterPanel.add(new JLabel("Description:"));
        characterPanel.add(new JScrollPane(descriptionArea));
        characterPanel.add(characterImage);

        add(characterPanel);
    }

    public void updateCharacterDetails(Character character) {
        nameLabel.setText(character.getName());
        raceLabel.setText(character.getRace());
        powerLabel.setText(Integer.toString(character.getPowerLevel()));
        speedLabel.setText(Integer.toString(character.getSpeed()));
        defenseLabel.setText(Integer.toString(character.getDefense()));
        descriptionArea.setText(character.getDescription());

        ImageIcon imageIcon = new ImageIcon(character.getImagePath());
        characterImage.setIcon(imageIcon);
        
        revalidate();
        repaint();
    }
}
