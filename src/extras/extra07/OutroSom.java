package extras.extra07;

import java.util.Scanner;

/*Você pode medir a distancia de uma sala através do eco, ao bater palmas você saberá quanto tempo
 * leva para o som ir e então voltar. Se dividir esse valor por dois e multiplicar pela distancia que o 
 * som percorre por segundo terá a distância do objeto que fez o eco. Crie um programa, que
 * lê o tempo do eco e através disso calcula a distância do objeto em pés.*/
public class OutroSom {
	public static void main(String[] args) {
		double dist, eco;
		Scanner read = new Scanner(System.in);
		System.out.println("digite o intervalo entre a palma e o eco: ");
		eco = read.nextDouble();
		read.close();
		
		dist = eco / 2 * 1100;//pés 
		
		System.out.println("A istância entre você e o objeto é de: " + dist + "pés");
	}
}
