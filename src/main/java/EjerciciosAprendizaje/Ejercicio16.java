package EjerciciosAprendizaje;

/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int cantidad = read.nextInt();
        int[] vector = new int[cantidad];
        cargarVector(vector);

        System.out.println("Ingrese el valor buscado");
        int valorBuscado = read.nextInt();
        buscarValor(vector, valorBuscado);
    }

    public static void cargarVector (int[] vector) {

        for (int i = 0; i < vector.length; i++){
            vector[i] = (int) (Math.random() * 100);
        }
    }

    public static void buscarValor (int[] vector, int valorBuscado) {
        boolean encontrado = false;
        for (int i = 0; i < vector.length; i++) {

            if (vector[i] == valorBuscado) {
                System.out.println("Valor encontrado en la posicion " + i);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("El valor no se encontro");
        }
    }
}
