package ejercicio18;



	import java.util.Scanner;

	public class Main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Introduce el número de elementos por lado: ");
	        int n = sc.nextInt();
	        sc.close();
	        
	        // Imprimir la primera fila de asteriscos
	        for (int i = 1; i <= n; i++) {
	            System.out.print("* ");
	        }
	        System.out.println();
	        
	        // Imprimir las filas intermedias
	        for (int i = 2; i <= n-1; i++) {
	            System.out.print("* ");
	            for (int j = 2; j <= n-1; j++) {
	                System.out.print("  ");
	            }
	            System.out.println("*");
	        }
	        
	        // Imprimir la última fila de asteriscos
	        for (int i = 1; i <= n; i++) {
	            System.out.print("* ");
	        }
	    }
	}