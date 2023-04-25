package com.hedima.presentacion;

import com.hedima.modelo.MenorEdad;
import com.hedima.modelo.Persona;

public class Main {
    public static void main(String[] args) {

        Persona p=new Persona("Juan Lopez",24);
        try {
            p.comprobarEdad();
        } catch (MenorEdad e) {
            System.out.println(e.getMessage());
        }
    }
}