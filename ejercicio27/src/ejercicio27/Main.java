package ejercicio27;

public class Main {
	 
	public static void main(String[] args) {
		Matriz cuadrado = new Matriz();
		cuadrado.mostrarMatriz();
		System.out.println("Suma de filas: " + cuadrado.filas());
		System.out.println("Suma de columna: " + cuadrado.columnas());
		System.out.println("Suma de diagonales: " + cuadrado.diagonales());
		System.out.println();
		System.out.println("Es un cuadrado magico?: " + cuadrado.cuadradoMagico());
	}
}
//Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 
//donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un 
//programa que permita introducir un cuadrado por teclado y determine si este 
//cuadrado es mágico o no. El programa deberá comprobar que los números 
//introducidos son correctos, es decir, están entre el 1 y el 9