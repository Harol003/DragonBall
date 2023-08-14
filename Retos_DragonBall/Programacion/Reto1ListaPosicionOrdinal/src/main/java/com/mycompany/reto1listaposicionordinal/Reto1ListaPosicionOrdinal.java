/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reto1listaposicionordinal;

/**
 *
 * @author Harol
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reto1ListaPosicionOrdinal extends JFrame {
    private DefaultListModel<String> model;
    private JList<String> characterList;
    private JLabel positionLabel;

    private String[] warriorsZ = {"Goku", "Gohan", "Piccolo", "Vegeta", "Trunks", "Goten"};

    public Reto1ListaPosicionOrdinal() {
        setTitle("|Politecnico Internacional | Dragon Ball Sistema de Selección de Personajes |");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 200);
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla

        model = new DefaultListModel<>();
        for (String character : warriorsZ) {
            model.addElement(character);
        }

        characterList = new JList<>(model);
        characterList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        characterList.addListSelectionListener(e -> showPosition());

        positionLabel = new JLabel();

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JScrollPane(characterList), BorderLayout.CENTER);
        panel.add(positionLabel, BorderLayout.SOUTH);

        add(panel);
    }

    private void showPosition() {
        int selectedIndex = characterList.getSelectedIndex();
        if (selectedIndex >= 0) {
            int position = selectedIndex + 1; // Sumar 1 para la posición ordinal
            positionLabel.setText("Posición en el equipo: " + position);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Reto1ListaPosicionOrdinal frame = new Reto1ListaPosicionOrdinal();
            frame.setVisible(true);
        });
    }
}
