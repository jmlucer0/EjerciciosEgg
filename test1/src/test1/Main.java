package test1;

public class Main {

	public static void main(String[] args) {
    int unidad, decena, centena;
    String numeros;
    String contador = "";

    for (centena = 0; centena <= 9; centena++) {
        for (decena = 0; decena <= 9; decena++) {
            for (unidad = 0; unidad <= 9; unidad++) {
                numeros = Integer.toString(centena) + "-" + Integer.toString(decena) + "-" + Integer.toString(unidad);

                for (int i = 0; i < numeros.length(); i++) {
                    if (numeros.charAt(i) == '3') {
                        contador += "E";
                    } else {
                        contador += numeros.charAt(i);
                    }
                }

                System.out.println(contador);
                contador = "";
            }
        }
    }
}

}




