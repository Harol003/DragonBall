/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dragonballvillains;

/**
 *
 * @author Harol
 */
// Importar la clase JOptionPane para mostrar mensajes y recibir entradas del usuario
import javax.swing.JOptionPane;

// Clase que representa a un personaje malvado de Dragon Ball
class Villain {
    private String name;
    private String race;
    private int powerLevel;

    // Constructor para inicializar los atributos del personaje malvado
    public Villain(String name, String race, int powerLevel) {
        this.name = name;
        this.race = race;
        this.powerLevel = powerLevel;
    }

    // Métodos de acceso (getters) para los atributos del personaje malvado
    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    // Método para mostrar información del personaje malvado
    public String getInfo() {
        return "Nombre: " + name + "\nRaza: " + race + "\nNivel de Poder: " + powerLevel;
    }
}

public class DragonBallVillains {
    public static void main(String[] args) {
        // Crear un arreglo de personajes malvados
        Villain[] villains = {
            new Villain("Frizer", "Andro", 1200000),
            new Villain("Cell", "Bio-Android", 900000),
            new Villain("Majin Buu", "Majin", 1100000)
        };

        // Mostrar un mensaje de bienvenida
        JOptionPane.showMessageDialog(null, "| Politecnico Internacional |Dragon Ball APP | Villanos de Dragon Ball |");

        // Pedir al usuario que elija un villano
        String[] villainNames = {"Frizer", "Cell", "Majin Buu"};
        String selectedVillain = (String) JOptionPane.showInputDialog(
            null,
            "Seleccione un villano:",
            "Villanos",
            JOptionPane.PLAIN_MESSAGE,
            null,
            villainNames,
            villainNames[0]
        );

        // Buscar el villano seleccionado en el arreglo
        Villain chosenVillain = null;
        for (Villain villain : villains) {
            if (villain.getName().equals(selectedVillain)) {
                chosenVillain = villain;
                break;
            }
        }

        // Mostrar la información del villano seleccionado
        if (chosenVillain != null) {
            JOptionPane.showMessageDialog(null, chosenVillain.getInfo(), "Información del Villano", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Villano no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
