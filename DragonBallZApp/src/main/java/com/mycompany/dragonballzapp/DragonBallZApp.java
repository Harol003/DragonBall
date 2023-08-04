/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dragonballzapp;

/**
 *
 * @author Harol
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class DragonBallZApp {
    // Ventana para la pantalla de inicio de sesión
    private JFrame loginFrame;
    // Ventana para mostrar la lista de personajes
    private JFrame mainFrame;

    // Campos de texto para el nombre de usuario y contraseña
    private JTextField usernameField;
    private JPasswordField passwordField;
    // Botón de inicio de sesión
    private JButton loginButton;

    // Mapa para almacenar los personajes y sus niveles de poder
    private Map<String, Integer> characters;

    // Constructor de la aplicación
    public DragonBallZApp() {
        characters = new HashMap<>();
        characters.put("Goku", 9000);
        characters.put("Vegeta", 8500);
        characters.put("Picoro", 3500);
        characters.put("Gohan", 6000);

        // Crear la ventana de inicio de sesión al iniciar la aplicación
        createLoginFrame();
    }

    // Crear la ventana de inicio de sesión
    private void createLoginFrame() {
        loginFrame = new JFrame("| Politecnico Internacional | DragonBallZ - Login |");
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setSize(300, 150);
        loginFrame.setLayout(new GridLayout(3, 2));
        loginFrame.setLocationRelativeTo(null);

        usernameField = new JTextField();
        passwordField = new JPasswordField();
        loginButton = new JButton("Iniciar Sesion");

        // Etiqueta y campo de texto para el nombre de usuario
        loginFrame.add(new JLabel("Usuario:"));
        loginFrame.add(usernameField);
        // Etiqueta y campo de contraseña para la contraseña
        loginFrame.add(new JLabel("Contraseña:"));
        loginFrame.add(passwordField);
        // Espacio en blanco
        loginFrame.add(new JLabel());
        // Botón de inicio de sesión
        loginFrame.add(loginButton);

        // Agregar acción al botón de inicio de sesión
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                char[] password = passwordField.getPassword();

                // Realizar lógica de autenticación aquí (por ejemplo, usuario y contraseña predefinidos)
                if (username.equals("Poli") && new String(password).equals("Colombia2023.")) {
                    loginFrame.dispose();
                    // Crear la ventana principal si la autenticación es exitosa
                    createMainFrame();
                } else {
                    JOptionPane.showMessageDialog(loginFrame, "Usuario o Contraseña Invalida.");
                }
            }
        });

        loginFrame.setVisible(true);
    }

    // Crear la ventana principal para mostrar los personajes
    private void createMainFrame() {
        mainFrame = new JFrame("|Politecnico Internacional | DragonBallZ - Personajes |");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(300, 200);
        // Diseño de cuadrícula para mostrar los personajes y sus poderes
        mainFrame.setLayout(new GridLayout(characters.size(), 2));
        mainFrame.setLocationRelativeTo(null);

        // Agregar etiquetas para cada personaje y su poder al diseño de cuadrícula
        for (String character : characters.keySet()) {
            JLabel nameLabel = new JLabel(character);
            JLabel powerLabel = new JLabel("Nivel de Poder: " + characters.get(character));

            mainFrame.add(nameLabel);
            mainFrame.add(powerLabel);
        }

        mainFrame.setVisible(true);
    }

    // Método principal para iniciar la aplicación
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DragonBallZApp();
            }
        });
    }
}
