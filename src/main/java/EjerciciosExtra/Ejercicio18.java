package EjerciciosExtra;

/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario.
 */

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros");
        int tamanoVector = read.nextInt();
        int[] vector = new int[tamanoVector];
        cargarVector(vector);
        sumarValores(vector);
    }

    public static void cargarVector (int[] vector){
        Scanner read = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++){
            System.out.println("Ingrese un numero");
            vector[i] = read.nextInt();
        }
    }

    public static void sumarValores (int[] vector){
        int sumaTotal = 0;
        for (int i = 0; i < vector.length; i++){
            sumaTotal += vector[i];
        }
        System.out.println("La suma total es " + sumaTotal);
    }
}
