package org.sangelp.appfacturas.modelo;

public class Cliente {

    private String nombre;
    private String rut;

    public Cliente(String nombre, String rut){
        this.nombre = nombre;
        this.rut = rut;
    }

    // NOMBRE

    public String getNombre(){
        return nombre;
    }

    // RUT

    public String getRut(){
        return rut;
    }


}
