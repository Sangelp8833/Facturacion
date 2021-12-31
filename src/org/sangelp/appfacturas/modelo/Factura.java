package org.sangelp.appfacturas.modelo;

import java.util.Date;

public class Factura {


    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private DetalleFacturas[] items;


    public Factura(String descripcion, Cliente cliente){
        this.descripcion = descripcion;
        this.cliente = cliente;
    }


    // DESCRIPCIÓN
    public String getDescripcion() {
        return descripcion;
    }


    // FECHA
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    //CLIENTE

    public Cliente getCliente() {
        return cliente;
    }

    // ITEMS
    public DetalleFacturas[] getItems() {
        return items;
    }


}
