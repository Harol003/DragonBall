/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dragonballz;



/**
 *
 * @author Harol
 */
// Politecnico Internacional
// Programacion I
// Prof. Harol Torres
// Harol.Torres@pi.edu.co
// Ciclo: 27 de Julio, 2023

// Definición de la clase PersonajeDragonBallZ
class PersonajeDragonBallZ {
    private String nombre;
    private String raza;
    private String estado;
    private int poder;
   

    // Constructor para inicializar los atributos del personaje
    public PersonajeDragonBallZ(String nombre, String raza, int poder, String estado) {
        this.nombre = nombre;
        this.raza = raza;
        this.poder = poder;
        this.estado = estado;
        
    }

    // Métodos getter para obtener los atributos del personaje
    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public int getPoder() {
        return poder;
    }
    
       public String getestado() {
        return estado;
    }
    

    // Métodos setter para modificar los atributos del personaje
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }
    
        public void setestado(String estado) {
        this.estado = estado;
    }


    // Método para mostrar información del personaje
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Raza: " + raza);
        System.out.println("Poder: " + poder);
        System.out.println("Estado Actual: " + estado);
        System.out.println("*******************************");
    }
}

// Clase principal DragonBallZ
public class DragonBallZ {
    public static void main(String[] args) {
        // Crear instancias de personajes
        PersonajeDragonBallZ goku = new PersonajeDragonBallZ("Goku", "Saiyan", 10000, "Ganador");
        PersonajeDragonBallZ vegeta = new PersonajeDragonBallZ("Vegeta", "Saiyan", 9000, "Ganador");
        PersonajeDragonBallZ Cell = new PersonajeDragonBallZ("Cell", "Bioandroide", 6000, "Derrotado");
        PersonajeDragonBallZ Frizer  = new PersonajeDragonBallZ("Frizer", "Arcosiano", 7000, "Derrotado");
        PersonajeDragonBallZ Boo = new PersonajeDragonBallZ("Boo", "Majin", 9000, "Derrotado");
        PersonajeDragonBallZ gohan = new PersonajeDragonBallZ("Gohan", "Saiyan", 6000, "Ganador");

        // Mostrar información inicial
          System.out.println("===============================");
        System.out.println("POLITECNICO INTERNACIONAL");
          System.out.println("===============================");
        System.out.println("APP DRAGON BALL Z");
          System.out.println("===============================");
        System.out.println("INF. PODER ANTES DE ENTRENAR:");
        goku.mostrarInfo();
        vegeta.mostrarInfo();
        Cell.mostrarInfo();
        Frizer.mostrarInfo();
        Boo.mostrarInfo();
        gohan.mostrarInfo();
        

        // Modificar atributos usando setters
        goku.setPoder(15000);
        vegeta.setPoder(14000);
        vegeta.setRaza("Saiyan Príncipe");

        // Mostrar información después de la modificación
          System.out.println("===============================");
        System.out.println("INF. NIVEL DE PODER DESPUES DE ENTRENAR:");
        goku.mostrarInfo();
        vegeta.mostrarInfo();
          System.out.println("===============================");
        System.out.println("PROGRAMACION I");
          System.out.println("===============================");
        System.out.println("Prof. Harol Torres -  Email: Harol.Torres@pi.edu.co");
    }
}