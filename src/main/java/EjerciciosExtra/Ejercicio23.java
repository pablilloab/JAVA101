package EjerciciosExtra;

/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random().
 */

import java.util.Random;
import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String[][] sopaLetras = new String[20][20];
        String palabra = "";

        inicializarSopa(sopaLetras); //coloco * para validar posicion libre

        for (int i = 0; i < 5; i++){
            System.out.println("Ingrese la palabra numero " + (i + 1));
            palabra = read.nextLine();
            while(!validarPalabra(palabra)){
                System.out.println("Ingrese la palabra numero (debe tener entre 3 - 5 caracteres) " + (i + 1));
                palabra = read.nextLine();
            }
            cargarPalabraALaSopa(palabra, sopaLetras);
        }

        completarMatriz(sopaLetras);
        mostrarMatriz(sopaLetras);
    }


    public static void inicializarSopa (String[][] sopaLetras){
        for (int i = 0; i < sopaLetras[0].length; i++){
            for (int j = 0; j < sopaLetras[0].length; j++){
                sopaLetras[i][j] = "*";
            }
        }
    }
    public static boolean validarPalabra(String palabra){
        if (palabra.length() < 3 || palabra.length() > 5){
            return false;
        }
        return true;
    }

    public static void cargarPalabraALaSopa(String palabra, String[][] sopaLetras){
        int filaParaInsertar = buscarFilaDisponible(sopaLetras);
        for (int i = 0; i < palabra.length(); i++){
            sopaLetras[filaParaInsertar][i] = palabra.substring(i, (i + 1));//i + 1 en substring por el ultimo indice excluye
        }
    }

    public static int buscarFilaDisponible (String[][] sopaLetras){
        Random random = new Random();
        int filaAleatoria = random.nextInt(19);

        while(!sopaLetras[filaAleatoria][0].equals("*")){
            filaAleatoria = random.nextInt(19);
        }
        return filaAleatoria;
    }

    public static void completarMatriz (String[][] sopaLetras){
        Random random = new Random();
        for (int i = 0; i < sopaLetras[0].length; i++){
            for (int j = 0; j < sopaLetras[0].length; j++){
                if (sopaLetras[i][j].equals("*") ) {
                    sopaLetras[i][j] = String.valueOf(random.nextInt(1,9));
                }
            }
        }
    }

    public static void mostrarMatriz (String[][] sopaLetras){
        for (int i = 0; i < sopaLetras[0].length; i++){
            for (int j = 0; j < sopaLetras[0].length; j++){
                System.out.print(sopaLetras[i][j]);
            }
            System.out.println("");
        }
    }

}
