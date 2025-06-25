package faccat.exercicio18;

import java.util.Scanner;

//considerando que a pessoa já fez aniversário esse ano, colete o ano que ela nasceu, ano atual e calcule se ela pode votar.
public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Digite o ano em que você está usando o programa: ");
		int anoAtual = read.nextInt();
		System.out.println("Digite seu ano de nascimento: ");
		int anoAniversario = read.nextInt();
		
		int idade = anoAtual - anoAniversario;
		
		String direitoAoVoto = idade < 16 ? "Não pode votar" : "Pode votar";
		
		System.out.println(direitoAoVoto);
		read.close();
	}

}
