package EjerciciosAprendizaje;

/*
Crear un programa que dado un numero determine si es par o impar.
 */

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingresa un numero para ver si es par");
        int numero = read.nextInt();

        if (numero % 2 == 0){
            System.out.println("El numero ingresado es par");
        } else {
            System.out.println("El numero ingresado no es par");
        }
    }
}
