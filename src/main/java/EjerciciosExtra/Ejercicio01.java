package EjerciciosExtra;

import java.util.Scanner;

/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese los minutos");
        int minutos = read.nextInt();
        int horas = minutos / 60;
        int dias = horas - 24;
        int cantidadDias = 1;
        while (dias > 24){
            dias = dias - 24;
            cantidadDias++;
        }
        System.out.println("Son " + cantidadDias + " dias " + dias + " horas");

    }
}
