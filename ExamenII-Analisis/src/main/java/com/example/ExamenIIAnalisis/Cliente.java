package com.example.ExamenIIAnalisis;

public class Cliente{
    private int idCliente;
    private String nombre;
    private String apellidos;

    public Cliente(int idCliente, String nombre, String apellidos) {
        this.setIdCliente(idCliente);
        this.setNombre(nombre);
        this.setApellidos(apellidos);
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}

