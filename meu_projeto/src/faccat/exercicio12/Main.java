package faccat.exercicio12;

import java.util.Scanner;
/*A fórmula é c / 5 = (f-32)/9
 * 
 * PRA RESOLVER
 * passamos o /5 pro outro lado multiplicando
 * 
 * c = (f-32)/9 * 5
 * 
 * */


public class Main {

	public static void main(String[] args) {
		double celsius, fahrenheit;
		Scanner read = new Scanner(System.in);
		System.out.println("Bem-vindo ao conversor de fahrenheit para celsius!!!");
		System.out.println("----------------------------------------------------");
		System.out.println("Digite uma temperatura em graus fahrenheit:");
		fahrenheit= read.nextDouble();
		
		celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Valor em celsius: " + celsius);
		read.close();
	}

}
