package ejercicio03;

import java.util.Scanner;
/**
 * Método main para el ejercicio 3
 * @author frodriguez
 *
 */
public class Main3 {

	public static void main(String[] args) { 
		int opcion; //Creamos la variable 'opcion'
		int nums, mayor, menor; // Creamos las variables 'nums', 'mayor' y 'menor'
		
		Scanner sc = new Scanner(System.in); //Creamos el escáner del programa
		
		System.out.print("Elija una opción: 1, 2 o 3: "); //Pedimos una opción al usuario
		opcion = sc.nextInt(); //Guardamos su elección en la variable 'opcion'
		if(opcion != 1 && opcion != 2 && opcion != 3) { //Si ha introducido una opción inexistente, se cierra el programa
			System.out.print("Opción introducida inexistente.");
		}
		else { //Si la opción introducida es correcta
			System.out.print("Introduzca la cantidad de números aleatorios que desea imprimir: "); //Pedimos un número
			nums = sc.nextInt(); //Guardaos el número introducido en 'nums'
			
			switch(opcion) { //Creamos un switch en función de la opción elegida
			case 1: //Si 'opcion == 1'
				NumerosAleatorios.numerosAleatorios(nums); //Llamamos a la función correspondiente y pasamos los parámetros
				break; //Salimos del switch
			case 2: //Si 'opcion == 2'
				System.out.print("Introduzca el techo de los números aleatorios: "); //Pedimos un número techo al usuario
				mayor = sc.nextInt(); //Guardamos el número introducido en 'mayor'
				
				NumerosAleatorios.numerosAleatorios(nums, mayor); //Llamamos a la función correspondiente y pasamos los parámetros
				break; //Salimos del switch
			case 3: //Si 'opcion == 3'
				System.out.print("Introduzca el techo de los números aleatorios: "); //Pedimos un número techo al usuario
				mayor = sc.nextInt(); //Guardamos dicho número en la variable 'mayor'
				System.out.print("Introduzca el suelo de los números aleatorios: "); //Pedimos un número suelo al usuario
				menor = sc.nextInt(); //Guardamos dicho número en la variable 'menor'
				
				NumerosAleatorios.numerosAleatorios(nums, mayor, menor); //Llamamos a la variable correspondiente y pasamos los parámetros
				break; //Salimos del switch
			}
		}
		
		sc.close(); //Cerramos el escáner
	} 

}