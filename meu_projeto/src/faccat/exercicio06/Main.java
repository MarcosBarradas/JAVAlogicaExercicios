package faccat.exercicio06;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in); //CRIA LEITOR
		System.out.println("Digite a base de um retângulo: "); // ESCREVA
		float base = leia.nextFloat(); //LEIA 
		
		System.out.println("Digite a altura do retângulo: "); 
		float altura = leia.nextFloat(); //LEIA
		
		float area = base * altura;
		System.out.println("área: " + area);
		leia.close();//FECHA LEITOR
	}

}
