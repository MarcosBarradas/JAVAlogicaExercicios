package faccat.exercicio07;

import java.util.Scanner; //NÃO ESQUEÇA DE IMPORTAR com ctrl + espaço no Scanner

public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);//ctrl + espaço no Scanner e importa
		System.out.println("Digite quantos anos de vida você tem: ");
		int anosIdade = leia.nextInt();
		System.out.println("Digite quantos meses se passaram desde seu último niver: ");
		int mesesIdade = leia.nextInt();
		System.out.println("Digite quantos dias se passaram: ");
		int diasIdade = leia.nextInt();
		
		int totalEmDias = anosIdade * 365 + mesesIdade * 30 + diasIdade;
		System.out.println("Total em dias: " + totalEmDias + " dias.");
		leia.close();
	}

}
