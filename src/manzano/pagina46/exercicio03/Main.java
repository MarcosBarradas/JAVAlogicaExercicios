package manzano.pagina46.exercicio03;
//Descrição   : programa que apresenta no final o somatório dos valores pares existentes na faixa de
//1 até 500.

//resultado esperado: 62750
public class Main {

	public static void main(String[] args) {
		int soma = 0;
		int contadora = 1;
		
		while (contadora < 501) {
			
			if (contadora % 2 == 0) //verifica se é par
			{
				soma += contadora; // apenas incrementa se for par
			}
			
			contadora++; //incrementa contadora
		}
		
		System.out.printf("Total das somas é: %d", soma);
	}

}
