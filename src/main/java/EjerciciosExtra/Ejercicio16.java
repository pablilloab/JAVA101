package EjerciciosExtra;

/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        ingresarPersonas();
        System.out.println("Nos vemos");
    }

    public static void ingresarPersonas(){
        int edad = 0;
        String nombre = "";
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la persona");
        nombre = read.nextLine();
        while (!nombre.equals("NO")){
            System.out.println("Ingrese la edad de la persona");
            edad = read.nextInt();
            esMenor(nombre, edad);
            System.out.println("Ingrese nuevamente un nombre o NO para salir");
            read.nextLine();
            nombre = read.nextLine();
        }
    }

    public static void esMenor(String nombre, int edad){
        if (edad > 18){
            System.out.println(nombre + " es mayor de edad");
        }else{
            System.out.println(nombre + " es menor de edad");
        }
    }
}
