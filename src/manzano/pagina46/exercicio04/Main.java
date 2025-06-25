package manzano.pagina46.exercicio04;
//Descrição   : Apresenta todos os valores numéricos inteiros ímpares situados
//na faixa de 0 a 20. Verifica se o número é ímpar, efetua dentro da malha a
//verificação lógica desta condição com a instrução perguntando se o número é
//ímpar; sendo, mostre-o; não sendo, passe para o próximo passo.
public class Main {

	public static void main(String[] args) {
		int contadora = 1;
		
		while (contadora < 20) {
			if(contadora % 2 != 0) {
			System.out.printf("%d, ", contadora);
			}
			contadora++;
		}

	}

}
