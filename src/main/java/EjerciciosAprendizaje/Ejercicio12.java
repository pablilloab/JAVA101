package EjerciciosAprendizaje;

/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int correctas = 0, incorrectas = 0;
        String cadenaLeida;

        do {
            System.out.println("Ingrese su cadena");
            cadenaLeida = read.nextLine();
            if ((cadenaLeida.startsWith("X") && cadenaLeida.endsWith("O") && cadenaLeida.length() <= 5) || cadenaLeida.equals("&&&&&")) {
                correctas++;
            }else{
                incorrectas++;
            }

        }while(!cadenaLeida.equals("&&&&&"));

        System.out.println("CORRECTAS: " + correctas + "(contando la cadena de escape &&&&&)");
        System.out.println("INCORRECTAS: " + incorrectas);
    }
}
