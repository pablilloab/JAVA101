package EjerciciosAprendizaje;

import java.util.Scanner;

/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int centigrados = read.nextInt();
        int fahrenheit = 32 + ((9 * centigrados) / 5);

        System.out.println("La conversion de " + centigrados + " Centigrados a Fahrenheit es de " + fahrenheit );
    }
}
