package com.hedima.presentacion;
import java.util.ArrayList;
import java.util.List;
public class ProbarList {
    public static void main(String[] args) {

        List lista=new ArrayList();
        System.out.println("La lista esta vacia "+lista.isEmpty());
        lista.add("Hola");
        lista.add(5);
        lista.add(3.15);
        lista.add("Hola");
        lista.add(true);
        System.out.println(lista);

        for (Object element : lista) {
            System.out.println(element.toString());
        }
        System.out.println("La lista esta vacia "+lista.isEmpty());
        System.out.println("La Lista contiende elemento "+lista.contains("Hola"));
        System.out.println("La lista contiende elemento "+lista.contains("Buenos dias"));
        System.out.println("Dame el indice del elemento "+lista.indexOf("Hola"));
        System.out.println("Dame el indice del elemento "+lista.lastIndexOf("Hola"));
        System.out.println("Obtener el elemento por posicion la 3 "+ lista.get(3));
        System.out.println("----------------------------------------------------------------");
        lista.set(3,"Buenos dias");
        System.out.println(lista);
        System.out.println("Lista de elementos "+lista.size());



    }
}
