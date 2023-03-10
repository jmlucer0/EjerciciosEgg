package ejercicio21;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int euro;
		String moneda;
		System.out.print("Ingrese la catidad de euros: ");
		euro = sc.nextInt();
		System.out.print("Ingrese la moneda a convertir: ");
		moneda = sc.next();
		sc.close();
		convertir(euro, moneda);
	}

	public static void convertir(int euro, String moneda) {
		switch (moneda.toLowerCase()) {
		case "yen":
			System.out.println(euro * 129.852 + " Yenes");
			break;
		case "dolar":
			System.out.println(euro * 1.2861 + " Dolares");
			break;
		case "libras":
			System.out.println(euro * 0.86 + " Libras");
		}
	}
}