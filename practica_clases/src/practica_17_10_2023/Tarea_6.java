package practica_17_10_2023;
/*
 * @author Javier Diaz
 * 
 * Mostrar los números impares del 1 al 100 utilizando el bucle for.
 */
public class Tarea_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Mostrar los numeros impares.");
		
		for (int i = 1; i <= 100; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		
	}

}
