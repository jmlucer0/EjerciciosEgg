package ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, menu;
		String sino;
		boolean lock = false;
		do {			
			System.out.println("Ingrese dos numeros");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			System.out.println("");
			System.out.println("--Menu--");
			System.out.println();
			System.out.println("1-Sumar");
			System.out.println("2-Restar");
			System.out.println("3-Multiplicar");
			System.out.println("4-Dividir");
			System.out.println("5-Salir");
			menu = sc.nextInt();

		switch (menu) {
			case 1:
				System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
				break;
			case 2:
				System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
				break;
			case 3:
				System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
				break;
			case 4:
				System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
				break;
			case 5:
				System.out.println("Está seguro que desea salir del programa (S/N)? ");
				sino = sc.next();
				if (sino.equalsIgnoreCase("s")) {
					lock = true;
				}
				break;
			}
			
		} while (lock == false);
		sc.close();
	}
}
