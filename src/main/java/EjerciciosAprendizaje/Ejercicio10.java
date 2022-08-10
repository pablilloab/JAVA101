package EjerciciosAprendizaje;

/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el limite");
        int limite = read.nextInt();

        int suma = 0;
        while (suma <= limite) {
            System.out.println("Ingrese un numero");
            suma += read.nextInt();
        }
        System.out.println("La suma fue de " + suma);
    }
}

