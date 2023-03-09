package ejercicio28;

import java.util.Random;
import java.util.Scanner;

public class Matriz {

	// atributos
	private int[][] matriz;
	private int[][] matrizT;

	// constructor: contruis el objetos con los atributos necesarios

	public Matriz(int filas, int columnas) {
		this.esCuadrado(filas, columnas);
		this.matriz = new int[filas][columnas];
		this.matrizT = new int[columnas][filas];
		this.llenarMatriz();
		this.crearTraspuesta();

	}

	// Constructor prueba, para testear
	public Matriz() {
		this.matriz = new int[3][3];
		this.matrizT = new int[3][3];
		this.matriz[0][0] = 2;
		this.matriz[0][1] = 7;
		this.matriz[0][2] = 6;
		this.matriz[1][0] = 9;
		this.matriz[1][1] = 5;
		this.matriz[1][2] = 1;
		this.matriz[2][0] = 4;
		this.matriz[2][1] = 3;
		this.matriz[2][2] = 8;
		this.crearTraspuesta();
	}

	private void esCuadrado(int filas, int columnas) {
		if (filas != columnas) {
			throw new IllegalArgumentException("No es un cuadrado");
		}
	}

	// llena matriz
	private void llenarMatriz() {
		Random random = new Random();
		for (int i = 0; i < this.matriz.length; i++) {
			for (int j = 0; j < this.matriz[0].length; j++)
				this.matriz[i][j] = random.nextInt(98) + 1;
		}
	}

	// matriz traspuesta
	private void crearTraspuesta() {
		for (int i = 0; i < this.matriz.length; i++) {
			for (int j = 0; j < this.matriz[0].length; j++) {
				this.matrizT[j][i] = this.matriz[i][j];

			}
		}
	}

	// devuvelve la matriz llena
	public int[][] getMatriz() {
		return this.matriz;
	}

	// devuvelve la matriz traspuesta llena
	public int[][] getMatrizT() {
		return this.matrizT;
	}

	// muestra matriz
	public void mostrarMatriz() {
		for (int i = 0; i < this.matriz.length; i++) {
			for (int j = 0; j < this.matriz[0].length; j++) {
				System.out.print("|" + this.matriz[i][j] + " ");
			}
			System.out.println();
		}
	}

	// muestra matrizT
	public void mostrarMatrizT() {
		for (int i = 0; i < this.matrizT.length; i++) {
			for (int j = 0; j < this.matrizT[0].length; j++) {
				System.out.print("|" + this.matrizT[i][j] + " ");
			}
			System.out.println();
		}
	}

	// verifica la simetria de la matriz traspuesta
	public boolean asimetrica() {
		for (int i = 0; i < this.matriz.length; i++) {
			for (int j = 0; j < this.matriz[0].length; j++) {
				if (this.matriz[i][j] != this.matrizT[i][j]) {
					return true;
				}
			}
		}
		return false;
	}

	// Diagonales: checkea las diagonales
	public boolean diagonales() {
		int sumaDiagonalPrincipal = 0;
		int sumaDiagonalSecundaria = 0;
		for (int i = 0; i < this.matriz.length; i++) {
			sumaDiagonalPrincipal += this.matriz[i][i];
			sumaDiagonalSecundaria += this.matriz[i][this.matriz.length - 1 - i];
		}
		if (sumaDiagonalPrincipal != sumaDiagonalSecundaria) {
			return false;
		} 
		return true;
	}

	// suma y checkea las filas
	public boolean filas() {
		int sumaFila = 0;
	    int filaAnterior = 0;
	    for (int i = 0; i < this.matriz.length; i++) {
	        sumaFila = 0;
	        for (int j = 0; j < this.matriz[i].length; j++) {
	            sumaFila += this.matriz[i][j];
	        }
	        if (i != 0 && sumaFila != filaAnterior) {
	            return false;
	        }
	        filaAnterior = sumaFila;
	    }
	    return true;
	}
	
	// suma y checkea las columnas
		public boolean columnas() {
			int sumaColumna = 0;
		    int columnaAnterior = 0;
		    for (int j = 0; j < this.matriz[0].length; j++) {
		        sumaColumna = 0;
		        for (int i = 0; i < this.matriz.length; i++) {
		            sumaColumna += this.matriz[i][j];
		        }
		        if (j != 0 && sumaColumna != columnaAnterior) {
		            return false;
		        }
		        columnaAnterior = sumaColumna;
		    }
		    return true;
		}
	//Check de cuadrado magico
		public boolean cuadradoMagico() {
			if (this.columnas() && this.filas() && this.diagonales()) {
				return true;
			}
			return false;
		}
	//ingreso de matriz por teclado
		public void matrizPorTeclado() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Ingrese numeros enteros para llenar la matriz");
			for (int i = 0; i < this.matriz.length; i++) {
				for (int j = 0; j < this.matriz[0].length; j++)
					this.matriz[i][j] = sc.nextInt();
			}
			sc.close();
			System.out.println("La matriz esta llena");
		}
}