package EjerciciosAprendizaje;

/*
 Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.
 */

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        String fraseGuardada = "eureka";
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la frase para comaprar");
        String fraseParaComparar = read.nextLine();

        if (fraseParaComparar.equals(fraseGuardada)) {
            System.out.println("Las frases son iguales");
        } else {
            System.out.println("Las frases son diferentes");
        }
    }
}
