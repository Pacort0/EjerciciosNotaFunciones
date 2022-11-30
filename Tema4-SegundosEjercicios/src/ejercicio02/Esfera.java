package ejercicio02;

/**
 * Clase 'Esfera' para las funciones del programa
 * @author frodriguez
 *
 */
public class Esfera {
	static double radio; //Creamos la variable estática 'radio'
	
	static double Superficie() { //Creamos la función estática 'Superficie', que devuelve un valor 'double'
		double superficie; //Creamos la variable 'superficie'
		
		superficie = 4*Math.PI*Math.pow(radio, 2); //El valor de 'superficie' se determina por esta fórmula matemática
		
		return superficie; //Devolvemos el valor de 'superficie'
	}
	 
	static double Volumen() { //Creamos la variable estática 'Volumen', que devuelve un valor 'double'
		double vol; //Creamos la variable 'vol'
		
		vol = (4*Math.PI/3) * Math.pow(radio, 3); //El valor de 'vol' se determina por esta fórmula matemática
		
		return vol; //Devolvemos el valor de 'vol'
	}
}
