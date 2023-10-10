package practica_10_10_2023;

import java.util.Scanner;

public class EjemploWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nota = 0;
		Scanner sc = new Scanner(System.in);
		while(nota != 10) {
			System.out.print("Introduce la nota: ");	
			nota = sc.nextInt();
			
			if(nota < 0 || nota > 10) {
				System.out.println("Nota fuera de rango, intenta otra vez.\n");
			}else if(nota < 10) {
				System.out.println("Nota insuficiente.\n");
			}
		}
		
		System.out.println("Felicidades por tu " + nota + "\n");
		
		sc.close();
	}

}
