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
        int[][] matriz10 = new int[][]{{36, 5, 67}, {89, 90, 75}, {14, 22, 26}};
        int[][] matriz3 = new int[][]{{36, 5, 67}, {89, 90, 75}, {14, 22, 26}};

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
        for (int fila = filas; fila < 3; fila++){
            for (int columna = columnas; columna < 3; columna++){
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
