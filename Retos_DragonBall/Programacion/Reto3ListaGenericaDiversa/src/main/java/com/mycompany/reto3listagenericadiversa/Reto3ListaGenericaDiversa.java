/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reto3listagenericadiversa;

/**
 *
 * @author Harol
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Reto3ListaGenericaDiversa extends JFrame {
    private DefaultTableModel tableModel;
    private JTable participantsTable;

    public Reto3ListaGenericaDiversa() {
        setTitle("|Politecnico Internacional | Dragon Ball Registro de Participantes |");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla

        String[] columnNames = {"Nombre", "Edad", "Técnica"};
        tableModel = new DefaultTableModel(columnNames, 0);

        participantsTable = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(participantsTable);

        add(scrollPane, BorderLayout.CENTER);

        addParticipant("Goku", 30, "Kamehameha");
        addParticipant("Vegeta", 35, "Final Flash");
        addParticipant("Piccolo", 28, "Makankosappo");
        addParticipant("Krillin", 29, "Destructo Disc");

        JPanel buttonPanel = new JPanel();
        JButton addButton = new JButton("Agregar Participante");
        addButton.addActionListener(e -> addParticipantDialog());
        buttonPanel.add(addButton);

        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void addParticipant(String name, int age, String technique) {
        Object[] row = {name, age, technique};
        tableModel.addRow(row);
    }

    private void addParticipantDialog() {
        JTextField nameField = new JTextField(10);
        JTextField ageField = new JTextField(5);
        JTextField techniqueField = new JTextField(15);

        JPanel panel = new JPanel(new GridLayout(0, 1));
        panel.add(new JLabel("Nombre:"));
        panel.add(nameField);
        panel.add(new JLabel("Edad:"));
        panel.add(ageField);
        panel.add(new JLabel("Técnica:"));
        panel.add(techniqueField);

        int result = JOptionPane.showConfirmDialog(null, panel, "Agregar Participante",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (result == JOptionPane.OK_OPTION) {
            String name = nameField.getText();
            int age = Integer.parseInt(ageField.getText());
            String technique = techniqueField.getText();

            addParticipant(name, age, technique);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Reto3ListaGenericaDiversa frame = new Reto3ListaGenericaDiversa();
            frame.setVisible(true);
        });
    }
}
