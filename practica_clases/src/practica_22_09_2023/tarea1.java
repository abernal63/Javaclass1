package practica_22_09_2023;
/**
 * 
 * @author Javier Diaz
 * 
 * Enunciado:
 * Crear un programa que almacene 8 valores diferentes:

	8
	9485.58172
	true
	Esto es un ejemplo de tipo de dato
	-135.248053912
	w
	Mi número de cliente es: 12345
	Mi nombre es: "Pepe"
	
	Mostrar los valores.
 *
 */

public class tarea1 {
	
	public static void main(String[] args) {
		
		int entero = 8;
		double decimal = 9485.58172;
		double decimalNegativo = -135.248053912;
		boolean booleano = 1 == 1;
		char letra = 'w';
		String texto = "Esto es un ejemplo de tipo de dato";
		
		int numeroTexto = 12345;
		String texto2 = "Mi número de cliente es: " + numeroTexto;
		String texto3 = "Mi nombre es: \"Pepe\"";
		
		System.out.println(entero);
		System.out.println(decimal);
		System.out.println(booleano);
		System.out.println(texto);
		System.out.println(decimalNegativo);
		System.out.println(letra);
		System.out.println(texto2);
		System.out.println(texto3);
	}

}
