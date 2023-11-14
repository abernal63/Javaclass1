package practica_20_10_2023;

import java.util.Scanner;

/*
 * 
 * @author Javier Diaz
 * 
 * Tarea: Realizar un programa que tenga una contraseña y solicite al usuario que la introduzca pero que cada vez que falles, te reste un intento.
	Tienes un máximo de 3 intentos.
 * 
 * */

public class Tarea10 {

	static String usuario = "";
	static String password = "";
	static int intentosPassword = 3;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int opcion = 0;
		System.out.println("--------- Bienvenido ---------\n");
		
		while(opcion != -1) {
			System.out.println("------------------------------");
			System.out.println("Opciones: ");
			System.out.println(" 1 - Login");
			System.out.println(" 2 - Registrarse");
			System.out.println("-1 - Salir");
			System.out.print("\nIngrese una opcion: ");
			opcion = sc.nextInt();
			System.out.println("");
			
			switch(opcion){
				case 1:
					login();
					break;
				case 2:
					registro();
					break;
				case -1:
					salir();
					break;
				default:
					opcionInvalida();
					break;
			}
			
		}
		
	}
	
	static void login() {
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------Login-------------");
		System.out.println("--- Intentos disponibles: " + intentosPassword + " ---\n");
		System.out.print("Usuario: ");
		String user = sc.nextLine();
		System.out.print("Password: ");
		String pass = sc.nextLine();
		System.out.println("-------------------------------\n");
		
		if(usuario.equals(user) && password.equals(pass)) {
			mensajeBienvenida();
		}else {
			if(intentosPassword <= 0) {
				System.out.println("\nSe te acabaron los intentos.");
			}else {
				intentosPassword--;
				System.out.println("\nUsuario o Contraseña incorrecta.");
			}
		}
	}
	
	static void registro(){
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------Registro-------------");
		System.out.print("Introduce tu usuario: ");
		usuario = sc.nextLine();
		System.out.print("Introduce tu contraseña: ");
		password = sc.nextLine();		
		System.out.println("\n\nRegistro Exitoso!!!");
		System.out.println("----------------------------------\n");
	}
	
	static void mensajeBienvenida() {
		
		System.out.println("------------ Bienvenido ------------");
		System.out.println("------------ "+ usuario +" ------------\n");
		
	}
	
	static void salir() {
		
		System.out.println("------------------------------------");
		System.out.println("--------- Fin Del Programa ---------");
		System.out.println("------------------------------------");
		
	}
	
	static void opcionInvalida() {
		System.out.println("La opcion elegida es invalida.");
	}

}
