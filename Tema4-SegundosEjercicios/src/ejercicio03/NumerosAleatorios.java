package ejercicio03;
 
/**
 * Clase 'NumerosAleatorios' para las funciones del ejercicio 3
 * @author frodriguez
 *
 */
public class NumerosAleatorios {
	
	static double numerosAleatorios(int numNums) { //La primera función devolverá un 'double' y sólo recibirá un parámetro 'int'
		double num = 0; //Creamos la variable 'num' y la inicializamos a 0
		
		//Creamos un bucle for que nos imprima números aleatorios entre 0 y 1 tantas veces como introduzca el usuario
		for(int i = numNums; i > 0; i--) {
			num = Math.random(); 
			System.out.println(num);
		}
		return num; //Devuelve el valor de num
	}
	
	static double numerosAleatorios(int numNums, int mayor) { //La segunda función devolverá un 'double' y recibirá dos parámetros 'int'
		double num = 0; //Creamos la variable 'num' y la inicializamos a 0
		
		//Creamos un bucle for que nos imprima 'n' números aleatorios entre 0 y el número introducido por el usuario tantas veces como haga falta
		for(int i = numNums; i > 0; i--) { 
			num = Math.random()*mayor;
			System.out.println((int)num);
		}
		return num; //Devuelve el valor de num
	}
	
	//La tercera función devuelve otro 'double' y recibe tres parámetros 'int'
	static double numerosAleatorios(int numNums, int mayor, int menor) { 
		double num = 0; //Creamos la variable 'num' y la inicializamos a 0
	
		//Creamos un bucle for que nos imprima una cantidad 'n' de números aleatorios dentro de un intervalo que el usuario nos ha indicado
		for(int i = numNums; i > 0; i--) { 
			num = (Math.random()*(mayor - menor) + menor);
			System.out.println((int) num);
		}
		
		return num; //Devuelve el valor de num
	}
}
