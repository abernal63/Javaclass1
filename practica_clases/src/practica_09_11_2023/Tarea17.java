package practica_09_11_2023;

import java.util.Scanner;

public class Tarea17 {
    public static void main(String[] args) {

        Scanner scText = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        String labelFraseInput = "\nIntroduce Una Frase: ";
        String frase = "";
        int opcion = 0;

        do {

            boolean salirMenu = false;

            System.out.print(labelFraseInput);
            frase = scText.nextLine();
            System.out.println("");

            if (frase.trim().equals("")) {
                MensajeFraseVacia();
            } else {
                do {

                    try {

                        System.out.println("----- Menu -----");

                        System.out.println("\n-- Frase: " + frase + " --\n");

                        System.out.println("Opcion 1 - Mostrar Longitud.");
                        System.out.println("Opcion 2 - Mostrar Numero de Palabras.");
                        System.out.println("Opcion 3 - Cambiar Frase.");
                        System.out.println("Opcion 4 - Mostrar la Primera Palabra.");
                        System.out.println("Opcion 5 - Mostrar la Ultima Palabra.");
                        System.out.println("Opcion 6 - Salir del Programa.");
                        System.out.println("----------------");

                        System.out.print("Ingrese la opcion: ");
                        opcion = scInt.nextInt();
                        System.out.println("");

                        switch (opcion) {
                            case 1:
                                MostrarLongitud(frase);
                                break;
                            case 2:
                                MostrarNumeroDePalabras(frase);
                                break;
                            case 3:
                                labelFraseInput = "\nIntroduce Una Nueva Frase: ";
                                salirMenu = true;
                                break;
                            case 4:
                                MostrarPrimeraPalabra(frase);
                                break;
                            case 5:
                                MostrarUltimaPalabra(frase);
                                break;
                            case 6:
                                salirMenu = true;
                                break;
                            default:
                                OpcionInvalida();
                                break;
                        }

                    } catch (Exception e) {
                        OpcionInvalida();
                        scInt.next();
                    }

                } while (!salirMenu);
            }

        } while (opcion != 6);

        System.out.println("Fin del Programa.\n");

        scText.close();
        scInt.close();
    }

    private static void MensajeFraseVacia() {
        System.err.println("La frase no puede estar vacia.\n"); 
    }

    private static void OpcionInvalida() {
        System.err.println("\nLa opcion es invalida, intenta otra vez.\n");
    }

    private static void MostrarNumeroDePalabras(String frase) {
        frase = frase.trim();
        int length = frase.length();
        int counterPalabras = 0;

        for (int i = 0; i < length; i++) {
            char currChar = frase.charAt(i);

            // Determina si el carater actual es la ultima letra de la frase.
            boolean ultimaLetra = (i + 1 == length);

            if (ultimaLetra || currChar != ' ' && frase.charAt(i + 1) == ' ') {
                counterPalabras++;
            }

        }

        System.out.println("La frase tiene " + counterPalabras + " palabras.\n");
    }

    private static void MostrarPrimeraPalabra(String frase) {
        frase = frase.trim();
        int index = frase.indexOf(" ");
        String palabra = "";

        if (index == -1) {
            palabra = frase;
        } else {
            palabra = frase.substring(0, index);
        }

        System.out.println("La Primera Palabra de la Frase es: " + palabra + ".\n");
    }

    private static void MostrarUltimaPalabra(String frase) {
        frase = frase.trim();
        int index = frase.lastIndexOf(" ");
        String palabra = frase.substring(index + 1);
        System.out.println("La Ultima Palabra de la Frase es: " + palabra + ".\n");
    }

    private static void MostrarLongitud(String frase) {
        int longitud = frase.length();
        System.out.println("La Longitud de la Frase es de " + longitud + " Caracteres.\n");
    }
}
