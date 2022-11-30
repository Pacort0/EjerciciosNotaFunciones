package ejercicio04;

import java.util.Scanner;

/**
 * Método main para el ejercicio 4
 * @author frodriguez
 *
 */
public class Main4 {

	public static void main(String[] args) {
		
		Operaciones operacion = new Operaciones(); //Creamos un objeto de tipo 'Operaciones' para poder llamar a funciones de esa clase
		
		Scanner sc = new Scanner(System.in); //Creamos el escáner del programa
		
		System.out.print("Introduzca el valor del primer número: "); //Pedimos el primer número al usuario
		operacion.numero1 = sc.nextInt(); //Guardamos el número en una variable global no estática de la clase 'Operaciones'
		System.out.print("Introduzca el valor del segundo número: "); //Pedimos el segundo número al usuario
		operacion.numero2 = sc.nextInt(); //Guardamos el número en otra variable global no estática de la clase 'Operaciones'
		
		System.out.println("La suma de esos dos números es: " + operacion.suma()); //Llamamos a la función 'suma' de 'Operaciones'
		System.out.println("La resta de esos dos números es: " + operacion.resta()); //Llamamos a la función 'resta' de 'Operaciones'
		//Llamamos a la función 'multiplicacion' de 'Operaciones'
		System.out.println("La multiplicacion de esos dos números es : " + operacion.multiplicacion()); 
		System.out.println("La division de esos dos números es: " + operacion.division()); //Llamamos a la función 'division' de 'Operaciones'
		
	sc.close(); //Cerramos el escáner
	}

}