/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reto2listatipada;

/*
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
import java.util.HashMap;
import java.util.Map;

public class Reto2ListaTipada extends JFrame {
    private JComboBox<String> saiyanSelector;
    private JLabel powerLabel;

    private Map<String, Integer> saiyanPowers;

    public Reto2ListaTipada() {
        setTitle("|Politecnico Internacional | Dragon Ball Selector de Niveles de Poder |");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 150);
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla

        saiyanPowers = new HashMap<>();
        saiyanPowers.put("Goku", 10000);
        saiyanPowers.put("Vegeta", 9000);
        saiyanPowers.put("Gohan", 2500);
        saiyanPowers.put("Trunks", 4000);
        saiyanPowers.put("Goten", 3000);

        saiyanSelector = new JComboBox<>(saiyanPowers.keySet().toArray(new String[0]));
        saiyanSelector.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedSaiyan = (String) saiyanSelector.getSelectedItem();
                if (selectedSaiyan != null) {
                    int power = saiyanPowers.get(selectedSaiyan);
                    powerLabel.setText("Nivel de poder: " + power);
                }
            }
        });

        powerLabel = new JLabel();

        JPanel panel = new JPanel(new FlowLayout());
        panel.add(saiyanSelector);
        panel.add(powerLabel);

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Reto2ListaTipada frame = new Reto2ListaTipada();
            frame.setVisible(true);
        });
    }
}
