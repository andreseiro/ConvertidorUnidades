import java.util.Scanner;

/**
 * Calculadora de conversion de unidades de medida
 * 
 * Inicialmente implementa conversion de unidades de temperatura.
 * 
 * @author andreseiro
 * @version 1.0
 * @since 2022
 */
public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcion = 0;
		double tempInicial, resultado;
	
		while(opcion != 5) {
			opcion = mostrarMenu(teclado);
			switch(opcion) {
			case 1:
				System.out.println("digite la temperatura en Kelvin");
				tempInicial = teclado.nextDouble();
				resultado = convertirKelvinCelsius(tempInicial);
				System.out.println("La temperatura en Celsius es: "+ resultado + "\n");
				break;
			case 2:
				System.out.println("digite la temperatura en Kelvin");
				tempInicial = teclado.nextDouble();
				resultado = convertirKelvinFahrenheit(tempInicial);
				System.out.println("La temperatura en Fahrenheit es: " + resultado);
				break;
			case 3:
				break;
			case 4: 
				break;
			case 5:
				System.out.println("--- Programa Terminado ---");
				mostrarMenu();
				break;
			}//fin switch
		}//fin while
	}

	/**
	 * Muestra el menu de seleccion de tipo de conversion
	 * 
	 * @param teclado es un objeto {@code Scanner} para lectura a traves del teclado 
	 * @return Opciones seleccionada por el usuario
	 */
	public static int mostrarMenu(Scanner teclado) {
		int opcion;
		System.out.println("\n --- MENU --- ");
		System.out.println("1. convertir kelvin a Celsius");
		System.out.println("2. convertir kelvin a Fahrenheit");
		System.out.println("3. convertir Celsius a Kelvin");
		System.out.println("4. convertir Fahrenheit a Kelvin");
		System.out.println("5. Salir");
		opcion = teclado.nextInt();
		return opcion;
	}

	/**
	 * funcion que recibe una temperatura en kelvin y la convierte a celsius
	 * 
	 * @param kelvin: temperatura en grados kelvin
	 * @return Resultado de la operacion c=k-273,15
	 */
	public static double convertirKelvinCelsius(double kelvin) {
		double celsius;
		celsius = kelvin - 273.15;
		return celsius;
	}
	
	/**
	 * 
	 * @param kelvin
	 * @return **Completar**
	 */
	public static double convertirKelvinFahrenheit(double kelvin) {
		double fahrenheit;		
		fahrenheit = 9 * (kelvin-273.15)/5+32;
		return fahrenheit;
	}
	
}


