package EjerciciosAprendizaje;

import java.util.Scanner;

/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.

 */
public class Ejercicio21 {
    public static void main(String[] args) {
        int[][] matriz10 = new int[][]{
                {1,26,36,47,5,6,72,81,95,10},
                {11,12,13,21,41,22,67,20,10,61},
                {56,78,87,90,9,90,17,12,87,67},
                {41,87,24,56,97,74,87,42,64,35},
                {32,76,79,1,36,5,67,96,12,11},
                {99,13,54,88,89,90,75,12,41,76},
                {67,78,87,45,14,22,26,42,56,78},
                {98,45,34,23,32,56,74,16,19,18},
                {24,67,97,46,87,13,67,89,93,24},
                {21,68,78,98,90,67,12,41,65,12}};

        int[][] matriz3 = new int[][]{{36, 5, 67}, {89, 90, 75}, {14, 22, 26}};

        //int[][] matriz10 = new int[10][10];
        //int[][] matriz3 = new int[3][3];
        //System.out.println("Cargar matriz 10 x 10");
        //cargarMatriz(matriz10);
        //System.out.println("Cargar matriz 3 x 3");
        //cargarMatriz(matriz3);

        if (verificarSiEstaContenidaEn(matriz3,matriz10)){
            System.out.println("ESTA CONTENIDA");
        }else{
            System.out.println("NO ESTA CONTENIDA");
        }
    }

    public static void cargarMatriz (int[][] matriz){
        Scanner read = new Scanner(System.in);
        for(int fila = 0; fila < matriz[0].length; fila++){
            for(int columna = 0; columna < matriz[0].length; columna++){
                System.out.println("Ingrese un numero");
                matriz[fila][columna] = read.nextInt();
            }
        }
    }

    public static boolean verificarSiEstaContenidaEn (int[][] matriz3, int[][]matriz10){

        for (int fila = 0; fila < matriz10[0].length; fila++){
            for (int columna = 0; columna < matriz10[0].length; columna++){
                if (matriz10[fila][columna] == matriz3[0][0]){
                    //extraerMatriz(fila, columna, matriz10);
                    if (verificarIgualdad(extraerMatriz(fila, columna, matriz10),matriz3)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static int[][] extraerMatriz (int filas, int columnas,int[][] matriz){
        int [][] matrizExtraida = new int[3][3];
        int contadorFilas = 0 ;
        int contadorColumnas = 0;
        for (int fila = filas; fila < filas + 3; fila++){
            for (int columna = columnas; columna < columnas + 3; columna++){
                matrizExtraida[contadorFilas][contadorColumnas] = matriz[fila][columna];
                contadorColumnas++;
            }
            contadorColumnas = 0;
            contadorFilas++;
        }
        return matrizExtraida;
    }

    public static boolean verificarIgualdad (int[][]matrizExtraida, int[][]matrizBuscada){
        for(int fila = 0; fila < matrizExtraida[0].length; fila++){
            for (int columna = 0; columna < matrizExtraida[0].length; columna++){
                if(matrizExtraida[fila][columna] != matrizBuscada[fila][columna]){
                    return false;
                }
            }
        }
        return true;
    }
}
