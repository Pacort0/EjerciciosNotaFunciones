package Ejercicio01;

import java.util.Scanner;
/**
 * Clase main del primer ejercicio
 * 
 * @author frodriguez
 */
public class Main1 {

	public static void main(String[] args) {
		int num; //Creamos la variable 'num'
		
		Scanner sc = new Scanner(System.in); //Creamos el escáner del programa
		
		System.out.print("Introduzca un número positivo: "); //Pedimos al usuario un número positivo
		num = sc.nextInt(); //Guardamos el número introducido en 'num'
		
		Numeros propiedad = new Numeros(); //Creamos un objeto de la clase 'Numeros' para llamar a las funciones no estáticas de dicha clase
		
		System.out.println("¿Es número primo?: " + propiedad.esPrimo(num)); //Llamamos a la función 'esPrimo'
		System.out.print("¿Es un número capicúa?: " + propiedad.esCapicua(num)); //Llamamos a la función 'esCapicua'
		
		sc.close(); //Cerramos el escáner
	}

}

