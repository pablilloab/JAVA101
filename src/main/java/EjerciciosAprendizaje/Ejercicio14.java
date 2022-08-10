package EjerciciosAprendizaje;

/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €
 */

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Euros");
        double euros = read.nextInt();
        System.out.println("Ingrese la moneda a convertir (dolar, yen, libra)");
        read.nextLine();
        String monedaConvertir = read.nextLine();
        convertir(euros, monedaConvertir);
    }

    public static void convertir(double euros, String monedaConvertir) {
        double libra = 0.86;
        double dolar = 1.28611;
        double yen = 129.852;

        switch (monedaConvertir){
            case "libra":
                System.out.println("Son " + euros * libra + " libras");
                break;
            case "dolar":
                System.out.println("Son " + euros * dolar + " dolares");
                break;
            case "yen":
                System.out.println("Son " + euros * yen + " yenes");
            default:
                System.out.println("Error no conocido");
                break;
        }
    }
}
