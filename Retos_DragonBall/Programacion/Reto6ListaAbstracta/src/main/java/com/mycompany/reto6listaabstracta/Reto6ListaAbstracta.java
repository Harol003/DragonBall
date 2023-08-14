/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reto6listaabstracta;

/**
 *
 * @author Harol
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Reto6ListaAbstracta extends JFrame {
    private DefaultTableModel tableModel;
    private JTable charactersTable;
    private JList<String> objectsList;

    public Reto6ListaAbstracta() {
        setTitle("|Politecnico Internacional | Dragon Ball | Información de la Batalla contra Majin Buu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla

        String[] columnNames = {"Personaje", "Rol"};
        tableModel = new DefaultTableModel(columnNames, 0);

        charactersTable = new JTable(tableModel);
        charactersTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane tableScrollPane = new JScrollPane(charactersTable);

        List<String> objects = new ArrayList<>();
        objects.add("Fusion Potara");
        objects.add("Espada Z");
        objects.add("Bomba de Luz");
        objects.add("Sello de Absorción");

        objectsList = new JList<>(objects.toArray(new String[0]));
        objectsList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane listScrollPane = new JScrollPane(objectsList);

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, tableScrollPane, listScrollPane);
        splitPane.setDividerLocation(250);

        add(splitPane, BorderLayout.CENTER);

        addCharacter("Goku", "Luchador");
        addCharacter("Vegeta", "Luchador");
        addCharacter("Gotenks", "Fusión");
        addCharacter("Hercule", "Humano");

        objectsList.addListSelectionListener(e -> showSelectedObject());
    }

    private void addCharacter(String name, String role) {
        Object[] row = {name, role};
        tableModel.addRow(row);
    }

    private void showSelectedObject() {
        String selectedObject = objectsList.getSelectedValue();
        if (selectedObject != null) {
            JOptionPane.showMessageDialog(this, "Objeto seleccionado: " + selectedObject,
                    "Objeto Relacionado", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Reto6ListaAbstracta frame = new Reto6ListaAbstracta();
            frame.setVisible(true);
        });
    }
}
