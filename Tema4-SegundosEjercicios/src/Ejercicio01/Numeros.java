package Ejercicio01;

/**
 * Clase 'Numeros' para las funciones del programa
 * @author frodriguez
 *
 */
public class Numeros {
	
	Boolean esPrimo(int numero) { //Creamos la función 'esPrimo', que recibe el int 'numero' por parámetros y devuelve un booleano.
		Boolean primo = true; //Creamos e iniciamos la variable booleana 'primo' a 'true'
		
		for(int i = numero -1; i>1; i--) { //Creamos un bucle for que compruebe si el número es primo o no
			if(numero % i == 0) {
				primo = false; //Si es divisible por algún número, 'primo' vale 'false'
				break; //Si encontramos un número divisor, salimos del bucle
			}
		} 
		return primo; //Devolvemos el valor de 'primo'
	}
	
	Boolean esCapicua(int numero) { //Creamos la función 'esCapicua', que recibe el int 'numero' por parámetros y devuelve un booleano
		
		Boolean capicua; //Creamos la variable booleana 'capicua'
		int aux; //Creamos la variable auxiliar 'aux'
		int inverso = 0; //Creamos la variable 'inverso' y la inicializamos en 0
		int cifra; //Creamos la variable 'cifra' 
		
		aux = numero; //El valor de 'numero' se copia en la variable 'aux'
		if(numero < 10) { //Si el número es menor a 10, 'capicua' es 'true'
			capicua = true;
		}
		else { //Si el número > 10
			while(aux != 0) { //Creamos un bucle while que se repetirá mientras la variable 'aux' sea diferente de 0
				cifra = aux % 10; //Guardamos en 'cifra' el valor del resto de 'aux' entre 10
				aux /= 10; //Cambiamos el valor de 'aux' de acuerdo a las cifras que vamos sacando 
				inverso = inverso * 10 + cifra; //El valor de 'inverso' es igual a él mismo * 10 + el valor de 'cifra'
			}
			if(numero == inverso) { //Si 'numero == inverso' al acabar el bucle, 'capicua = true'
				capicua = true;
			}
			else { //Si no es igual, 'capicua = false'
				capicua = false;
			}
		}
		return capicua; //Devolvemos el valor almacenado en 'capicua'
	}

}
