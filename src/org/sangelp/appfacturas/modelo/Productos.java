package org.sangelp.appfacturas.modelo;

public class Productos {

    private int codigo;
    private String nombre;
    private float precio;



    // CODIGO

    public int getCodigo(){
        return codigo;
    }

    //NOMBRE

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    //PRECIO

    public void setPrecio(float precio){
        this.precio = precio;
    }

    public float getPrecio(){
        return precio;
    }

    public void codigoproducto(){
        codigo++;
    }

}
