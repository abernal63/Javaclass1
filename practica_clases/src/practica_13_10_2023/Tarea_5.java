package practica_13_10_2023;

import java.util.Scanner;

/**
 * 
 * @author Javier diaz
 *
 */

public class Tarea_5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int resultado = 0;
		int numero = 0;
		
		String mensajeFinal = "La suma es: ";

		while (resultado < 100) {

			System.out.print("Introduzca un numero: ");
			numero = sc.nextInt();

			resultado += numero;
			
			if(resultado < 100) {
				mensajeFinal += numero + " + ";
			}
		}
		mensajeFinal += numero + " = " + resultado;

		System.out.println(mensajeFinal);
		
		sc.close();
	}

}
