package EjerciciosAprendizaje;

/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa)
 */

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int[][] matrizTraspuesta = new int[4][4];

        cargarMatriz(matriz);
        System.out.println("Matriz original");
        mostrarMatriz(matriz);
        trasponerMatriz(matriz, matrizTraspuesta);
        System.out.println("Matriz traspuesta");
        mostrarMatriz(matrizTraspuesta);
    }

    public static void cargarMatriz(int[][] matriz){
        Scanner read = new Scanner(System.in);
        for(int fila = 0; fila < 4; fila ++){
            for (int columna = 0; columna < 4; columna ++){
                System.out.println("Ingrese un numero");
                matriz[fila][columna] = read.nextInt();
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz){
        for(int fila = 0; fila < 4; fila ++){
            for (int columna = 0; columna < 4; columna ++) {
                System.out.print(matriz[fila][columna] + "|");
            }
            System.out.println("");
        }
    }

    public static void trasponerMatriz(int[][] matriz, int[][] matrizTraspuesta){
        for(int fila = 0; fila < 4; fila ++){
            for (int columna = 0; columna < 4; columna ++) {
                matrizTraspuesta[columna][fila] = matriz[fila][columna];
            }
        }
    }
}