package ejercicio9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase;
		System.out.println("ingrese una frase");
		frase = sc.nextLine();
		sc.close();
		if(frase.equalsIgnoreCase("eureka")) {
			System.out.println("Correcto");
			
		}else {
			System.out.println("Incorrecto");
		}

	}

}

//Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
//pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
//investigar la función equals() en Java.