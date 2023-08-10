/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraydragonballz;

/*
 *
 * @author Harol
 */
// Politecnico Internacional
// Programacion I
// Prof. Harol Torres
// Harol.Torres@pi.edu.co
// Ciclo: 27 de Julio, 2023

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Clase que representa a un personaje de Dragon Ball Z
class Character {
    private String name;
    private String race;
    private int powerLevel;

    // Constructor para inicializar los atributos del personaje
    public Character(String name, String race, int powerLevel) {
        this.name = name;
        this.race = race;
        this.powerLevel = powerLevel;
    }

    // Métodos de acceso (getters) para los atributos del personaje
    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    // Métodos de modificación (setters) para los atributos del personaje
    public void setRace(String race) {
        this.race = race;
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }
}

public class ArrayDragonBallZ extends JFrame {

    // Arreglo de personajes de Dragon Ball Z
    private Character[] characters = {
            new Character("Goku", "Saiyan", 9000),
            new Character("Vegeta", "Saiyan", 8500),
            new Character("Picoro", "Namekian", 3500),
            new Character("Gohan", "Saiyan", 6000)
    };

    private JComboBox<String> characterComboBox;
    private JTextField raceField;
    private JTextField powerLevelField;
    private JButton updateButton;

    public ArrayDragonBallZ() {
        setTitle("|Politecnico Internacional | Dragon Ball Z Editor de Personajes |");
        setSize(600, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Inicializar los componentes gráficos
        initializeComponents();

        // Crear un panel con disposición GridLayout para organizar los elementos
        JPanel panel = new JPanel(new GridLayout(4, 2));
        panel.add(new JLabel("Seleccione Personaje:"));
        panel.add(characterComboBox);
        panel.add(new JLabel("Raza:"));
        panel.add(raceField);
        panel.add(new JLabel("Nivel de Poder:"));
        panel.add(powerLevelField);
        panel.add(new JLabel()); // Espacio vacío
        panel.add(updateButton);

        add(panel); // Agregar el panel a la ventana
    }

    // Inicializa los componentes gráficos y agrega acciones a los eventos
    private void initializeComponents() {
        characterComboBox = new JComboBox<>();
        for (Character character : characters) {
            characterComboBox.addItem(character.getName()); // Agregar nombres de personajes al ComboBox
        }
        characterComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = characterComboBox.getSelectedIndex();
                if (selectedIndex >= 0 && selectedIndex < characters.length) {
                    // Obtener el personaje seleccionado y actualizar los campos de texto
                    Character selectedCharacter = characters[selectedIndex];
                    raceField.setText(selectedCharacter.getRace());
                    powerLevelField.setText(Integer.toString(selectedCharacter.getPowerLevel()));
                }
            }
        });

        raceField = new JTextField();
        powerLevelField = new JTextField();

        updateButton = new JButton("Actualizar");
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = characterComboBox.getSelectedIndex();
                if (selectedIndex >= 0 && selectedIndex < characters.length) {
                    // Obtener el personaje seleccionado y actualizar sus atributos
                    Character selectedCharacter = characters[selectedIndex];
                    selectedCharacter.setRace(raceField.getText());
                    selectedCharacter.setPowerLevel(Integer.parseInt(powerLevelField.getText()));
                    JOptionPane.showMessageDialog(ArrayDragonBallZ.this, "Personaje Actualizado!");
                }
            }
        });
    }

    // Método principal para iniciar la aplicación
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ArrayDragonBallZ().setVisible(true); // Crear una instancia de la aplicación y hacerla visible
            }
        });
    }
}
