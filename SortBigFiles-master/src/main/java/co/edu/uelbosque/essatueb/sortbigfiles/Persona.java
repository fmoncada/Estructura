/*
 * Apache 2.0
 * Universidad El Bosque  * 
 */
package co.edu.uelbosque.essatueb.sortbigfiles;

import com.sun.org.apache.xml.internal.serializer.ToStream;

/**
 *
 * @author fernemod
 */
public class Persona {
    
    int edad;
    String numDocumento;
    String nombre;
    String tipoDocumento;
    String tipoSangre;
    
    public Persona(int edad, String numDocumento, String nombre, String tipoDocumento, String tipoSangre){
        this.edad = edad;
        this.numDocumento = numDocumento;
        this.nombre = nombre;
        this.tipoDocumento = tipoDocumento;
        this.tipoSangre = tipoSangre;
    
}

    Persona(int edad, String nombre, String tipoDocumento, String tipoSangre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setnumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public int getEdad() {
        return edad;
    }

    public String getnumDocumento() {
        return numDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }
    
    public String tosString() {
        return edad + "," + numDocumento + "," + nombre + "," + tipoDocumento + "," +tipoSangre;
}
    
}
