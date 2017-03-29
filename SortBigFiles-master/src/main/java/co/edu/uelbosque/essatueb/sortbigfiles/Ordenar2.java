/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uelbosque.essatueb.sortbigfiles;

import java.util.Comparator;

/**
 *
 * @author fernemod
 */
public class Ordenar2 {

    public static Comparator<Object> PersonaNumDocu = new Comparator<Object>() {

        @Override
        public int compare(Object p1, Object p2) {

            

            int edad1 = ((Persona) p1).getEdad();
            int edad2 = ((Persona) p2).getEdad();

            int i = Integer.compare(edad1, edad2);
            return i;
            /*if (i != 0) {
                return i;
            }
            return Float.compare(numdocumento1, numdocumento2); */
        }
    };

}
