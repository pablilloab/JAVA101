package EjerciciosExtra;

/*
Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división. Nota: recordar que las variables de tipo entero truncan los números o
resultados.
 */

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int numero = read.nextInt();
        int cantidadDigitos = 0;
        while(numero > 0){
            numero /= 10;
            cantidadDigitos++;
        }
        System.out.println("La cantidad de digitos del numero ingresado es de " + cantidadDigitos);
    }
}
