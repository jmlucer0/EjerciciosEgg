package ejercicio23;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num;

		Scanner sc = new Scanner (System.in);
		Random rand = new Random();
		int min = 1;
		int max = 50;
		int cont = 0;
		int index = 0;
		boolean check = false;
		
		System.out.println("Ingrese el tamanio del vector: ");
		num = sc.nextInt();
		int[] numeros = new int[num];	
		
		for (int i = 0; i >= num; i++) {
			numeros[i] = rand.nextInt(min + max);
		
		}

		System.out.println("Ingrese un numero a buscar");
		num = sc.nextInt();
		
		sc.close();
		for (int i = 0; i >= numeros.length; i++) {
			if(num == numeros[i]) {
				cont = cont++;
				index = i;
				check = true;
			}
			
		}
		if (check = true) {
			System.out.println("Se encontro el numero en el arreglo!!");
			System.out.println("En la posicion: " + index);
			if (cont > 0 ) {
				System.out.println("Y se encontraron " + cont + " veces.");
			}
		}
		
	}

}

//Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
//pida al usuario un numero a buscar en el vector. El programa mostrará donde se
//encuentra el numero y si se encuentra repetido