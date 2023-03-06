package ejercicio26;

public class Matriz {

	private int[][] matriz;
	private int[][] matrizT;
	
	
	public Matriz(int filas, int columnas) {
		matriz = new int[filas][columnas];
		matrizT = new int[filas][columnas];
		this.llenarMatriz();
		this.crearTraspuesta();
	}

	
	
	// llena matriz
	private void llenarMatriz() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++)
				matriz[i][j] = (int) (Math.random() * 19) - 9;
		}
	}

	// devuvelve la matriz llena
	public int[][] getMatriz() {
		return this.matriz;
	}

	// muestra matriz
	public void mostrarMatriz() {
		for (int i = 0; i < this.matriz.length; i++) {
            for (int j = 0; j < this.matriz[i].length; j++) {
                System.out.print("|" + this.matriz[i][j] + " ");
            }
            System.out.println(); 
        }		
	}
	// matriz traspuesta
	public void crearTraspuesta() {

		for (int i = 0; i < this.matriz.length; i++) {
			for (int j = 0; j < this.matriz[i].length; j++) {
				this.matrizT[i][j] = -this.matriz[i][j];
					
				}
			}
	}
	
	// devuvelve la matriz traspuesta llena
	public int[][] getMatrizT() {
		return this.matrizT;
	}
	
	
	public boolean asimetrica() {
		for (int i = 0; i < this.matriz.length; i++) {
			for (int j = 0; j < this.matriz[i].length; j++) {
					if (this.matriz[i][j] != this.matrizT[i][j]) {
						return false;
					}
				}
			}
		return true;
	}
}