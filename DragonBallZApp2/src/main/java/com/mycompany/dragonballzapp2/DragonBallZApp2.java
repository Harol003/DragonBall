/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dragonballzapp2;

/**
 *
 * @author Harol
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Clase que representa un personaje de Dragon Ball Z
class Personaje {
    private String nombre;
    private int nivelPoder;

    public Personaje(String nombre, int nivelPoder) {
        this.nombre = nombre;
        this.nivelPoder = nivelPoder;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivelPoder() {
        return nivelPoder;
    }
}

// Clase que representa la interfaz gráfica de la aplicación
class DragonBallZApp2 extends JFrame {
    private JLabel tituloLabel;
    private JButton mostrarButton;
    private JTextArea personajesTextArea;

    private Personaje[] personajes = {
            new Personaje("Goku", 9000),
            new Personaje("Vegeta", 8500),
            new Personaje("Piccolo", 4200),
            new Personaje("Gohan", 6000),
            new Personaje("Frieza", 12000)
    };

    public DragonBallZApp2() {
        setTitle("Dragon Ball Z Characters");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        tituloLabel = new JLabel("Personajes Principales y Niveles de Poder:");
        mostrarButton = new JButton("Mostrar Personajes");
        personajesTextArea = new JTextArea(10, 30);
        personajesTextArea.setEditable(false);

        mostrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPersonajes();
            }
        });

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(tituloLabel, BorderLayout.NORTH);
        panel.add(mostrarButton, BorderLayout.CENTER);

        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(personajesTextArea), BorderLayout.CENTER);
    }

    private void mostrarPersonajes() {
        personajesTextArea.setText(""); // Limpiar el área de texto
        for (Personaje personaje : personajes) {
            String info = "Nombre: " + personaje.getNombre() + " - Poder: " + personaje.getNivelPoder() + "\n";
            personajesTextArea.append(info);
        }
    }
}

public class DragonBallZApp2Launcher {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DragonBallZApp2().setVisible(true);
            }
        });
    }
}
