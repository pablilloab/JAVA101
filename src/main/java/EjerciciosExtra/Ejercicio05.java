package EjerciciosExtra;

/*
Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
 */


import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        double montoConDescuento = 0;
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese tipo de socio (A / B / C)");
        String tipoSocio = read.nextLine();
        System.out.println("Ingrese el monto de la prestación");
        double monto = read.nextDouble();

        switch (tipoSocio.toLowerCase()){
            case "a" -> montoConDescuento = (monto - (monto * 0.50));
            case "b" -> montoConDescuento = (monto - (monto * 0.35));
            case "c" -> montoConDescuento = monto;
        }
        System.out.println("El monto a pagar es :" + montoConDescuento);
    }
}
