package EjerciciosAprendizaje;

/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int tamanoMatriz = read.nextInt();
        int[][] matriz = new int[tamanoMatriz][tamanoMatriz];

        cargarMatriz(matriz);
        if (esMagica(matriz)){
            System.out.println("La matriz es magica");
        } else {
            System.out.println("La matriz no es magica");
        }

    }

    public static void cargarMatriz (int[][] matriz){
        Scanner read = new Scanner(System.in);
        for (int fila = 0; fila < matriz[0].length; fila++){
            for (int columna = 0; columna < matriz[0].length; columna++){
                System.out.println("Ingrese un numero");
                int numero = read.nextInt();
                while (!esNumeroValido(numero)){
                    System.out.println("Ingrese un numero valido");
                    numero = read.nextInt();
                }
                matriz[fila][columna] = numero;
            }
        }
    }

    public static boolean esNumeroValido (int numero){
        if (numero >= 1 && numero <= 9){
            return true;
        }else{
            return false;
        }
    }
    public static boolean esMagica (int[][] matriz) {
        boolean magica = true;
        int flagDiagonalSecundaria = matriz[0].length;
        int valorComparable = sumaFilaColumna(matriz[0]);
        for (int fila = 1; fila < matriz[0].length;fila++){
            for (int columna = 0; columna < matriz[0].length; columna ++){
                //TODO buscar y sumar por diagonales
            }
        }


    }

    public static int sumaFilaColumna (int[] serieNumeros){
        int suma = 0;
        for (int item : serieNumeros){
            suma += item;
        }
        return suma;
    }
}
