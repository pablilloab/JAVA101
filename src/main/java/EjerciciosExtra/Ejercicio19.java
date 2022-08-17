package EjerciciosExtra;

/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
 */

public class Ejercicio19 {
    public static void main(String[] args) {
        int[] vector1 = new int[] {5,3,2};
        int[] vector2 = new int[] {5,3,2};

        if (compararVectores(vector1, vector2)){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }
    }

    public static boolean compararVectores (int[] vector1, int[] vector2){
        if (vector1.length != vector2.length){
            return false;
        }else{
            for (int i = 0; i < vector1.length; i++){
                if (vector1[i] != vector2[i] ){
                    return false;
                }
            }
        }
        return true;
    }
}
