package ejercicio05;

/**
 * Clase 'FuncionesRecursivas' para las funciones del ejercicio 5
 * @author frodriguez
 *
 */
public class FuncionesRecursivas {
	
	static int sumatorio(int num) { //Creamos la función 'sumatorio', que devolverá un valor 'int' y recibe por parámetros un valor 'int'
		int resultado = 0; //Creamos una variable 'resultado' y la inicializamos a 0
		
		if(num == 1) { //CASO BASE
			resultado = 1; //Si el valor de 'num' llega a 1, el valor de 'resultado' es = 1
		}
		/*Si no, el valor de resultado es igual a sí mismo sumado al número por parámetro + el resultado de otra llamada a 'sumatorio'
		con el valor de 'num - 1' como parámetro */
		else { 
			resultado += num + sumatorio(num - 1);
		}
		
		return resultado; //Devolvemos el valor almacenado en 'resultado'
	}
	
	 //Creamos la función 'potencia', que devolverá un valor 'double' y recibe un valor 'double' y un 'int' por parámetros
	static double potencia (double a, int n) {
		double resultado = 0; //Creamos la variable 'resultado' y la inicializamos a 0
		
		if(n == 1) { //CASO BASE
			resultado = a; //Si el exponente es = 1, el resultado es el número de la base
		}
		/* Si no, el valor de resultado es igual a el valor de la base * el resultado de otra llamada a 'potencia'
		 con los valores de "a" y "n - 1" como parámetros*/
		else {
			resultado = a * potencia(a, n - 1); 
		}
		
		return resultado; //Devolvemos el valor de 'resultado'
	}
	
	static int serieFibonacci(int num) {
		int resultado;
		
	    if (num<2){
	        resultado = num;
	    } 
	    else {
	        resultado = serieFibonacci(num-1) + serieFibonacci(num-2);
	    }
	    return resultado;
	}
}