package EjerciciosAprendizaje;

/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 */

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int numA = read.nextInt();
        System.out.println("Ingrese el segundo numero");
        int numB = read.nextInt();

        int suma = numA + numB;

        System.out.println("La suma de los dos numeros es " + suma);

    }
}
