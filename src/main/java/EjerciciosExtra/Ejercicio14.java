package EjerciciosExtra;

/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
de hijos para averiguar la media de edad de los hijos de todas las familias.
 */

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de familias");
        int cantidadFamilias = read.nextInt();
        int cantidadHijos = 0;
        int cantidadHijosTotales = 0;
        int edad = 0;
        int sumaEdades = 0;
        for(int i = 0; i < cantidadFamilias; i++){
            System.out.println("Ingrese la cantidad de hijos para la familia " + (i +1));
            cantidadHijos = read.nextInt();
            cantidadHijosTotales += cantidadHijos;
            for (int j = 0; j < cantidadHijos; j++){
                System.out.println("Ingrese la edad del hijo " + (j + 1));
                edad = read.nextInt();
                sumaEdades += edad;
            }
        }
        System.out.println("La media de todos los hijos de todas las familias es " + sumaEdades / cantidadHijosTotales);


    }
}
