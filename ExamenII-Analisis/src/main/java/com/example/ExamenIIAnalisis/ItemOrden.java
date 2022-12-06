package com.example.ExamenIIAnalisis;

public class ItemOrden {
    private int idItemOrden;
    private int cantidad;
    private float precioUnitario;
    private Producto producto;

    public ItemOrden(int idItemOrden, int cantidad, float precioUnitario, Producto producto) {
        this.setIdItemOrden(idItemOrden);
        this.setCantidad(cantidad);
        this.setPrecioUnitario(precioUnitario);
        this.setProducto(producto);
    }

    public int getIdItemOrden() {
        return idItemOrden;
    }

    public void setIdItemOrden(int idItemOrden) {
        this.idItemOrden = idItemOrden;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

}

