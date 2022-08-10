package EjerciciosAprendizaje;
/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla
 */

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nombre = read.nextLine();

        System.out.println("Hola " + nombre);
    }
}
