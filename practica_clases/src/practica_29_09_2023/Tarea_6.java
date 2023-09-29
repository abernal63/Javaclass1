package practica_29_09_2023;

public class Tarea_6 {
	
	public static void main(String[] args) {
		String nombre = "Jose";
		
		int longitud = nombre.length();
		System.out.println("El nombre " + nombre + " tiene " + longitud + " caracteres.");
		
		char primeraLetra = nombre.charAt(0);
		System.out.println("El primer caracter de " + nombre + " es: " + primeraLetra + ".");
		
		char ultimaLetra = nombre.charAt( longitud - 1);
		System.out.println("El ultimo caracter de " + nombre + " es: " + ultimaLetra + ".");
		
		boolean contieneA = nombre.contains("a");
		
		if(contieneA) {
			System.out.println("El nombre " + nombre + " si contiene a.");
		}else {
			System.out.println("El nombre " + nombre + " no contiene a.");
		}
	}

}
