/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.retolistatipada;

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

public class RetoListaTipada {
    public static void main(String[] args) {
        // Crear una "Lista Tipada" para los niveles de poder de los Saiyajines
        List<Integer> nivelesPoderSaiyajines = new ArrayList<>();
        nivelesPoderSaiyajines.add(1000); // Nivel de poder de Goku
        nivelesPoderSaiyajines.add(1500); // Nivel de poder de Vegeta
        nivelesPoderSaiyajines.add(800);  // Nivel de poder de Gohan
        nivelesPoderSaiyajines.add(1200); // Nivel de poder de Trunks

        // Mostrar el nivel de poder de Gohan
        int nivelGohan = nivelesPoderSaiyajines.get(2); // Gohan está en la posición 2 (índice 2)
        System.out.println("|Politecnico Internacional | Retos Dragon");
        System.out.println("|Profesor: Harol Torres | Harol.Torres@pi.edu.co");
        System.out.println("El nivel de poder de Gohan es: " + nivelGohan);
    }
}

