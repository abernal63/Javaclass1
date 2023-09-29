package practica_29_09_2023;

public class Tarea5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean X = false, Y = true, Z = true, resp = false;
		
		resp = (X && Y) || (X && Z);
		System.out.println("El resultado de la expresion ( X("+X+") && Y("+Y+") ) => ("+ (X && Y) +") || ( X("+X+") && Z("+Z+") ) => (" + (X && Z) + ") es " + resp);
		resp = (X || Y) && (!X && Z);
		System.out.println("El resultado de la expresion ( X("+X+") || Y("+Y+") ) => ("+ (X || Y) +") && ( !X("+!X+") && Z("+Z+") ) => (" + (!X && Z) + ") es " + resp);
		resp = (X || !Y) && (!X || Z);
		System.out.println("El resultado de la expresion ( X("+X+") || !Y("+!Y+") ) => ("+(X || !Y)+") && ( !X("+!X+") || Z("+Z+") ) => (" + (!X || Z) + ") es " + resp);
		resp = X || Y && Z;
		System.out.println("El resultado de la expresion X("+X+") || Y("+Y+") && Z("+Z+") es " + resp);
		
		Tarea6 tarea6 = new Tarea6("javier");
		
		tarea6.PintarLongitudNombre();
		tarea6.MostrarPrimerCaracter();
		tarea6.MostrarUltimoCaracter();
		tarea6.ContieneLetraA();
	}

}
