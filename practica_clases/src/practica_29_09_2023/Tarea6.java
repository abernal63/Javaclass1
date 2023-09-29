package practica_29_09_2023;

public class Tarea6 {
	
	private String nombre;
	
	Tarea6(String nombre){
		this.nombre = nombre;
	}
	
	public void PintarLongitudNombre(){
		int longitud = this.nombre.length();
		System.out.println("El nombre " + this.nombre + " tiene " + longitud + " caracteres.");
	}
	
	public void MostrarPrimerCaracter() {
		char primeraLetra = this.nombre.charAt(0);
		System.out.println("El primer caracter de " + this.nombre + " es: " + primeraLetra + ".");
	}
	
	public void MostrarUltimoCaracter() {
		int longitud = this.nombre.length();
		char ultimaLetra = this.nombre.charAt( longitud - 1);
		System.out.println("El ultimo caracter de " + this.nombre + " es: " + ultimaLetra + ".");
	}
	
	public void ContieneLetraA() {
		
		boolean contieneA = this.nombre.contains("a");
		
		if(contieneA) {
			System.out.println("El nombre " + this.nombre + " si contiene a.");
		}else {
			System.out.println("El nombre " + this.nombre + " no contiene a.");
		}
		
	}

}
