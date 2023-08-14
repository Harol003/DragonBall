/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reto5listaenlazada;

/**
 *
 * @author Harol
 */
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class Reto5ListaEnlazada extends JFrame {
    private JTree eventsTree;

    public Reto5ListaEnlazada() {
        setTitle("|Politecnico Internacional | Dragon Ball | Eventos en la Saga Namekusei");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla

        DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("Saga de Namekusei");

        DefaultMutableTreeNode ginyuNode = new DefaultMutableTreeNode("Llegada de las Fuerzas Ginyu");
        ginyuNode.add(new DefaultMutableTreeNode("Ginyu cambia de cuerpo"));
        ginyuNode.add(new DefaultMutableTreeNode("Combate contra los Guerreros Z"));
        rootNode.add(ginyuNode);

        DefaultMutableTreeNode superSaiyanNode = new DefaultMutableTreeNode("Transformación en Super Saiyajin");
        superSaiyanNode.add(new DefaultMutableTreeNode("Goku alcanza el Super Saiyajin"));
        superSaiyanNode.add(new DefaultMutableTreeNode("Combate contra Freezer"));
        rootNode.add(superSaiyanNode);

        eventsTree = new JTree(rootNode);

        JScrollPane scrollPane = new JScrollPane(eventsTree);

        add(scrollPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Reto5ListaEnlazada frame = new Reto5ListaEnlazada();
            frame.setVisible(true);
        });
    }
}

