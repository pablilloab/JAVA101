package EjerciciosAprendizaje;

/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
 */

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos");
        int elementos = read.nextInt();
        for (int filas = 0; filas < elementos; filas++){
            for (int columnas = 0; columnas < elementos; columnas++){
                if(filas == 0 || filas == elementos - 1 || columnas == 0 || columnas == elementos - 1 ) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
