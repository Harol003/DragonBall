/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dragonballsuper;

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
import java.io.File;
import javax.swing.filechooser.FileNameExtensionFilter;

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

class DragonBallSuperApp extends JFrame {
    private JButton mostrarPersonajesButton;
    private JButton compararNivelesButton;
    private JButton mostrarCampeonesButton;
    private JButton cargarImagenButton;
    private JButton salirButton;
    private JTextArea resultadosTextArea;
    private JLabel imagenLabel;
    private Personaje[] personajes = {
            new Personaje("Goku", 9000),
            new Personaje("Vegeta", 8500),
            new Personaje("Piccolo", 4200),
            new Personaje("Gohan", 6000),
            new Personaje("Frieza", 12000)
    };

    public DragonBallSuperApp() {
        setTitle("Dragon Ball Super");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        mostrarPersonajesButton = new JButton("Mostrar Personajes");
        compararNivelesButton = new JButton("Comparar Niveles");
        mostrarCampeonesButton = new JButton("Mostrar Campeones");
        cargarImagenButton = new JButton("Cargar Imagen");
        salirButton = new JButton("Salir");
        resultadosTextArea = new JTextArea(10, 40);
        imagenLabel = new JLabel();

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(mostrarPersonajesButton);
        buttonPanel.add(compararNivelesButton);
        buttonPanel.add(mostrarCampeonesButton);
        buttonPanel.add(cargarImagenButton);
        buttonPanel.add(salirButton);

        add(buttonPanel, BorderLayout.NORTH);
        add(new JScrollPane(resultadosTextArea), BorderLayout.CENTER);
        add(imagenLabel, BorderLayout.SOUTH);

        mostrarPersonajesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPersonajes();
            }
        });

        compararNivelesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                compararNiveles();
            }
        });

        mostrarCampeonesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarCampeones();
            }
        });

        cargarImagenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cargarImagen();
            }
        });

        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    private void mostrarPersonajes() {
        resultadosTextArea.setText("");
        for (Personaje personaje : personajes) {
            resultadosTextArea.append("Nombre: " + personaje.getNombre() + " - Poder: " + personaje.getNivelPoder() + "\n");
        }
    }

    private void compararNiveles() {
        resultadosTextArea.setText("");
        int maxNivel = 0;
        String maxNivelPersonaje = "";

        for (Personaje personaje : personajes) {
            if (personaje.getNivelPoder() > maxNivel) {
                maxNivel = personaje.getNivelPoder();
                maxNivelPersonaje = personaje.getNombre();
            }
        }

        resultadosTextArea.append("Personaje con mayor nivel de poder: " + maxNivelPersonaje + " - Poder: " + maxNivel + "\n");
    }

    private void mostrarCampeones() {
        resultadosTextArea.setText("Campeones del Torneo:\n");
        resultadosTextArea.append("1. Goku\n");
        resultadosTextArea.append("2. Vegeta\n");
        resultadosTextArea.append("3. Gohan\n");
    }

    private void cargarImagen() {
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Imagenes", "jpg", "png", "jpeg");
        fileChooser.setFileFilter(filter);

        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            ImageIcon imageIcon = new ImageIcon(selectedFile.getAbsolutePath());
            imagenLabel.setIcon(imageIcon);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DragonBallSuperApp().setVisible(true);
            }
        });
    }
}

public class DragonBallSuper {
    public static void main(String[] args) {
        DragonBallSuperApp app = new DragonBallSuperApp();
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                app.setVisible(true);
            }
        });
    }
}
