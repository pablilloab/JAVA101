package EjerciciosAprendizaje;

/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */

import java.util.Arrays;
import java.util.Collections;

public class Ejercicio15V2 {
    public static void main(String[] args) {

        Integer[] enteros = new Integer[100];
        completarVector(enteros);

        for (int i = 0; i < enteros.length;i++){
            System.out.print(enteros[i] + " ");
        }

        System.out.println("");

        //mostrarDescendente(enteros);

        Arrays.sort(enteros, Collections.reverseOrder());

        for (int i = 0; i < enteros.length;i++){
            System.out.print(enteros[i] + " ");
        }

    }

    public static void completarVector(Integer[] enteros) {
        for (int i = 0; i < enteros.length; i++){
            enteros[i] = i + 1;
        }
    }

//    public static void mostrarDescendente (Integer[] enteros) {
//        for (int i = enteros.length - 1; i >= 0; i--){
//            System.out.print(" " + enteros[i] + " ");
//        }
//    }
}
