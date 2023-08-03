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

class DragonBallLogoApp extends JFrame {
    public DragonBallLogoApp() {
        setTitle("Dragon Ball Logo");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        ImageIcon logoImage = new ImageIcon("/imagenes/dragonball_logo.jpg");
        JLabel imageLabel = new JLabel(logoImage);
        
        JButton exitButton = new JButton("Salir");
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(imageLabel, BorderLayout.CENTER);
        panel.add(exitButton, BorderLayout.SOUTH);

        add(panel);
    }
}

public class DragonBallLogo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DragonBallLogoApp().setVisible(true);
            }
        });
    }
}
