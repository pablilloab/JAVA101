package EjerciciosExtra;

/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
 */

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        String romano = "";
        Scanner read = new Scanner(System.in);
        System.out.println("Ingresa un numero entre 1 y 10");
        int num = read.nextInt();

        //Probando version mejorada del switch
        switch (num) {
            case 1 -> romano = romano.concat("I");
            case 2 -> romano = romano.concat("II");
            case 3 -> romano = romano.concat("III");
            case 4 -> romano = romano.concat("IV");
            case 5 -> romano = romano.concat("V");
            case 6 -> romano = romano.concat("VI");
            case 7 -> romano = romano.concat("VII");
            case 8 -> romano = romano.concat("VIII");
            case 9 -> romano = romano.concat("IX");
            case 10 -> romano = romano.concat("X");
        }
        System.out.println(romano);
    }

}
