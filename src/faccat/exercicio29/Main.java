package faccat.exercicio29;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int valor1, valor2, valor3;
		
		Scanner read = new Scanner(System.in);
		System.out.println("Nesse sistema você digita valores e eu descubro qual é o maior");
		
		System.out.println("Digite o primeiro valor: ");
		valor1 = read.nextInt();
		System.out.println("Digite o segundo valor: ");
		valor2 = read.nextInt();
		System.out.println("Digite o terceiro valor: ");
		valor3 = read.nextInt();
		
		if(valor1 > valor2 && valor2 < valor3) 		   //nesse caso valor2 é o menor
		{
			System.out.println(valor1 + valor3);
		} else if (valor2 > valor3 && valor3 < valor1) // nesse caso valor 3 é o menor
			{ 
			System.out.println(valor2 + valor1);
		} else 
		{											   //nesse caso valor 1 é o menor
			System.out.println(valor2 + valor3); 
		}
		
		read.close();
	}

}
