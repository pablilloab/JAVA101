package EjerciciosExtra;

/*
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
 */

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner read = new Scanner((System.in));
        System.out.println("Ingrese la cantidad de personas");
        int cantidadPersonas = read.nextInt();
        double altura = 0;
        double suma160 = 0;
        int contador160 = 0;
        double sumaTotal = 0;
        for (int i = 0; i < cantidadPersonas; i++){
            System.out.println("Ingrese la altura de la persona "+ (i + 1));
            altura = read.nextDouble();
            if (altura < 1.60) {
                suma160 += altura;
                contador160 ++;
            }
            sumaTotal += altura;
        }

    }
}
