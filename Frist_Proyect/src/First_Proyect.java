import java.util.Scanner;

public class First_Proyect {

	public static void main(String[] args) {
	
		double dolares, euros, pesos;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese una suma de Pesos");
		pesos = sc.nextDouble();
		
		dolares = 385;
		euros = 390;
		
		
		
		System.out.printf("Dolares: " + (pesos*dolares));
		System.out.println("Euros: " + (pesos*euros));
		
		
		sc.close();
	}

}
//Escriba un programa que permita al usuario ingresar el valor de dos variables numéricas de 
//tipo entero. Posteriormente, el programa debe intercambiar los valores de ambas variables y 
//mostrar el resultado final por pantalla. 