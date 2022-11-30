package ejercicio05;

import java.util.Scanner;

/**
 * Método Main para el ejercicio 5
 * @author frodriguez
 *
 */
public class Main5 {
	public static void main(String[] args) {
		int num; //Creamos la variable 'num'
		int exponente; //Creamos la variable 'exponente'
		
		Scanner sc = new Scanner(System.in); //Creamos el escáner del programa
		
		System.out.print("Introduzca un número positivo: "); //Pedimos al usuario un número positivo
		num = sc.nextInt(); //Guardamos el valor introducido en la variable 'num'
		
		System.out.println(FuncionesRecursivas.sumatorio(num)); //Llamamos a la función 'sumatorio' de la clase 'FuncionesRecursivas'
		
		System.out.print("Introduzca un número base: "); //Pedimos al usuario que introduzca un valor como base de la potencia
		num = sc.nextInt(); //Guardamos el valor de dicha base en la variable 'num'
		System.out.print("Introduzca una potencia para la base: "); //Pedimos al usuario que introduzca un valor como exponente
		exponente = sc.nextInt(); //Guardamos el valor en la variable 'exponente'
		
		//Llamamos a la función 'potencia' de la clase 'FuncionesRecursivas'
		System.out.println(num + " elevado a " + exponente + " = " + (int)FuncionesRecursivas.potencia(num, exponente));
		
		System.out.print("Introduzca una posición de la serie de Fibonacci: "); //Pedimos al usuario que introduzca otro número
		num = sc.nextInt(); //Guardamos el valor en la variable 'num'
		
		//Llamamos a la función 'serieFibonacci' de la clase 'FuncionesRecursivas'
		System.out.print("El valor del número en esa posición es " + FuncionesRecursivas.serieFibonacci(num));
		
		sc.close(); //Cerramos el escáner del programa
	} 
}