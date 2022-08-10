package EjerciciosAprendizaje;

/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa)
 */

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int[][] matrizTraspuesta = new int[3][3];

        cargarMatriz(matriz);
        System.out.println("Matriz original");
        mostrarMatriz(matriz);
        trasponerMatriz(matriz, matrizTraspuesta);
        System.out.println("Matriz traspuesta");
        mostrarMatriz(matrizTraspuesta);
        if (verificarAntiMatriz(matriz, matrizTraspuesta)){
            System.out.println("ES ANTIMATRIZ");
        }else{
            System.out.println("NO ES ANTIMATRIZ");
        }
    }

    public static void cargarMatriz(int[][] matriz){
        Scanner read = new Scanner(System.in);
        for(int fila = 0; fila < matriz[0].length; fila ++){
            for (int columna = 0; columna < 3; columna ++){
                System.out.println("Ingrese un numero");
                matriz[fila][columna] = read.nextInt();
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz){
        for(int fila = 0; fila < matriz[0].length; fila ++){
            for (int columna = 0; columna < matriz[0].length; columna ++) {
                System.out.print(matriz[fila][columna] + "|");
            }
            System.out.println("");
        }
    }

    public static void trasponerMatriz(int[][] matriz, int[][] matrizTraspuesta){
        for(int fila = 0; fila < matriz[0].length; fila ++){
            for (int columna = 0; columna < matriz[0].length; columna ++) {
                matrizTraspuesta[columna][fila] = matriz[fila][columna] * -1;
            }
        }
    }

    public static boolean verificarAntiMatriz (int[][] matriz, int[][] matrizTraspuesta){
        for(int filas = 0; filas < matriz[0].length; filas++){
            for (int columnas = 0; columnas < matriz[0].length; columnas++)
                if (matriz[filas][columnas] != matrizTraspuesta[filas][columnas]){
                    return false;
                }
        }
        return true;
    }
}
