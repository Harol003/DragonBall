/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// Character.java
package model;

public class Character {
    private String name;
    private String race;
    private int powerLevel;
    private int speed;
    private int defense;
    private String description;
    private String imagePath;

    public Character(String name, String race, int powerLevel, int speed, int defense, String description, String imagePath) {
        this.name = name;
        this.race = race;
        this.powerLevel = powerLevel;
        this.speed = speed;
        this.defense = defense;
        this.description = description;
        this.imagePath = imagePath;
    }

    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDefense() {
        return defense;
    }

    public String getDescription() {
        return description;
    }

    public String getImagePath() {
        return imagePath;
    }
}
