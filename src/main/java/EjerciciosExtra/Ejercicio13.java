package EjerciciosExtra;

/*
Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:
 */

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la altura de la escalera");
        int alturaEscalera = read.nextInt();

        for (int i = 1; i <= alturaEscalera; i++){
            for (int j = 1; j < i; j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }


}
