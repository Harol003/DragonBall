/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reto4listagenerica;

/**
 *
 * @author Harol
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reto4ListaGenerica extends JFrame {
    private JList<String> heroesList;
    private JList<String> villanosList;
    private JTextArea selectedCharacterArea;

    private String[] heroes = {"Goku", "Gohan", "Vegeta", "Piccolo"};
    private String[] villanos = {"Freezer", "Cell", "Majin Buu", "Raditz"};

    public Reto4ListaGenerica() {
        setTitle("|Politecnico Internacional | Dragon Ball  |  Héroes y Villanos de Dragon Ball Z");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla

        heroesList = new JList<>(heroes);
        heroesList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        heroesList.addListSelectionListener(e -> showSelectedCharacter());

        villanosList = new JList<>(villanos);
        villanosList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        villanosList.addListSelectionListener(e -> showSelectedCharacter());

        selectedCharacterArea = new JTextArea();
        selectedCharacterArea.setEditable(false);

        JPanel listsPanel = new JPanel(new GridLayout(1, 2));
        listsPanel.add(new JScrollPane(heroesList));
        listsPanel.add(new JScrollPane(villanosList));

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(listsPanel, BorderLayout.CENTER);
        mainPanel.add(selectedCharacterArea, BorderLayout.SOUTH);

        add(mainPanel);
    }

    private void showSelectedCharacter() {
        String selectedHero = heroesList.getSelectedValue();
        String selectedVillain = villanosList.getSelectedValue();

        if (selectedHero != null) {
            selectedCharacterArea.setText("Héroe seleccionado: " + selectedHero);
        } else if (selectedVillain != null) {
            selectedCharacterArea.setText("Villano seleccionado: " + selectedVillain);
        } else {
            selectedCharacterArea.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Reto4ListaGenerica frame = new Reto4ListaGenerica();
            frame.setVisible(true);
        });
    }
}

