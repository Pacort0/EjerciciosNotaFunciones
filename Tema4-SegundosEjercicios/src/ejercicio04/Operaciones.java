package ejercicio04;

/**
 * Clase 'Operaciones' para las funciones del ejercicio 4
 * @author frodriguez
 *
 */
public class Operaciones {
	double numero1, numero2; //Creamos dos variables globales no estáticas para la clase 'Operaciones'
	
	double suma() { //Creamos la función 'suma', que devuelve un double
		double suma = numero1 + numero2; //Creamos la variable 'suma', cuyo valor será igual a 'numero1 + numero2'
		
		return suma; //Devolvemos el valor de 'suma'
	}
	
	double resta() { //Creamos la función 'resta', que devuelve un double
		double resta = numero1 - numero2;  //Creamos la variable 'resta', cuyo valor será igual a 'numero1 - numero2'
		
		return resta; //Devolvemos el valor de 'resta'
	}
	
	double multiplicacion() { //Creamos la función 'multiplicacion', que devuelve un double
		double multi = numero1 * numero2;  //Creamos la variable 'multiplicacion', cuyo valor será igual a 'numero1 * numero2'
		
		return multi; //Devolvemos el valor de 'multipliacion'
	}
	
	double division() { //Creamos la función 'division', que devuelve un double
		double div = numero1 / numero2;  //Creamos la variable 'division', cuyo valor será igual a 'numero1 / numero2'
		
		return div; //Devolvemos el valor de 'division'
	}
}