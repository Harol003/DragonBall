/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reto8metodositeracion;

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

public class Reto8MetodosIteracion extends JFrame {
    private JTextField esferaTextField;
    private JButton buscarButton;
    private JLabel coordenadasLabel;

    private Map<Integer, String> esferasDeDragon;

    public Reto8MetodosIteracion() {
        setTitle("|Politecnico Internacional | Dragon Ball | Buscador de Esferas de Dragón");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 150);
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla

        esferasDeDragon = new HashMap<>();
        esferasDeDragon.put(1, "10,20");
        esferasDeDragon.put(2, "30,40");
        esferasDeDragon.put(3, "50,60");
        esferasDeDragon.put(4, "70,80");
        esferasDeDragon.put(5, "90,100");
        esferasDeDragon.put(6, "110,120");
        esferasDeDragon.put(7, "130,140");

        esferaTextField = new JTextField(10);
        buscarButton = new JButton("Buscar");
        coordenadasLabel = new JLabel();

        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarEsfera();
            }
        });

        JPanel panel = new JPanel(new FlowLayout());
        panel.add(new JLabel("Número de Esfera:"));
        panel.add(esferaTextField);
        panel.add(buscarButton);
        panel.add(coordenadasLabel);

        add(panel);
    }

    private void buscarEsfera() {
        String esferaText = esferaTextField.getText();
        try {
            int numeroEsfera = Integer.parseInt(esferaText);
            String coordenadas = esferasDeDragon.get(numeroEsfera);

            if (coordenadas != null) {
                coordenadasLabel.setText("Coordenadas: " + coordenadas);
            } else {
                coordenadasLabel.setText("Esfera no encontrada.");
            }
        } catch (NumberFormatException ex) {
            coordenadasLabel.setText("Número de esfera inválido.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Reto8MetodosIteracion frame = new Reto8MetodosIteracion();
            frame.setVisible(true);
        });
    }
}
