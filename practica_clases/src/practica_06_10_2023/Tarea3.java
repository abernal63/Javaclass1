package practica_06_10_2023;

import java.util.Scanner;

/*
 * @author Javier Diaz
 * Solicitar por teclado la estación del año favorita del usuario (primavera, verano, otoño o invierno).

	Una vez que el usuario introduzca la estación mostrar un mensaje por consola indicando algo característico que se realiza en esa estación del año.

	Si la estación del año favorita es verano además deberás preguntar al usuario si veranea en la playa y en caso de que responda que sí mostrarle los nombres de algunas playas de Murcia.
 * 
 * */

public class Tarea3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String carPrimavera = "Dato curioso: En primavera los animales despiertan de su hibernación.";
		final String carVerano = "Dato curioso: En verano hace mucho calor (asco).";
		final String carOtono = "Dato curioso: En otoño se caen las ojas de algunos arboles.";
		final String carInvierno = "Dato curioso: En Invierno los animales empiezan su hibernación.";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime tu estacion del año favorita (primavera, verano, otoño o invierno): ");
		String estacion = sc.nextLine().toLowerCase();
		
		
		switch(estacion) {
			case "primavera":
				System.out.println(carPrimavera);
				break;
			case "verano":
				System.out.println(carVerano);
				
				System.out.print("Te gusta veranear en la playa? (Si/No): ");
				
				String veranea = sc.nextLine();
				
				if(veranea.equalsIgnoreCase("si")) {
					System.out.println("Pues las mejores playas en murcia para ir son Cala cortina, Playa de poniente, Calblanque, Bolnuevo, La Azohía, etc...");
				}else if(veranea.equalsIgnoreCase("no")) {
					System.out.println("Que desperdicio...");
				}else {
					System.out.println(veranea + " No es ni si ni no pedazo de trol.");
				}
				break;
			case "otoño":
				System.out.println(carOtono);
				break;
			case "invierno":
				System.out.println(carInvierno);
				break;
			default:
				System.out.println("Que dices?? " + estacion + " No es una estación.");
				break;
				
		}
		
		sc.close();
	}

}
