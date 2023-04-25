package com.hedima.presentacion;

import java.util.HashSet;
import java.util.Set;

public class Ejercicio_1 {
    public static void main(String[] args) {
        //Definir un Set con la clase HashSet(), y añadir los elementos: Buenas noches, 5, 8.5, 5, Calificación.
        //Mostrar los elementos con el método toString y mostrar de que clase son

        System.out.println("Ejercicio 1");

        Set conjunto = new HashSet();
        conjunto.add("Buenas noches");
        conjunto.add(5);
        conjunto.add(8.5);
        conjunto.add(5);
        conjunto.add("Calificación");

        System.out.println(conjunto);

        System.out.println("\nBucle for: ");
        for (Object elemento : conjunto) {
            System.out.println("El elemento " + elemento.toString() + " es del tipo " + elemento.getClass());
        }
    }
}