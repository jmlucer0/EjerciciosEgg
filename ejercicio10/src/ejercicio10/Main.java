package ejercicio10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.println("Ingrese una frase");
	String frase = sc.nextLine();
	sc.close();
	if (frase.length() == 8) {
		System.out.println("CORRECTO");
	}else {
		System.out.println("INCORRECTO");
	}

	}

}

//Realizar un programa que solo permita introducir solo frases o palabras de 8 de
//largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
//un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
//imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.