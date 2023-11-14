package practica_07_11_2023;

import java.util.Scanner;

public class Tarea16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String palabra = "";
		
		System.out.print("Introduzca una palabra: ");
		palabra = sc.nextLine();
		
		while(!palabra.equalsIgnoreCase("fin")){
			
			for(int i = 0; i < palabra.length(); i++) {
				System.out.println("Letra " + (i+1) + ": " + palabra.charAt(i));
			}
			
			System.out.print("\nIntroduzca una palabra: ");
			palabra = sc.nextLine();
			
		}
		
		sc.close();
	}

}
