package ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num, num2, aux; 
	num = 0;
	num2 = 0;
	System.out.println("Ingrese un numero");
	num = sc.nextInt();
	do {
		System.out.println("Ingrese numeros");
		aux = sc.nextInt();
		num2 = num2 + aux;
		System.out.println(num2);
	}while(num2 < num);
	System.out.println("Fin del Programa");
	sc.close();
	}
	

}

//Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
//solicite números al usuario hasta que la suma de los números introducidos supere
//el límite inicial. 
