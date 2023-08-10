/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.logindragonball;

/**
 *
 * @author Harol
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginDragonBall {
    // Ventanas para la pantalla de inicio de sesión y la tabla de personajes
    private JFrame loginFrame;
    private JFrame mainFrame;

    // Campos de texto para el nombre de usuario y contraseña, y botón de inicio de sesión
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    // Datos de los personajes en forma de matriz
    private String[][] characterData = {
            {"Goku", "Saiyan", "Kamehameha", "9000"},
            {"Vegeta", "Saiyan", "Final Flash", "8500"},
            {"Picoro", "Namekian", "Special Beam Cannon", "3500"},
            {"Gohan", "Saiyan", "Masenko", "6000"}
    };

    // Constructor de la aplicación
    public LoginDragonBall() {
        createLoginFrame();
    }

    // Crear la ventana de inicio de sesión
    private void createLoginFrame() {
        loginFrame = new JFrame("| Politecnico Internacional | Dragon Ball APP |");
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setSize(300, 150);
        loginFrame.setLayout(new GridLayout(3, 2));
        loginFrame.setLocationRelativeTo(null);

        // Crear campos de texto y botón de inicio de sesión
        usernameField = new JTextField();
        passwordField = new JPasswordField();
        loginButton = new JButton("Iniciar Sesion");

        // Agregar etiquetas, campos de texto y botón a la ventana de inicio de sesión
        loginFrame.add(new JLabel("Usuario:"));
        loginFrame.add(usernameField);
        loginFrame.add(new JLabel("Contraseña:"));
        loginFrame.add(passwordField);
        loginFrame.add(new JLabel());
        loginFrame.add(loginButton);

        // Agregar acción al botón de inicio de sesión
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                char[] password = passwordField.getPassword();

                // Lógica de autenticación
                if (username.equals("poli") && new String(password).equals("colombia")) {
                    loginFrame.dispose();
                    createMainFrame();
                } else {
                    JOptionPane.showMessageDialog(loginFrame, "Usuario o Contraseña Incorrecta.");
                }
            }
        });

        loginFrame.setVisible(true);
    }

    // Crear la ventana principal con la tabla de personajes
    private void createMainFrame() {
        mainFrame = new JFrame("| Politecnico Internacion | DragonBall - Personajes |");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(400, 300);
        mainFrame.setLayout(new BorderLayout());
        mainFrame.setLocationRelativeTo(null);

        // Nombres de las columnas de la tabla
        String[] columnNames = {"Nombre", "Raza", "Tecnica Especial", "Nivel de Poder"};
        // Crear la tabla con los datos de los personajes
        JTable table = new JTable(characterData, columnNames);

        // Agregar la tabla a un panel con barra de desplazamiento
        JScrollPane scrollPane = new JScrollPane(table);
        mainFrame.add(scrollPane, BorderLayout.CENTER);

        mainFrame.setVisible(true);
    }

    // Método principal para iniciar la aplicación
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginDragonBall(); // Crear una instancia de la aplicación
            }
        });
    }
}
