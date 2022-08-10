package EjerciciosAprendizaje;

import java.util.Scanner;

/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingresa un numero ");
        int numero = read.nextInt();

        System.out.println("El doble del numero es " + numero * 2 );
        System.out.println("El triple del numero es " + numero * 3);
        System.out.println("La raiz cuadrada del numero es " + Math.sqrt(numero));
    }
}
