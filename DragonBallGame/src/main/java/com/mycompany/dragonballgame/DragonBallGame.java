/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dragonballgame;

/**
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
import java.util.HashMap;
import java.util.Map;

class Personaje {
    private String nombre;
    private String raza;
    private int nivelPelea;
    private int velocidad;
    private int nivelDefensa;
    private String descripcion;
    private ImageIcon imagen;

    public Personaje(String nombre, String raza, int nivelPelea, int velocidad, int nivelDefensa, String descripcion, ImageIcon imagen) {
        this.nombre = nombre;
        this.raza = raza;
        this.nivelPelea = nivelPelea;
        this.velocidad = velocidad;
        this.nivelDefensa = nivelDefensa;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public int getNivelPelea() {
        return nivelPelea;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getNivelDefensa() {
        return nivelDefensa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public ImageIcon getImagen() {
        return imagen;
    }
}

class DragonBallGameView extends JFrame {
    private Map<JButton, Personaje> personajeButtonMap = new HashMap<>();
    private JTextArea infoTextArea;
    private JLabel imagenLabel;

    public DragonBallGameView() {
        setTitle("Dragon Ball Game");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        infoTextArea = new JTextArea(10, 40);
        imagenLabel = new JLabel();
        
        // Crear personajes
        Personaje goku = new Personaje("Goku", "Saiyan", 9000, 100, 80,
                "El protagonista de la serie, conocido por su gran corazón y su insaciable apetito.", new ImageIcon("goku.jpg"));
        Personaje vegeta = new Personaje("Vegeta", "Saiyan", 8500, 90, 75,
                "El príncipe de los Saiyan, orgulloso y fuerte.", new ImageIcon("vegeta.jpg"));

        // Crear botones para cada personaje
        JButton gokuButton = new JButton("Goku");
        JButton vegetaButton = new JButton("Vegeta");

        // Mapear botones a personajes
        personajeButtonMap.put(gokuButton, goku);
        personajeButtonMap.put(vegetaButton, vegeta);

        for (JButton button : personajeButtonMap.keySet()) {
            buttonPanel.add(button);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    mostrarInformacion(personajeButtonMap.get(button));
                }
            });
        }

        add(buttonPanel, BorderLayout.NORTH);
        add(new JScrollPane(infoTextArea), BorderLayout.CENTER);
        add(imagenLabel, BorderLayout.SOUTH);
    }

    private void mostrarInformacion(Personaje personaje) {
        infoTextArea.setText("Nombre: " + personaje.getNombre() + "\n");
        infoTextArea.append("Raza: " + personaje.getRaza() + "\n");
        infoTextArea.append("Nivel de Pelea: " + personaje.getNivelPelea() + "\n");
        infoTextArea.append("Velocidad: " + personaje.getVelocidad() + "\n");
        infoTextArea.append("Nivel de Defensa: " + personaje.getNivelDefensa() + "\n");
        infoTextArea.append("Descripción: " + personaje.getDescripcion() + "\n");

        // Mostrar imagen del personaje
        imagenLabel.setIcon(personaje.getImagen());
    }
}

public class DragonBallGame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DragonBallGameView().setVisible(true);
            }
        });
    }
}
