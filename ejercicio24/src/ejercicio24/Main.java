package ejercicio24;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[] numeros = new int[10];
		Random rand = new Random();
		int min = 1;
		int max = 999999;
		int[] count = new int[5];
		for (int i = 0; i < 10; i++) {
			numeros[i] = rand.nextInt(min, max);
			System.out.println(numeros[i]);
			//una digito
			if (numeros[i] > 0 && numeros[i] <=9) {
				count[0] += 1;
			}
			//dos digitos
			if (numeros[i] >= 10 && numeros[i] <=99) {
				count[1] += 1;
			}
			//tres digitos
			if (numeros[i] >= 100 && numeros[i] <= 9999) {
				count[2] += 1;
			}
			//cuatro digitos
			if (numeros[i] >= 10000 && numeros[i] <= 99999) {
				count[3] += 1;
			}
			//cinco digitos
			if (numeros[i] >= 10000 && numeros[i] <= 999999) {
				count[4] += 1;
			}
			
		}
		System.out.println("Un digito: " + count[0]);
		System.out.println("Dos digitos: " + count[1]);
		System.out.println("Tres digitos: " + count[2]);
		System.out.println("Cuatro digitos: " + count[3]);
		System.out.println("Cinco digitos: " + count[4]);

	}

}
//Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
//cuántos de 2 dígitos, etcétera (hasta 5 dígitos). 

//llenar el vector
//contar los digitos
//y mostrar 