package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nombre;
        String apellido;
        System.out.print("Escriba el nombre del empleado: ");
        nombre = scanner.nextLine();
        System.out.print("Escriba el apellido del empleado: ");
        apellido = scanner.nextLine();

        Empleado mn = new ManejoNombre(nombre, apellido);
        mn.imprimirNombre();

    }

}
