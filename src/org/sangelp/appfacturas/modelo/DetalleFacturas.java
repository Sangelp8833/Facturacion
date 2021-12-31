package org.sangelp.appfacturas.modelo;

public class DetalleFacturas {

    private  int cantidad;
    private Productos producto;
    private float total = 0;
    private float granTotal = 0;

    // CANTIDAD
    public int getCantidad(){
        return cantidad;
    }

    public void setCantidad(int cantidades){
        this.cantidad = cantidades;
    }

    //PRODUCTOS

    public Productos getProducto() {
        return producto;
    }

    public void setProducto (Productos producto){
        this.producto = producto;
    }

    //TOTAL POR LINEA
    public float getTotal(float p ,int cantidades){
        p = producto.getPrecio();
        return  total = p * cantidades;
    }

    //TOTAL FACTURA COMPLETA
    public float getGranTotal(float total){
        granTotal += total;
        return granTotal;
    }
}
