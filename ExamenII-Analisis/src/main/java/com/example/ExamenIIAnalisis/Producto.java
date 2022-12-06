package com.example.ExamenIIAnalisis;

public class Producto {
    private int idProducto;
    private String descripcion;
    private float precio;


    public Producto(int idProducto, String descripcion, float precio) {
        this.setIdProducto(idProducto);
        this.setDescripcion(descripcion);
        this.setPrecio(precio);
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
