package practica_13_10_2023;

import java.util.Scanner;

public class Tarea_4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un numero: ");
		
		int numero = sc.nextInt();
		int acumulador = 0;
		System.out.println(acumulador);
		
		while(acumulador != numero) {
			if(numero < 0) {
				acumulador--;
			} else {
				acumulador++;
			}
			System.out.println(acumulador);
		}
		
		sc.close();
	}

}
