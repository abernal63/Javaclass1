package practica_31_10_2023;

import java.util.Scanner;

public class Tarea14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		MensajeDeBienvenida();
		PedirOperacion(sc);
		sc.close();
	}
	
	public static void MensajeDeBienvenida() {
		
		System.out.println("-----------------------------------");
		System.out.println("----------- Calculadora -----------");
		System.out.println("-----------------------------------\n");
		
	}
	
	public static void PedirOperacion(Scanner sc) {
		
		
		System.out.println("-----------------------------------");
		System.out.println("----------- Operaciones -----------");
		System.out.println("-----------------------------------");
		System.out.println("-- Opcion 1: Sumar ----------------");
		System.out.println("-- Opcion 2: Restar ---------------");
		System.out.println("-- Opcion 3: Multiplicar ----------");
		System.out.println("-- Opcion 4: Dividir --------------");
		System.out.println("-----------------------------------\n");
		
		System.out.print("Elige tu operacion: ");
		int operacion = sc.nextInt();
		System.out.println("\n");
		
		if(operacion < 1 || operacion > 4) {
			System.err.println("Operacion invalida, intente otra vez.\n");
			PedirOperacion(sc);
		}
		
		System.out.print("Introduce el primer numero: ");
		float num1 = sc.nextFloat();
		System.out.println("");
		
		System.out.print("Introduce el segundo numero: ");
		float num2 = sc.nextFloat();
		System.out.println("");
		
		switch(operacion) {
			case 1:
				Sumar(num1, num2);
				break;
			case 2:
				Restar(num1, num2);
				break;
			case 3:
				Multiplicar(num1, num2);
				break;
			case 4:
				Dividir(num1, num2);
				break;
		}
		
		sc.nextLine();
		System.out.print("Quieres hacer otra operacion? S/N: ");
		String otraVez = sc.nextLine();
		System.out.println("");
		
		if(otraVez.equalsIgnoreCase("s") || otraVez.equalsIgnoreCase("si")) {
			PedirOperacion(sc);
		}
		
	}
	
	public static void Sumar(float num1, float num2) {
		
		float resultado = num1 + num2;
		
		System.out.println("\nLa suma de " + num1 + " + " + num2 + " es " + resultado + "\n");
		
	}
	
	public static void Restar(float num1, float num2) {
		
		float resultado = num1 - num2;
		
		System.out.println("\nLa resta de " + num1 + " - " + num2 + " es " + resultado + "\n");
		
	}
	
	public static void Multiplicar(float num1, float num2) {
		
		float resultado = num1 * num2;
		
		System.out.println("\nLa multiplicacion de " + num1 + " * " + num2 + " es " + resultado + "\n");
		
	}
	
	public static void Dividir(float num1, float num2) {
		
		float resultado = num1 / num2;
		
		System.out.println("\nLa division de " + num1 + " / " + num2 + " es " + resultado + "\n");
		
	}

}
