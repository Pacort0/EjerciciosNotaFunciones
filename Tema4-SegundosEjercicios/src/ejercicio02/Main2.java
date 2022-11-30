package ejercicio02;

import java.util.Scanner;

/**
 * Método main del ejercicio 2
 * @author frodriguez
 *
 */
public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //Creamos el escáner del programa
		
		System.out.print("Introduzca un valor para el radio de la esfera: "); //Pedimos al usuario un valor para el radio de la esfera
		Esfera.radio = sc.nextDouble(); //Guardamos el valor introducido en una variable global estática de la clase 'Esfera'
		
		//Imprimimos el valor de la superficie de la esfera
		System.out.println("La medida de la superficie de la esfera es: " + Esfera.Superficie() + " metros cuadrados."); 
		//Imprimimos el valor del volumen de la esfera
		System.out.println("La medida del volumen de la esfera es: " + Esfera.Volumen() + " metros cúbicos.");
		
		sc.close(); //Cerramos el escáner
	}

}
