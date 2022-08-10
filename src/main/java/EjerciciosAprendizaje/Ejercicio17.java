package EjerciciosAprendizaje;

/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int cantidad = read.nextInt();
        int[] vector = new int[cantidad];
        cargarVector(vector);
        contabilizarDigios(vector);

    }

    public static void cargarVector (int[] vector) {
        for (int i = 0; i < vector.length; i++){
            Scanner read =new Scanner(System.in);
            System.out.println("Ingrese un valor");
            vector[i] = read.nextInt();
        }
    }

    public static void contabilizarDigios (int[] vector) {
        int unD = 0, dosD = 0, tresD = 0, cuatroD = 0, cincoD = 0;
        for (int num : vector) {
            switch (buscarDigitos(num)) {
                case 1:
                    unD++;
                    break;
                case 2:
                    dosD++;
                    break;
                case 3:
                    tresD++;
                    break;
                case 4:
                    cuatroD++;
                    break;
                case 5:
                    cincoD++;
                    break;
            }
        }
        System.out.println("1 digito: " + unD + "| 2 digitos " + dosD + "| 3 digitos " + tresD + "| 4 digitos " + cuatroD + "| 5 digitos " + cincoD);
    }

    public static int buscarDigitos (int numero) {
        int count = 0;
        while (numero != 0) {
            numero /= 10;
            count ++;
        }
        return count;
    }
}
