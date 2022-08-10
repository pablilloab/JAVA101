package EjerciciosAprendizaje;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingresa tu frase");
        String frase = read.nextLine();

        System.out.println("Tu frase en mayusculas: " + frase.toUpperCase());
        System.out.println("Tu frase en minusculas: " + frase.toLowerCase());
    }
}
