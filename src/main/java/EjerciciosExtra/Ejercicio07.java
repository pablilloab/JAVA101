package EjerciciosExtra;

/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
 */

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingresa el tamaño del array");
        int cantidadNumeros = read.nextInt();
        int[] numeros = new int[cantidadNumeros];
        solucionConWhile(numeros);
        solucionConDoWhile(numeros);
    }

    public static void solucionConWhile (int[] numeros){
        cargarNumeros(numeros);
        int max = 0;
        int min = 0;
        double promedio = 0;
        int cantidad = 0;
        int i = 0;
        while (i < numeros.length){
            if (numeros[i] > max || i == 0) {
                max = numeros[i];
            }
            if (numeros[i] < min || i == 0) {
                min = numeros[i];
            }
            if(numeros[i] > 0){
                promedio += numeros[i];
                cantidad ++;
            }
            i++;
        }
        System.out.println("Solucion con while");
        System.out.println("El maximo es: " + max + " el minio es: " + min + " el promedio: " + (promedio/cantidad));
    }

    public static void solucionConDoWhile (int[] numeros){
        cargarNumeros(numeros);
        int max = 0;
        int min = 0;
        double promedio = 0;
        int cantidad = 0;
        int i = 0;
        do{
            if (numeros[i] > max || i == 0) {
                max = numeros[i];
            }
            if (numeros[i] < min || i == 0) {
                min = numeros[i];
            }
            if(numeros[i] > 0){
                promedio += numeros[i];
                cantidad ++;
            }
            i++;
        }while (i < numeros.length);
        System.out.println("Solucion con while");
        System.out.println("El maximo es: " + max + " el minio es: " + min + " el promedio: " + (promedio/cantidad));
    }

    public static void cargarNumeros (int[] numeros){
        Scanner read = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Ingrese un numero");
            numeros[i] = read.nextInt();
        }
    }
}
