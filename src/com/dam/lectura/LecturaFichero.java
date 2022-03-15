package com.dam.lectura;

import java.io.*;
import java.util.*;


public class LecturaFichero {

    public static void crearPalabra(List<String> palabras){
        File fichero = new File("palabras.txt");

        try{
            Scanner leer = new Scanner(fichero);
            while (leer.hasNext()){
                palabras.add(leer.next());
            }
            leer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
