package EjerciciosExtra;

/*
Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Generando el numero aleatorio...");
        double aleatorio = Math.round(Math.random() * 10) * Math.round(Math.random() * 10);
        int intentos = 1;

        System.out.println("Ingresa un numero");
        double numeroIngresado = read.nextDouble();

        while (numeroIngresado != aleatorio){
            if (numeroIngresado > aleatorio){
                System.out.println("Ne ne ne...ingresaste un numero mayor");
            }else{
                System.out.println("Ne ne ne..ingresaste un numero menor");
            }
            intentos++;
            numeroIngresado = read.nextDouble();
        }
        System.out.println("Felicidades! el numero era " + aleatorio + " lo conseguiste en " + intentos + " intentos");


    }
}
