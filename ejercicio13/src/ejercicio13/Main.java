package ejercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num = 0;
	boolean lock = false;
	do {
		System.out.println("Ingrese su nota");
		num = sc.nextInt();
		if(num >= 0 && num <= 10) {
			System.out.println("Nota valida");
			lock = true;
		}else {
			System.out.println("La nota es invalida");
			System.out.println("");
		}
	} while (lock == false);
	
		sc.close();
	}

}

//Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
//la nota se pedirá de nuevo hasta que la nota sea correcta. 