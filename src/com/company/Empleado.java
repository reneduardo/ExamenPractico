package com.company;

public abstract class Empleado {
    private String nombre;
    private String apellido;
    private String nombreCompleto;

    Empleado(String nombre, String apellido){
    this.nombre = nombre;
    this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public abstract void imprimirNombre();
}
