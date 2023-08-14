/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.retolistaenlazada;

/**
 *
 * @author Harol
 */
// Politecnico Internacional
// Programacion I
// Prof. Harol Torres
// Harol.Torres@pi.edu.co
// Ciclo: 27 de Julio, 2023

public class RetoListaEnlazada {
    public static void main(String[] args) {
        // Crear la "Lista Enlazada" para la saga de Namekusei
        NodoEvento inicio = new NodoEvento("Llegada de las Fuerzas Ginyu");
        NodoEvento segundo = new NodoEvento("Goku vence a las Fuerzas Ginyu");
        NodoEvento tercero = new NodoEvento("Deseo de las Bolas de Dragón");
        NodoEvento cuarto = new NodoEvento("Transformación de Goku en Super Saiyajin");

        // Enlazar los nodos
        inicio.siguiente = segundo;
        segundo.siguiente = tercero;
        tercero.siguiente = cuarto;

        // Mostrar los eventos de la saga de Namekusei
        System.out.println("|Politecnico Internacional | Retos Dragon");
        System.out.println("|Profesor: Harol Torres | Harol.Torres@pi.edu.co");
        System.out.println("Eventos de la saga de Namekusei:");
        NodoEvento actual = inicio;
        while (actual != null) {
            System.out.println(actual.evento);
            actual = actual.siguiente;
        }
    }
}
