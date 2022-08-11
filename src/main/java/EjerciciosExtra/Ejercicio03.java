package EjerciciosExtra;

/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String letra = read.nextLine();
        if(letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")){
            System.out.println("Es vocal");
        }else{
            System.out.println("No es vocal");
        }
    }
}
