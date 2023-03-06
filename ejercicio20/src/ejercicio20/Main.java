package ejercicio20;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[4];
		
		for (int i = 0; i < 4; i++) {
			System.out.println("Ingrese 4 numeros que esten entre 1 y 20");
			numeros[i] = sc.nextInt();
			if(numeros[i] <1 || numeros[i]>20) {
				i--;
				continue;
			}					
		}
		sc.close();
		for (int i = 0; i < 4; i++) {
			int asteriscos = numeros[i];
			System.out.print(asteriscos + " : ");
			for (int j = 0; j < asteriscos; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	

	}

}

//Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
//número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo: