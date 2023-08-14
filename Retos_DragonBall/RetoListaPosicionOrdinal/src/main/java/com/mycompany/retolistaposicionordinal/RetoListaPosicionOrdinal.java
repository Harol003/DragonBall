/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.retolistaposicionordinal;

/**
 *
 * @author Harol
 */
// Politecnico Internacional
// Programacion I
// Prof. Harol Torres
// Harol.Torres@pi.edu.co
// Ciclo: 27 de Julio, 2023

import java.util.ArrayList;
import java.util.List;

public class RetoListaPosicionOrdinal {
    public static void main(String[] args) {
        // Crear una "Lista Posición Ordinal" para los Guerreros Z
        List<String> guerrerosZ = new ArrayList<>();
        guerrerosZ.add("Goku");
        guerrerosZ.add("Gohan");
        guerrerosZ.add("Piccolo");
        guerrerosZ.add("Vegeta");
        guerrerosZ.add("Trunks");
        guerrerosZ.add("Goten");

        // Mostrar cada nombre con su posición en el equipo
        System.out.println("|Politecnico Internacional | Retos Dragon");
         System.out.println("|Profesor: Harol Torres | Harol.Torres@pi.edu.co");
        System.out.println("Desafío de los Guerreros Z:");
        for (int i = 0; i < guerrerosZ.size(); i++) {
            int posicion = i + 1; // Sumar 1 para que las posiciones comiencen desde 1
            String nombre = guerrerosZ.get(i);
            System.out.println("Posición " + posicion + ": " + nombre);
        }
    }
}
