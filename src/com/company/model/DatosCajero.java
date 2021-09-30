package com.company.model;

public class DatosCajero {

    private String tipo;
    private int cantidad;
    private double denominacion;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(float denominacion) {
        this.denominacion = denominacion;
    }

    @Override
    public String toString() {
        return "DatosCajero{" +
                "tipo='" + tipo + '\'' +
                ", cantidad=" + cantidad +
                ", denominacion=" + denominacion +
                '}';
    }
}
