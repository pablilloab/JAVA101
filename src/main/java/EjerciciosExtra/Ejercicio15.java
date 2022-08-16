package EjerciciosExtra;


import java.util.Scanner;

/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.

 */
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num1 = read.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = read.nextInt();
        System.out.println("Ingrese la opercacion deseada: (sum, res, mul, div)");
        read.nextLine();
        String operacion = read.nextLine();

        if (operacion.equals("sum")){
            System.out.println(sumar(num1,num2));
        }
        if (operacion.equals("res")){
            System.out.println(restar(num1,num2));
        }
        if (operacion.equals("null")){
            System.out.println(multiplicar(num1,num2));
        }
        if (operacion.equals("div")){
            System.out.println(dividir(num1,num2));
        }
    }

    public static int sumar (int num1, int num2){
        return num1 + num2;
    }
    public static int multiplicar (int num1, int num2){
        return num1 * num2;
    }
    public static int restar (int num1, int num2){
        return num1 - num2;
    }
    public static double dividir (double num1, double num2){
        return num1 / num2;
    }




}
