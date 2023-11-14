package practica_27_10_2023;

import java.util.Scanner;

/*
 * @author Javier Diaz
 * Realizar un programa que lea un número de teclado pedido al usuario 
 * y muestre la tabla de multiplicar de dicho número.
 *
 * MEJORA:
 *
 * Utilizar el mismo código pero dando la posibilidad al usuario de solicitar un nuevo número 
 * y mostrar de esta manera varias tablas de multiplicar. 
 * Haced esto hasta que el usuario introduzca el valor -1.
 * 
 */

public class Tarea12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		pedirDatos(sc);
	}
	
	public static void pedirDatos(Scanner sc) {
		
		boolean activo = true;
		boolean opcionValida = false;
		String opcion = "";
		int numero = 0;
		
		do {
			
			System.out.print("Introduce un numero: ");
			numero = sc.nextInt();
			System.out.println("");
			mostrarTabla(numero);
			opcionValida = false;
			sc.nextLine(); // usado para consumir un salto de linea que se obtiene del escanner de antes, error raro.
			
			while(!opcionValida) {
				System.out.print("Quieres introducir otro numero? S/N: ");
				opcion = sc.nextLine();
				System.out.println("");
				
				switch(opcion.toLowerCase()) {
				 case "si":
				 case "s":
					 opcionValida = true;
					 break;
				 case "no":
				 case "n":
					 opcionValida = true;
					 activo = false;
					 break;
				 default:
					System.out.println("Opcion invalida, vuelva a intentarlo.");
					opcionValida = false;
					break;
				}
				
			}
		}while(activo);
		
		System.out.println("----- FIN DEL PROGRAMA -----");
		
	}
	
	public static void mostrarTabla(int numero) {
		
		System.out.println("----------------------------");
		System.out.println("Tabla del numero " + numero);
		for(int n = 0; n <= 10; n++ ) {
			System.out.println(numero + " * " + n + " = " + (numero * n));
		}
		System.out.println("----------------------------\n");
		
	}

}
