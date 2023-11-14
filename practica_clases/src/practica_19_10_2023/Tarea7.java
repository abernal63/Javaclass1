package practica_19_10_2023;

import java.util.Scanner;

/*
 * @author Javier Diaz
 * 
 * Tarea: Hacer un programa que lea 10 números y que diga si se ha introducido algún número negativo.
 */
public class Tarea7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean hayNumNegativo = false;
		int num = 0; 
		
		System.out.println("--- Por favor ingresar 10 numeros ---");
		for(int i = 0; i < 10; i++) {
			System.out.print("\n"+(i + 1)+") inserta un numero = ");
			num = sc.nextInt();
			
			if(num < 0 && !hayNumNegativo) hayNumNegativo = true;
		}
		
		if(hayNumNegativo) {
			System.out.println("\nSe ha ingresado un numero negativo.");
		}else {
			System.out.println("\nNo se ha ingresado un numero negativo.");
		}
	}

}
