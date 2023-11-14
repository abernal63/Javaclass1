package practica_17_10_2023;

import java.util.Scanner;

/*
 * @author Javier Diaz
 * 
 * Motivo: 
 * - Tuve que salir de clases antes para devolver un articulo que compre y el repartidor pasaba a las 2:30.
 * 
 * Crea una aplicación que muestre el nombre del cliente y la cantidad de artículos comprados.

	Evaluar el número de artículos comprados y según esto mostrar un mensaje indicando cómo deberá pagar el cliente:
	
	Si la cantidad es menor de 5 pagara en efectivo,
	si es mayor de 5 y menor de 12 pagara con tarjeta, 
	si es mayor de 13 pagara con cheque.
 */


public class Tarea_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Buen dia, dime tu nombre: ");
		String nombre = sc.nextLine();
		
		System.out.print("Cuantos articulos vas a comprar: ");
		int articulos = sc.nextInt();
		
		System.out.println("Bienvenido " + nombre + "!!, vas a comprar " + articulos + " articulos.");
		
		if(articulos < 5) { 
			System.out.println("El pago seria con efectivo");
		} else if(articulos >= 5 && articulos <= 12 ) { 
			System.out.println("El pago seria con tarjeta");
		} else { 
			System.out.println("El pago seria con cheque");
		}
		
		sc.close();
		
	}

}
