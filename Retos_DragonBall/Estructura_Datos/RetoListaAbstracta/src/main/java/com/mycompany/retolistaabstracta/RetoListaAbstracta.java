/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.retolistaabstracta;

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

public class RetoListaAbstracta {
    public static void main(String[] args) {
        // Crear una "Lista Abstracta" para la saga de la batalla contra Majin Buu
        List<Object> elementosBuuSaga = new ArrayList<>();
        elementosBuuSaga.add("Goku");
        elementosBuuSaga.add("Vegeta");
        elementosBuuSaga.add("Gohan");
        elementosBuuSaga.add("Kaioshin");
        elementosBuuSaga.add("Bibidi's Mind Control");

        // Mostrar elementos de la saga de la batalla contra Majin Buu
        System.out.println("|Politecnico Internacional | Retos Dragon");
        System.out.println("|Profesor: Harol Torres | Harol.Torres@pi.edu.co");
        System.out.println("Personajes que participaron en la saga de la batalla contra Majin Buu:");
        for (Object elemento : elementosBuuSaga) {
            System.out.println(elemento);
        }
    }
}
