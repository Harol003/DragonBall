/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.retolistagenerica;

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

public class RetoListaGenerica {
    public static void main(String[] args) {
        // Crear una "Lista Genérica" para almacenar héroes y villanos
        List<String> personajesDBZ = new ArrayList<>();
        personajesDBZ.add("Goku");
        personajesDBZ.add("Vegeta");
        personajesDBZ.add("Piccolo");
        personajesDBZ.add("Freezer");
        personajesDBZ.add("Cell");

        // Mostrar los nombres de todos los personajes
        System.out.println("|Politecnico Internacional | Retos Dragon");
        System.out.println("|Profesor: Harol Torres | Harol.Torres@pi.edu.co");
        System.out.println("Personajes de Dragon Ball Z:");
        for (String personaje : personajesDBZ) {
            System.out.println(personaje);
        }
    }
}
