package ejercicio26;

public class Matriz {

	// atributos
	private int[][] matriz;
	private int[][] matrizT;

	// constructor: contruis el objetos con los atributos necesarios

	public Matriz(int filas, int columnas) {
		this.matriz = new int[filas][columnas];
		this.matrizT = new int[columnas][filas];
		this.llenarMatriz();
		this.crearTraspuesta();
	}

	// Constructor prueba, para checkear el metodo de asimetria
	public Matriz() {
		this.matriz = new int[3][3];
		this.matrizT = new int[3][3];
		this.matriz[0][0] = 2;
		this.matriz[0][1] = 0;
		this.matriz[0][2] = 3;
		this.matriz[1][0] = 2;
		this.matriz[1][1] = 5;
		this.matriz[1][2] = 0;
		this.matriz[2][0] = 3;
		this.matriz[2][1] = 0;
		this.matriz[2][2] = 5;
		this.crearTraspuesta();
	}

	// llena matriz
	private void llenarMatriz() {
		for (int i = 0; i < this.matriz.length; i++) {
			for (int j = 0; j < this.matriz[0].length; j++)
				this.matriz[i][j] = (int) (Math.random() * 19) - 9;
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

	//
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
}