package ejercicio25;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[][] matriz = new int[4][4];
		Random rand = new Random();
		int min = 10;
		int max = 99;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				matriz[i][j] = rand.nextInt(min, max);
				System.out.print(" | " + matriz[i][j]);
			}
			System.out.println();
		}
		

	}

}
