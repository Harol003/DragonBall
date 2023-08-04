/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// CharacterSelectController.java

package controller;

import model.Character;
import view.CharacterSelectView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CharacterSelectController {
    private CharacterSelectView characterSelectView;

    public CharacterSelectController(CharacterSelectView characterSelectView) {
        this.characterSelectView = characterSelectView;
        this.characterSelectView.addCharacterButtonListener("Goku", new CharacterButtonListener(createGoku()));
        this.characterSelectView.addCharacterButtonListener("Vegeta", new CharacterButtonListener(createVegeta()));
    }

    private Character createGoku() {
        return new Character("Goku", "Saiyan", 9000, 100, 80, "The main protagonist.", "goku.jpg");
    }

    private Character createVegeta() {
        return new Character("Vegeta", "Saiyan", 8500, 90, 70, "The prince of all Saiyans.", "vegeta.jpg");
    }

    private class CharacterButtonListener implements ActionListener {
        private Character character;

        public CharacterButtonListener(Character character) {
            this.character = character;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            CharacterView characterView = new CharacterView();
            CharacterController characterController = new CharacterController(characterView);
            characterController.createCharacterButtonListener(character).actionPerformed(e);
        }
    }
}

}
