/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.retopila;

/**
 *
 * @author Harol
 */
// Politecnico Internacional
// Programacion I
// Prof. Harol Torres
// Harol.Torres@pi.edu.co
// Ciclo: 27 de Julio, 2023

import java.util.Stack;

public class RetoPila {
    public static void main(String[] args) {
        // Crear una "Pila" para simular el tiempo en la Sala del Espíritu y el Tiempo
        Stack<Integer> tiempoEnSala = new Stack<>();
        tiempoEnSala.push(1); // Años de entrenamiento de Gohan
        tiempoEnSala.push(2); // Años de entrenamiento de Goku

        // Calcular el tiempo total en la Sala del Espíritu y el Tiempo
        int tiempoTotal = 0;
        while (!tiempoEnSala.isEmpty()) {
            tiempoTotal += tiempoEnSala.pop();
        }

        // Mostrar el tiempo total en la sala
        System.out.println("|Politecnico Internacional | Retos Dragon");
        System.out.println("|Profesor: Harol Torres | Harol.Torres@pi.edu.co");
        System.out.println("¿Cuanto tiempo estuvo Goku y Gohan en la Sala del Espiritu y el tiempo?");
        System.out.println("Tiempo total en la Sala del Espíritu y el Tiempo: " + tiempoTotal + " años");
    }
}
