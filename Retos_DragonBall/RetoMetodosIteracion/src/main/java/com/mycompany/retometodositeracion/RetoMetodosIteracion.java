/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.retometodositeracion;

/**
 *
 * @author Harol
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class EsferaDeDragon {
    int numero;
    String coordenadas;

    public EsferaDeDragon(int numero, String coordenadas) {
        this.numero = numero;
        this.coordenadas = coordenadas;
    }
}

public class RetoMetodosIteracion {
    public static void main(String[] args) {
        // Crear una lista con las coordenadas de las Esferas de Dragón
        List<EsferaDeDragon> esferasDeDragon = new ArrayList<>();
        esferasDeDragon.add(new EsferaDeDragon(1, "10,20"));
        esferasDeDragon.add(new EsferaDeDragon(2, "30,40"));
        esferasDeDragon.add(new EsferaDeDragon(3, "50,60"));
        esferasDeDragon.add(new EsferaDeDragon(4, "70,80"));
        esferasDeDragon.add(new EsferaDeDragon(5, "90,100"));
        esferasDeDragon.add(new EsferaDeDragon(6, "110,120"));
        esferasDeDragon.add(new EsferaDeDragon(7, "130,140"));

        // Método para buscar una Esfera de Dragón por su número
        int numeroEsferaBuscada = 3;
        Optional<EsferaDeDragon> esferaBuscada = buscarEsferaPorNumero(esferasDeDragon, numeroEsferaBuscada);

        // Mostrar información de la Esfera de Dragón buscada
        if (esferaBuscada.isPresent()) {
            EsferaDeDragon esferaEncontrada = esferaBuscada.get();
            System.out.println("Esfera de Dragón #" + esferaEncontrada.numero + " encontrada en coordenadas: " + esferaEncontrada.coordenadas);
        } else {
            System.out.println("Esfera de Dragón #" + numeroEsferaBuscada + " no encontrada.");
        }
    }

    // Método para buscar una Esfera de Dragón por su número
    private static Optional<EsferaDeDragon> buscarEsferaPorNumero(List<EsferaDeDragon> listaEsferas, int numero) {
        return listaEsferas.stream()
                .filter(esfera -> esfera.numero == numero)
                .findFirst();
    }
}
