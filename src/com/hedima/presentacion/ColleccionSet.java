package com.hedima.presentacion;

import com.hedima.modelo.Persona;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Handler;

public class ColleccionSet {
    public static void main(String[] args) {
        Set conjunto = new HashSet();
        conjunto.add("Hola Mundo");
        conjunto.add(5);
        conjunto.add(6.6);
        conjunto.add(new Persona("ana",19));
        conjunto.add("Hola Mundo");
        System.out.println(conjunto.toString());
        for (Object element : conjunto) {
            System.out.println(element.toString());
        }
    }
}
