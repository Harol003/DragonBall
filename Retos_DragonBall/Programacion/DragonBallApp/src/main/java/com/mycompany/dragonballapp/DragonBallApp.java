/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dragonballapp;

/**
 *
 * @author Harol
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class DragonBallApp extends JFrame {
    private JTabbedPane tabbedPane;

    public DragonBallApp() {
        setTitle("Dragon Ball Z App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        tabbedPane = new JTabbedPane();
        add(tabbedPane);

        addCharacterPositionTab();
        addPowerLevelSelectorTab();
        addParticipantsRegistrationTab();
        addHeroesVillainsTab();
        addSagaEventsTab();
        addBattleAgainstMajinBuuTab();
        addTrainingTimeTab();
        addDragonBallSearchTab();

        setLocationRelativeTo(null); // Centrar la ventana en la pantalla
    }

    private void addCharacterPositionTab() {
        JPanel panel = new JPanel(new BorderLayout());

        DefaultListModel<String> characterListModel = new DefaultListModel<>();
        characterListModel.addElement("Goku");
        characterListModel.addElement("Vegeta");
        characterListModel.addElement("Gohan");

        JList<String> characterList = new JList<>(characterListModel);
        JScrollPane scrollPane = new JScrollPane(characterList);

        JButton showPositionButton = new JButton("Mostrar Posición");
        JLabel positionLabel = new JLabel("Posición:");

        showPositionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = characterList.getSelectedIndex();
                if (selectedIndex != -1) {
                    positionLabel.setText("Posición: " + (selectedIndex + 1));
                }
            }
        });

        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(showPositionButton, BorderLayout.SOUTH);
        panel.add(positionLabel, BorderLayout.NORTH);

        tabbedPane.addTab("Posición Ordinal", panel);
    }

    private void addPowerLevelSelectorTab() {
        JPanel panel = new JPanel(new BorderLayout());

        String[] saiyajinNames = {"Goku", "Vegeta", "Gohan", "Trunks"};
        JComboBox<String> saiyajinComboBox = new JComboBox<>(saiyajinNames);
        JLabel powerLevelLabel = new JLabel("Nivel de Poder:");

        saiyajinComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedSaiyajin = (String) saiyajinComboBox.getSelectedItem();
                int powerLevel = obtenerNivelDePoder(selectedSaiyajin); // Implementa la lógica real aquí
                powerLevelLabel.setText("Nivel de Poder: " + powerLevel);
            }
        });

        panel.add(saiyajinComboBox, BorderLayout.CENTER);
        panel.add(powerLevelLabel, BorderLayout.NORTH);

        tabbedPane.addTab("Niveles de Poder", panel);
    }

    private void addParticipantsRegistrationTab() {
        JPanel panel = new JPanel(new BorderLayout());

        DefaultTableModel participantsTableModel = new DefaultTableModel(
                new String[]{"Nombre", "Edad", "Técnica"}, 0);

        JTable participantsTable = new JTable(participantsTableModel);
        JScrollPane scrollPane = new JScrollPane(participantsTable);

        JTextField nameField = new JTextField(15);
        JTextField ageField = new JTextField(5);
        JTextField techniqueField = new JTextField(20);
        JButton addButton = new JButton("Agregar");

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String age = ageField.getText();
                String technique = techniqueField.getText();
                participantsTableModel.addRow(new String[]{name, age, technique});
                nameField.setText("");
                ageField.setText("");
                techniqueField.setText("");
            }
        });

        panel.add(scrollPane, BorderLayout.CENTER);

        JPanel inputPanel = new JPanel(new GridLayout(4, 2));
        inputPanel.add(new JLabel("Nombre:"));
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Edad:"));
        inputPanel.add(ageField);
        inputPanel.add(new JLabel("Técnica:"));
        inputPanel.add(techniqueField);
        inputPanel.add(new JLabel());
        inputPanel.add(addButton);

        panel.add(inputPanel, BorderLayout.SOUTH);

        tabbedPane.addTab("Participantes", panel);
    }

    private void addHeroesVillainsTab() {
        JPanel panel = new JPanel(new GridLayout(1, 2));

        DefaultListModel<String> heroesListModel = new DefaultListModel<>();
        heroesListModel.addElement("Goku");
        heroesListModel.addElement("Gohan");
        heroesListModel.addElement("Vegeta");

        JList<String> heroesList = new JList<>(heroesListModel);
        JScrollPane heroesScrollPane = new JScrollPane(heroesList);

        DefaultListModel<String> villainsListModel = new DefaultListModel<>();
        villainsListModel.addElement("Freezer");
        villainsListModel.addElement("Cell");
        villainsListModel.addElement("Majin Buu");

        JList<String> villainsList = new JList<>(villainsListModel);
        JScrollPane villainsScrollPane = new JScrollPane(villainsList);

        JTextArea selectedCharacterTextArea = new JTextArea(5, 20);
        selectedCharacterTextArea.setEditable(false);

        JButton showSelectedButton = new JButton("Mostrar Seleccionado");
        showSelectedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedHero = heroesList.getSelectedValue();
                String selectedVillain = villainsList.getSelectedValue();
                String selectedText = "Héroe seleccionado: " + selectedHero + "\nVillano seleccionado: " + selectedVillain;
                selectedCharacterTextArea.setText(selectedText);
            }
        });

        panel.add(heroesScrollPane);
        panel.add(villainsScrollPane);

        JPanel buttonPanel = new JPanel(new BorderLayout());
        buttonPanel.add(showSelectedButton, BorderLayout.NORTH);
        buttonPanel.add(selectedCharacterTextArea, BorderLayout.CENTER);

        panel.add(buttonPanel);

        tabbedPane.addTab("Héroes y Villanos", panel);
    }

    private void addSagaEventsTab() {
        JPanel panel = new JPanel(new BorderLayout());

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Saga de Namekusei");

        DefaultMutableTreeNode ginyuNode = new DefaultMutableTreeNode("Llegada de las Fuerzas Ginyu");
        DefaultMutableTreeNode ssjNode = new DefaultMutableTreeNode("Transformación en Super Saiyajin");

        root.add(ginyuNode);
        root.add(ssjNode);

        JTree sagaEventsTree = new JTree(root);
        JScrollPane treeScrollPane = new JScrollPane(sagaEventsTree);

        panel.add(treeScrollPane, BorderLayout.CENTER);

        tabbedPane.addTab("Eventos en Saga", panel);
    }

    private void addBattleAgainstMajinBuuTab() {
        JPanel panel = new JPanel(new BorderLayout());

        String[] characters = {"Goku", "Vegeta", "Gohan", "Goten", "Trunks", "Piccolo"};
        String[] objects = {"Espada Z", "Orejas de Potara", "Bomba de Luz", "Fusion Dance"};
        String[] places = {"Planeta Tierra", "Sala del Espíritu y el Tiempo", "Kaioshin Realm"};

        DefaultListModel<String> characterListModel = new DefaultListModel<>();
        for (String character : characters) {
            characterListModel.addElement(character);
        }

        DefaultComboBoxModel<String> objectComboBoxModel = new DefaultComboBoxModel<>(objects);

        JList<String> characterList = new JList<>(characterListModel);
        JComboBox<String> objectComboBox = new JComboBox<>(objectComboBoxModel);
        JCheckBox placeCheckBox = new JCheckBox("Planeta Tierra");

        JButton showInfoButton = new JButton("Mostrar Información");
        JTextArea infoTextArea = new JTextArea(5, 30);
        infoTextArea.setEditable(false);

        showInfoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedCharacter = characterList.getSelectedValue();
                String selectedObject = (String) objectComboBox.getSelectedItem();
                String selectedPlace = placeCheckBox.isSelected() ? "Planeta Tierra" : "";
                String info = "Personaje: " + selectedCharacter + "\nObjeto: " + selectedObject +
                        "\nLugar: " + selectedPlace;
                infoTextArea.setText(info);
            }
        });

        panel.add(characterList, BorderLayout.WEST);
        panel.add(objectComboBox, BorderLayout.CENTER);
        panel.add(placeCheckBox, BorderLayout.EAST);

        JPanel buttonPanel = new JPanel(new BorderLayout());
        buttonPanel.add(showInfoButton, BorderLayout.NORTH);
        buttonPanel.add(infoTextArea, BorderLayout.CENTER);

        panel.add(buttonPanel, BorderLayout.SOUTH);

        tabbedPane.addTab("Batalla contra Majin Buu", panel);
    }

    private void addTrainingTimeTab() {
        JPanel panel = new JPanel(new BorderLayout());

        JProgressBar trainingProgressBar = new JProgressBar(0, 100);
        JButton startTrainingButton = new JButton("Comenzar Entrenamiento");
        startTrainingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 0; i <= 100; i++) {
                            trainingProgressBar.setValue(i);
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException ex) {
                                ex.printStackTrace();
                            }
                        }
                    }
                }).start();
            }
        });

        panel.add(trainingProgressBar, BorderLayout.CENTER);
        panel.add(startTrainingButton, BorderLayout.SOUTH);

        tabbedPane.addTab("Entrenamiento en Sala", panel);
    }

    private void addDragonBallSearchTab() {
        JPanel panel = new JPanel(new BorderLayout());

        JTextField searchField = new JTextField(15);
        JButton searchButton = new JButton("Buscar");
        JTextArea resultTextArea = new JTextArea(5, 20);
        resultTextArea.setEditable(false);

        // Simulación de coordenadas de las esferas
        Map<Integer, String> dragonBallCoordinates = new HashMap<>();
        dragonBallCoordinates.put(1, "Coordenadas 1");
        dragonBallCoordinates.put(2, "Coordenadas 2");
        dragonBallCoordinates.put(3, "Coordenadas 3");

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int dragonBallNumber = Integer.parseInt(searchField.getText());
                String coordinates = dragonBallCoordinates.get(dragonBallNumber);
                if (coordinates != null) {
                    resultTextArea.setText("Esfera " + dragonBallNumber + ": " + coordinates);
                } else {
                    resultTextArea.setText("Esfera no encontrada");
                }
            }
        });

        JPanel inputPanel = new JPanel(new FlowLayout());
        inputPanel.add(new JLabel("Número de Esfera:"));
        inputPanel.add(searchField);
        inputPanel.add(searchButton);

        panel.add(inputPanel, BorderLayout.NORTH);
        panel.add(resultTextArea, BorderLayout.CENTER);

        tabbedPane.addTab("Buscador de Esferas", panel);
    }

    private int obtenerNivelDePoder(String saiyajin) {
        // Implementa la lógica para obtener el nivel de poder de un saiyajin
        // Retorna el nivel de poder correspondiente
        return 9000; // Ejemplo
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DragonBallApp app = new DragonBallApp();
            app.setVisible(true);
        });
    }
}
