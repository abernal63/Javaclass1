package practica_22_09_2023;

public class practica1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int divisor = 2;
		int num1 = 8;
		int num2 = 9;
		int num3 = 10;
		Integer num = 9;
		Double num5 = 9.0;
		
		// CompareTo devuelve un 1 si el numero es mayor al que se le compara.
		
		System.out.println(num.compareTo(num1)); // num que es 9 es mayor a num1 que es 8. Devuelve 1.
		System.out.println(num.compareTo(num2)); // num es igual a num 2. Devuelve 0.
		System.out.println(num.compareTo(num3)); // num es menor a num 3. Devuelve -1.
		
		// Divisiones
		System.out.println(num2/divisor);
		
		System.out.println(num5/divisor);
		
		System.out.println(19/num5);
		
		// Producto
		
		// 15 % 2 -> devuelve el producto de la division. 
		// Osea el numero que sobra en la division
		// 15 / 2 es 7 y sobra 1; 14 / 2 en 7 y sobra 0;
		System.out.println(15%2);
		
		System.out.println(Math.round(Math.pow(2,3)));
	}

}
