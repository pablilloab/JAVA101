package EjerciciosExtra;

/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int cantidad = 0;
        int pares = 0;
        int impares = 0;
        System.out.println("Ingrese un numero");
        int num = read.nextInt();

        while(num % 5 != 0){
            cantidad++;
            if (num > 0){
                if (num % 2 == 0){
                    pares++;
                }else{
                    impares++;
                }
            }

            System.out.println("Ingrese un numero");
            num = read.nextInt();
        };
        System.out.println("Pares: " + pares + "| Impares: " + impares + "| Total de numeros: " + cantidad);
    }
}
