package practica_24_10_2023;

import java.util.Scanner;

/*
 * @author Javier Diaz
 * 
 * Tarea: Realiza una aplicación que nos pida un número de ventas a introducir, 
 * después nos pedirá tantas ventas por teclado como número de ventas se hayan indicado. 
 * Al final mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no.
 */

public class Tarea11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int gananciasTotales = 0;
		
		System.out.print("Numero de ventas a realizar: ");
		int ventas = sc.nextInt();
		
		for(int i = 0; i < ventas; i++) {
			
			System.out.print("Ganancias de la venta " + (i + 1) + ": ");
			int ganancias = sc.nextInt();
			
			gananciasTotales += ganancias;
		}
		
		System.out.println("Las ganancias totales son: " + gananciasTotales);

	}

}
