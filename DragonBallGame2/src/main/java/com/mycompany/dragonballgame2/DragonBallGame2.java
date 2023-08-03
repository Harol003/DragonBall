/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dragonballgame2;

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
import java.util.HashMap;
import java.util.Map;

class Personaje {
    private String nombre;
    private String raza;
    private int nivelPelea;
    private int velocidad;
    private int nivelDefensa;
    private String descripcion;
    private ImageIcon imagen;

    public Personaje(String nombre, String raza, int nivelPelea, int velocidad, int nivelDefensa, String descripcion, ImageIcon imagen) {
        this.nombre = nombre;
        this.raza = raza;
        this.nivelPelea = nivelPelea;
        this.velocidad = velocidad;
        this.nivelDefensa = nivelDefensa;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public int getNivelPelea() {
        return nivelPelea;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getNivelDefensa() {
        return nivelDefensa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public ImageIcon getImagen() {
        return imagen;
    }
}

class DragonBallGameView extends JFrame {
    private Map<JButton, Personaje> personajeButtonMap = new HashMap<>();
    private JTextArea infoTextArea;
    private JLabel imagenLabel;

    public DragonBallGameView() {
        setTitle("Dragon Ball Game 2");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        infoTextArea = new JTextArea(10, 40);
        imagenLabel = new JLabel();

        // Crear personajes
        Personaje goku = new Personaje("Goku", "Saiyan", 9000, 100, 80,
                "El protagonista de la serie, conocido por su gran corazón y su insaciable apetito.", new ImageIcon("goku.jpg"));
        Personaje vegeta = new Personaje("Vegeta", "Saiyan", 8500, 90, 75,
                "El príncipe de los Saiyan, orgulloso y fuerte.", new ImageIcon("vegeta.jpg"));
        Personaje gohan = new Personaje("Gohan", "Saiyan", 6000, 80, 70,
                "Hijo mayor de Goku, un estudioso con un gran potencial.", new ImageIcon("gohan.jpg"));
        Personaje trunks = new Personaje("Trunks", "Saiyan", 7000, 95, 75,
                "Hijo de Vegeta y Bulma, viaja en el tiempo para cambiar el futuro.", new ImageIcon("trunks.jpg"));
        Personaje bulma = new Personaje("Bulma", "Humana", 100, 30, 20,
                "Genio científico y amiga cercana de Goku.", new ImageIcon("bulma.jpg"));

        // Crear botones para cada personaje
        JButton gokuButton = new JButton("Goku");
        JButton vegetaButton = new JButton("Vegeta");
        JButton gohanButton = new JButton("Gohan");
        JButton trunksButton = new JButton("Trunks");
        JButton bulmaButton = new JButton("Bulma");

        // Mapear botones a personajes
        personajeButtonMap.put(gokuButton, goku);
        personajeButtonMap.put(vegetaButton, vegeta);
        personajeButtonMap.put(gohanButton, gohan);
        personajeButtonMap.put(trunksButton, trunks);
        personajeButtonMap.put(bulmaButton, bulma);

        for (JButton button : personajeButtonMap.keySet()) {
            buttonPanel.add(button);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    mostrarInformacion(personajeButtonMap.get(button));
                }
            });
        }

        add(buttonPanel, BorderLayout.NORTH);
        add(new JScrollPane(infoTextArea), BorderLayout.CENTER);
        add(imagenLabel, BorderLayout.SOUTH);
    }

    private void mostrarInformacion(Personaje personaje) {
        infoTextArea.setText("Nombre: " + personaje.getNombre() + "\n");
        infoTextArea.append("Raza: " + personaje.getRaza() + "\n");
        infoTextArea.append("Nivel de Pelea: " + personaje.getNivelPelea() + "\n");
        infoTextArea.append("Velocidad: " + personaje.getVelocidad() + "\n");
        infoTextArea.append("Nivel de Defensa: " + personaje.getNivelDefensa() + "\n");
        infoTextArea.append("Descripción: " + personaje.getDescripcion() + "\n");

        // Mostrar imagen del personaje
        imagenLabel.setIcon(personaje.getImagen());
    }
}

class DragonBallGameController {
    private DragonBallGameView vista;

    public DragonBallGameController(DragonBallGameView vista) {
        this.vista = vista;
    }

    public void iniciar() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                vista.setVisible(true);
            }
        });
    }
}

public class DragonBallGame2 {
    public static void main(String[] args) {
        DragonBallGameView vista = new DragonBallGameView();
        DragonBallGameController controlador = new DragonBallGameController(vista);
        controlador.iniciar();
    }
}
