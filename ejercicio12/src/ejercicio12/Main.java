package ejercicio12;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int motor;

		do {
			System.out.println("Ingrese un numero del 1 al 4");
			motor = sc.nextInt();

			
			switch (motor) {
			case 1:
				System.out.println("1 - Bomba de agua");
				break;
			case 2:
				System.out.println("2 - Bomba de gasolina");
				break;
			case 3:
				System.out.println("3 - Bomba de hormigon");
				break;
			case 4:
				System.out.println("4 - Bomba de pasta alimenticia");
				break;
			default:
				System.out.println("No ingresaste una opcion valida");
				System.out.println("");
			}

		} while (motor > 4);
		sc.close();
	}

}

