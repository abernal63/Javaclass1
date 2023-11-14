package practica_31_10_2023;

import java.util.Scanner;

/*
 * @author Javier Diaz
 * 
 * Tarea: Realizar un programa que lea 5 notas de alumnos por teclado
	y que al final me diga cuántos aprobados y cuántos suspensos hay.
 */

public class Tarea13 {
	
	public static void main(String[] args) {
		
		int aprobados = pedirNotas();
		mostrarLosAprobados(aprobados);
	}
	
	public static int pedirNotas() {
		
		int aprobados = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.print("Nota del alumno " + (i+1) + ": ");
			int nota = sc.nextInt();
			System.out.println("");
			
			if(nota >= 5 && nota <= 10) {
				aprobados++;
			}else if(nota > 10 || nota < 0) {
				System.out.println("Nota invalida, introduzca otra vez la nota.\n");
				i--;
			}
		}
		
		sc.close();
		
		return aprobados;
	}
	
	public static void mostrarLosAprobados(int aprobados) {
		
		System.out.println("----------------------------");
		System.out.println("------- Aprobados: " + aprobados + " -------");
		System.out.println("------- Suspensos: " + ( 5 - aprobados ) + " -------");
		System.out.println("----------------------------");
		
	}

}
