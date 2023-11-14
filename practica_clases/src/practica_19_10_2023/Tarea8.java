package practica_19_10_2023;

import java.util.Scanner;

/*
 * @author Javier Diaz
 * 
 * Tarea 7: Id solicitando números y sumando hasta que el número introducido sea 0.
Cuando se introduzca el 0 no seguimos pidiendo más números y mostramos todos los números separados por coma.
 */
public class Tarea8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int numero = -1;
		String numeros = "";
		int suma = 0;
		
		while(numero != 0) {
			
			System.out.print("Introduce un numero: ");
			numero = sc.nextInt();
			suma += numero;
			
			if(numero != 0) {
				numeros += ", " + numero;				
			}
			
		}
		
		System.out.println("Los numeros introducidos son: " + numeros.substring(2) + ".");
		System.out.println("La suma de todos los numeros es: " + suma);
	}

}
