package ejercicio17;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cadena;
		int sumaCorrecta = 0;
		int sumaIncorrecta = 0;
		
		do {
			System.out.println("Ingrese una palabra");
			cadena = sc.next();
			if(cadena.equalsIgnoreCase("&&&&&")) {
				break;
			}
			if (cadena.substring(0, 1).equalsIgnoreCase("x") && (cadena.length() <= 5) && cadena.substring(cadena.length()-1).equalsIgnoreCase("o")) {
				sumaCorrecta++;
				
			}else {
				sumaIncorrecta = sumaIncorrecta + 1;
				
			}
		}while(cadena != ("&&&&&"));
		System.out.println("Lecturas Correctas: " + sumaCorrecta);
		System.out.println("Lecturas Incorrectas: " + sumaIncorrecta);
		sc.close();
	}

}
