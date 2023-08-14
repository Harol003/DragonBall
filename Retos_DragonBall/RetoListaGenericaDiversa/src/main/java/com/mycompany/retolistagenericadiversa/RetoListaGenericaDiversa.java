/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.retolistagenericadiversa;

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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RetoListaGenericaDiversa {
    public static void main(String[] args) {
        // Crear una "Lista Genérica Diversa" para los participantes del torneo
        List<Map<String, Object>> participantesTorneo = new ArrayList<>();

        // Agregar información de participantes
        Map<String, Object> participante1 = new HashMap<>();
        participante1.put("nombre", "Goku");
        participante1.put("edad", 35);
        participante1.put("tecnica", "Kamehameha");
        participantesTorneo.add(participante1);

        Map<String, Object> participante2 = new HashMap<>();
        participante2.put("nombre", "Vegeta");
        participante2.put("edad", 37);
        participante2.put("tecnica", "Final Flash");
        participantesTorneo.add(participante2);

        Map<String, Object> participante3 = new HashMap<>();
        participante3.put("nombre", "Krilin");
        participante3.put("edad", 30);
        participante3.put("tecnica", "Kienzan");
        participantesTorneo.add(participante3);

        // Mostrar información de Krilin
        Map<String, Object> infoKrilin = participantesTorneo.get(2); // Krilin está en la posición 2 (índice 2)
        System.out.println("|Politecnico Internacional | Retos Dragon");
        System.out.println("|Profesor: Harol Torres | Harol.Torres@pi.edu.co");
        System.out.println("Información de Krilin:");
        System.out.println("Nombre: " + infoKrilin.get("nombre"));
        System.out.println("Edad: " + infoKrilin.get("edad"));
        System.out.println("Técnica: " + infoKrilin.get("tecnica"));
    }
}
