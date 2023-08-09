/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dragonballlogo;

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

// Clase que extiende JFrame para mostrar la aplicación
class DragonBallLogoApp extends JFrame {
    public DragonBallLogoApp() {
        // Configurar la ventana principal
        setTitle("| Politecnico Internacional | Dragon Ball Logo |"); // Título de la ventana
        setSize(800, 600); // Tamaño de la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Cerrar la aplicación al cerrar la ventana
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla

        // Cargar la imagen del logo de Dragon Ball
        ImageIcon logoImage = new ImageIcon("dragonball_logo.jpg");
        JLabel imageLabel = new JLabel(logoImage);

        // Crear el botón "Salir" con lambda expression
        JButton exitButton = new JButton("Salir");
        exitButton.addActionListener(e -> System.exit(0)); // Cerrar la aplicación al hacer clic en el botón

        // Crear un panel con diseño BorderLayout y imagen de fondo
        JPanel panel = new JPanel(new BorderLayout()) {
            // Sobreescribir el método paintComponent para dibujar la imagen de fondo
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Cargar y dibujar la imagen de fondo en el panel
                g.drawImage(new ImageIcon("background_image.jpg").getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };

        // Agregar el logotipo de Dragon Ball al centro del panel
        panel.add(imageLabel, BorderLayout.CENTER);
        // Agregar el botón "Salir" en la parte inferior del panel
        panel.add(exitButton, BorderLayout.SOUTH);

        add(panel); // Agregar el panel a la ventana
    }
}

// Clase principal que contiene el método main
public class DragonBallLogo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DragonBallLogoApp().setVisible(true)); // Crear una instancia de la aplicación y hacerla visible
    }
}
