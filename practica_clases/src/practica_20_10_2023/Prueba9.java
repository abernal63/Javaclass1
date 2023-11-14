package practica_20_10_2023;

import java.util.Scanner;

/*
 * @author Javier Diaz
 * 
 * Tarea: Solicitar un número entero por teclado e indicar si es par o impar.

	Seguir haciendo esto hasta que el usuario introduzca el valor -1, en ese caso mostraremos un mensaje y finalizaremos el programa.
 */

public class Prueba9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un numero: ");
		int numero = sc.nextInt();
		
		while(numero != -1) {
			
			if(numero % 2 == 0) System.out.println("El numero introducido es par");
			else System.out.println("El numero introducido es impar");
			
			System.out.print("\nIntroduce otro numero: ");
			numero = sc.nextInt();
		}

		System.out.println("Se ha introducido -1, Fin del programa.");
	}
	
	

}
