package com.example.ExamenIIAnalisis;

import java.util.Date;
import java.util.List;

public class Orden{
    private int numOrden;
    private Date fechaOrden;
    private Cliente Cliente;
    private List<ItemOrden> itemes;

    public Orden(int numOrden, Date fechaOrden, Cliente cliente, List<ItemOrden> itemes) {
        this.setNumOrden(numOrden);
        this.setFechaOrden(fechaOrden);
        setCliente(cliente);
        this.setItemes(itemes);
    }

    public int getNumOrden() {
        return numOrden;
    }

    public void setNumOrden(int numOrden) {
        this.numOrden = numOrden;
    }

    public Date getFechaOrden() {
        return fechaOrden;
    }

    public void setFechaOrden(Date fechaOrden) {
        this.fechaOrden = fechaOrden;
    }

    public com.example.ExamenIIAnalisis.Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(com.example.ExamenIIAnalisis.Cliente cliente) {
        Cliente = cliente;
    }

    public List<ItemOrden> getItemes() {
        return itemes;
    }

    public void setItemes(List<ItemOrden> itemes) {
        this.itemes = itemes;
    }
}