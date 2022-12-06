package com.example.ExamenIIAnalisis;

public class ProductoSoftware extends Producto{

    private String version;

    public ProductoSoftware(int idProducto, String descripcion, float precio, String version) {
        super(idProducto, descripcion, precio);
        this.setVersion(version);
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
