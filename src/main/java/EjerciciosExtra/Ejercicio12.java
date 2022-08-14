package EjerciciosExtra;

public class Ejercicio12 {
    public static void main(String[] args) {
        int centena = 0;
        int decena = 0;
        int unidad = 0;
        while (centena <= 9){

            if (unidad >= 9) {
                unidad = 0;
                decena++;
            }else{
                unidad++;
            }
            if (decena >= 9) {
                decena = 0;
                centena++;
            }
            imprimo(centena, decena, unidad);


        }
    }

    public static void imprimo (int centena, int decena, int unidad){
        String centenaS = "";
        String decenaS = "";
        String unidadS = "";
        if (unidad != 3){
            unidadS = Integer.toString(unidad);
        }else{
            unidadS = "E";
        }
        if (decena != 3){
            decenaS = Integer.toString(decena);
        }else{
            decenaS = "E";
        }
        if (centena != 3){
            centenaS = Integer.toString(centena);
        }else{
            centenaS = "E";
        }
        System.out.println(centenaS + " - " + decenaS + " - " + unidadS);
    }
}
