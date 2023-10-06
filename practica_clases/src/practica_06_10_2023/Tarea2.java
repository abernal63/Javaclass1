package practica_06_10_2023;

import java.util.Scanner;

public class Tarea2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el primer numero: ");
		int num1 = sc.nextInt();
		
		System.out.print("Introduce el segundo numero: ");
		int num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println("El numero mayor es: " + num1);
		} else if (num1 < num2) {
			System.out.println("El numero mayor es: " + num2);
		} else {
			System.out.println("Los numeros son iguales.");
		}
		
	}

}
