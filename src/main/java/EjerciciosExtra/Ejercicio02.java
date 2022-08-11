package EjerciciosExtra;

/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        int a,b,c,d,aux;
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el valor de A");
        a = read.nextInt();
        System.out.println("Ingrese el valor de B");
        b = read.nextInt();
        System.out.println("Ingrese el valor de C");
        c = read.nextInt();
        System.out.println("Ingrese el valor de D");
        d = read.nextInt();

        System.out.println(" A inicial " + a + " B Inicial " + b + " C Inicial " + c + " D Inicial " + d);
        aux = b;
        b = c;
        c = a;
        a = d;
        d = aux;
        System.out.println(" A final " + a + " B final " + b + " C final " + c + " D final " + d);

    }
}
