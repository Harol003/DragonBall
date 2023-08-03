/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dragonballzjpanel;


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
import java.util.ArrayList;

// Clase que representa un personaje de Dragon Ball Z
class Personaje {
    private String nombre;
    private int nivelPoder;
    private ImageIcon imagen;

    public Personaje(String nombre, int nivelPoder, ImageIcon imagen) {
        this.nombre = nombre;
        this.nivelPoder = nivelPoder;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivelPoder() {
        return nivelPoder;
    }

    public ImageIcon getImagen() {
        return imagen;
    }
}

// Clase que representa la interfaz gráfica de la aplicación
class DragonBallZJPanelApp extends JFrame {
    private ArrayList<Personaje> personajes;

    public DragonBallZJPanelApp() {
        setTitle("Politecnico Internacional - Dragon Ball Z App Personajes");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        personajes = new ArrayList<>();
        personajes.add(new Personaje("Goku", 9000, new ImageIcon("goku.jpg")));
        personajes.add(new Personaje("Vegeta", 8500, new ImageIcon("vegeta.jpg")));
        personajes.add(new Personaje("Piccolo", 4200, new ImageIcon("piccolo.jpg")));
        personajes.add(new Personaje("Gohan", 6000, new ImageIcon("gohan.jpg")));
        personajes.add(new Personaje("Frizzer", 12000, new ImageIcon("frieza.jpg")));

        JPanel panel = new JPanel(new GridLayout(personajes.size(), 2));

        for (Personaje personaje : personajes) {
            JLabel imagenLabel = new JLabel(personaje.getImagen());
            JLabel nombreLabel = new JLabel(personaje.getNombre());
            JLabel poderLabel = new JLabel("Nivel de Poder: " + personaje.getNivelPoder());

            JPanel personajePanel = new JPanel(new BorderLayout());
            personajePanel.add(imagenLabel, BorderLayout.NORTH);
            personajePanel.add(nombreLabel, BorderLayout.CENTER);
            personajePanel.add(poderLabel, BorderLayout.SOUTH);

            panel.add(personajePanel);
        }

        JScrollPane scrollPane = new JScrollPane(panel);
        add(scrollPane);
    }
}

public class DragonBallZJPanel {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DragonBallZJPanelApp().setVisible(true);
            }
        });
    }
}

