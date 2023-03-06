package ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, suma;
		suma = 0;

		for (int i = 0; i < 20; i++) {
			System.out.println("Ingrese 20 Numeros");
			System.out.println("");
			System.out.println("Numeros ingresados: " + i);
			num = sc.nextInt();

			if (num > 0) {
				suma = suma + num;
			} else if (num == 0) {
				System.out.println("Se capturo el numero 0");
				System.out.println("Suma de los numeros ingresados: " + suma);
				break;
			} else {
				continue;
			}

		}
		sc.close();

	}

}

//Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
//salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
//deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
//número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break