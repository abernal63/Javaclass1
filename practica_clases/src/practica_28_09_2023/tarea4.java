package practica_28_09_2023;

public class tarea4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10, num2 = 25;
		float numDbl1= 13.0f, numDbl2 = 30.50f;
		
		int suma = num1 + num2;
		int resta = num2 - num1;
		float division = numDbl2 / numDbl1;
		int modulo = num2 % num1 ;
		
		System.out.println("La suma de " + num1 + " + " + num2 + " es igual a " + suma );
		System.out.println("La resta de " + num2 + " - " + num1 + " es igual a " + resta );
		System.out.println("La division de " + numDbl2 + " / " + numDbl1 + " es igual a " + division );
		System.out.println("El modulo de " + num2 + " % " + num1 + " es igual a " + modulo );
	}	

}
