import java.util.Scanner;
/**
 * Cramos documentacion acerca del autor y de la version del programa que crea una lista y calcula el valor medio
 @author Francisco Jose Barranco Galan
 @version 1.0
 */
public class Ejercicio1 {
	public static void main(String[] arg){
		System.out.println("Introduce un valor para el numero 1: ");	
		Scanner sc = new Scanner (System.in);
		int numero1 = sc.nextInt(); 
		
		System.out.println("Introduce otro valor para el numero 2: ");	
		Scanner dos = new Scanner (System.in);
		int numero2 = dos.nextInt(); 
		dos.close();
		System.out.printf("%n");
		//System.out.printf("El numero 1 vale: %d y el numero 2 vale: %d%n", numero1, numero2);
		if (numero2 < numero1){
			for(int i=numero1; i>=numero2; i--){
				System.out.println(i);
			}
		}
		
		if (numero1 < numero2){
			for(int i=numero2; i>=numero1; i--){
				System.out.println(i);
			}	
		}
		
		if (numero1 == numero2){
			System.out.printf("El numero 1: %d y el numero 2: %d son iguales %n", numero1, numero2);
		}	
		System.out.printf("%n");
		
		double valor = calcularValorMedio(numero1, numero2);
		System.out.printf("El valor medio del valor 1: %d y del valor 2: %d es: %.2f%n", numero1, numero2, valor);
	}
	
	/**
	 * Creamos documentacion para los parametros y para el return que nos devuelve el valor
	 @param valorMenor es el primer valor que le pasamos y valor Mayor es el segundo valor que le pasamos
	 @return  nos devuelve el resultado de la operacion que nos da el valor medio
	 */
	public static double calcularValorMedio(int valorMenor, int valorMayor){
		double valorMedio;
		valorMedio = (valorMenor + valorMayor) / 2;
		return valorMedio;
	}
	
}
