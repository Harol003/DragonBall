/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dragonballzexample;


/**
 *
 * @author Harol
 */
// Politecnico Internacional
// Programacion I
// Prof. Harol Torres
// Harol.Torres@pi.edu.co
// Ciclo: 27 de Julio, 2023

// Clase abstracta que representa un personaje de Dragon Ball Z
abstract class PersonajeDragonBallZ {
    // Atributos comunes a todos los personajes
    private String nombre;
    private int nivelPoder;

    // Constructor de la clase
    public PersonajeDragonBallZ(String nombre, int nivelPoder) {
        this.nombre = nombre;
        this.nivelPoder = nivelPoder;
    }

    // Método abstracto que representa el ataque especial del personaje
    public abstract void ataqueEspecial();

    // Método concreto que muestra información básica del personaje
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Nivel de Poder: " + nivelPoder);
    }
}

// Clase que representa a un personaje específico de Dragon Ball Z (Goku)
class Goku extends PersonajeDragonBallZ {
    // Constructor de la clase Goku
    public Goku(int nivelPoder) {
        super("Goku", nivelPoder);
    }

    // Implementación del método abstracto ataqueEspecial() para Goku
    @Override
    public void ataqueEspecial() {
        System.out.println("Kamehameha!!!");
    }
}

// Clase que representa a otro personaje específico de Dragon Ball Z (Vegeta)
class Vegeta extends PersonajeDragonBallZ {
    // Constructor de la clase Vegeta
    public Vegeta(int nivelPoder) {
        super("Vegeta", nivelPoder);
    }

    // Implementación del método abstracto ataqueEspecial() para Vegeta
    @Override
    public void ataqueEspecial() {
        System.out.println("Galick Gun!!!");
    }
}

public class DragonBallZExample {
    public static void main(String[] args) {
        // Crear instancias de los personajes Goku y Vegeta
        Goku goku = new Goku(9000);
        Vegeta vegeta = new Vegeta(8500);

        // Mostrar información y realizar ataques especiales
        goku.mostrarInformacion();
        goku.ataqueEspecial();

        System.out.println("--------------------------");

        vegeta.mostrarInformacion();
        vegeta.ataqueEspecial();
    }
}
