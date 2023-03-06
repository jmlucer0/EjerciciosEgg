package ejercicio19;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Crear matriz 3x3
        int[][] cuadrado = new int[3][3];

        // Pedir al usuario que introduzca los números
        System.out.println("Introduce los números del cuadrado mágico (1-9):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Fila %d, columna %d: ", i+1, j+1);
                int num = input.nextInt();
                if (num < 1 || num > 9) {
                    System.out.println("El número introducido no es válido. Introduce un número entre 1 y 9.");
                    j--; // Repetir la misma columna
                } else {
                    cuadrado[i][j] = num;
                }
            }
        }

        // Comprobar si el cuadrado es mágico
        boolean esMagico = true;
        int sumaFila1 = cuadrado[0][0] + cuadrado[0][1] + cuadrado[0][2];
        int sumaFila2 = cuadrado[1][0] + cuadrado[1][1] + cuadrado[1][2];
        int sumaFila3 = cuadrado[2][0] + cuadrado[2][1] + cuadrado[2][2];
        int sumaCol1 = cuadrado[0][0] + cuadrado[1][0] + cuadrado[2][0];
        int sumaCol2 = cuadrado[0][1] + cuadrado[1][1] + cuadrado[2][1];
        int sumaCol3 = cuadrado[0][2] + cuadrado[1][2] + cuadrado[2][2];
        int sumaDiagonal1 = cuadrado[0][0] + cuadrado[1][1] + cuadrado[2][2];
        int sumaDiagonal2 = cuadrado[0][2] + cuadrado[1][1] + cuadrado[2][0];
        int sumaMagica = sumaFila1; // Suma mágica esperada
        if (sumaFila2 != sumaMagica || sumaFila3 != sumaMagica ||
            sumaCol1 != sumaMagica || sumaCol2 != sumaMagica || sumaCol3 != sumaMagica ||
            sumaDiagonal1 != sumaMagica || sumaDiagonal2 != sumaMagica) {
            esMagico = false;
        }

        // Mostrar el resultado
        if (esMagico) {
            System.out.println("¡El cuadrado es mágico!");
        } else {
            System.out.println("El cuadrado no es mágico.");
        }
        input.close();
    }
}