/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dragonballzgui;


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

// Clase que representa un personaje de Dragon Ball Z
class Personaje {
    private String nombre;
    private int poder;

    // Constructor
    public Personaje(String nombre, int poder) {
        this.nombre = nombre;
        this.poder = poder;
    }

    // Métodos get y set para el nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos get y set para el poder
    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }
}

// Clase que representa la interfaz gráfica de la aplicación
class DragonBallZApp extends JFrame {
    private JLabel nombreLabel;
    private JLabel poderLabel;
    private JTextField nombreTextField;
    private JTextField poderTextField;
    private JButton mostrarButton;

    public DragonBallZApp() {
        setTitle("Dragon Ball Z App");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        nombreLabel = new JLabel("Nombre:");
        poderLabel = new JLabel("Poder:");
        nombreTextField = new JTextField(20);
        poderTextField = new JTextField(10);
        mostrarButton = new JButton("Mostrar");

        mostrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crear un objeto Personaje con los datos ingresados
                String nombre = nombreTextField.getText();
                int poder = Integer.parseInt(poderTextField.getText());

                Personaje personaje = new Personaje(nombre, poder);

                // Mostrar información del personaje en una ventana emergente
                JOptionPane.showMessageDialog(DragonBallZApp.this,
                        "Nombre: " + personaje.getNombre() + "\n" +
                        "Poder: " + personaje.getPoder(),
                        "Información del Personaje",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        setLayout(new GridLayout(3, 2));
        add(nombreLabel);
        add(nombreTextField);
        add(poderLabel);
        add(poderTextField);
        add(new JLabel()); // Espacio en blanco
        add(mostrarButton);
    }
}

public class DragonBallZGUI {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DragonBallZApp().setVisible(true);
            }
        });
    }
}
