/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// CharacterController.java
package controller;

import model.Character;
import view.CharacterView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CharacterController {
    private CharacterView characterView;

    public CharacterController(CharacterView characterView) {
        this.characterView = characterView;
    }

    public ActionListener createCharacterButtonListener(Character character) {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                characterView.updateCharacterDetails(character);
                characterView.setVisible(true);
            }
        };
    }
}
