package EjerciciosAprendizaje;

/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */

public class Ejercicio15 {
    public static void main(String[] args) {
        int[] enteros = new int[100];
        completarVector(enteros);
        mostrarDescendente(enteros);

    }

    public static void completarVector(int[] enteros) {
        for (int i = 0; i < enteros.length; i++){
            enteros[i] = i + 1;
        }
    }

    public static void mostrarDescendente (int[] enteros) {
        for (int i = enteros.length - 1; i >= 0; i--){
            System.out.print(" " + enteros[i] + " ");
        }
    }
}
