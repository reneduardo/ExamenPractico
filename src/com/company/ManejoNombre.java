package com.company;

public class ManejoNombre extends Empleado{

    public ManejoNombre(String nombre, String apellido){
        super(nombre, apellido);
    }

    @Override
    public void imprimirNombre(){
       this.setNombreCompleto(getNombre() + " " + getApellido());
        System.out.println("\nEl nombre completo del empleado es: " + getNombreCompleto().toUpperCase());
    }
}
