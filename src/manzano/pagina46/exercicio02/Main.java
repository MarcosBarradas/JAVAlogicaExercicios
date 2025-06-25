package manzano.pagina46.exercicio02;
//Descrição   : Apresentar o TOTAL DA SOMA obtida dos cem primeiros números
//inteiros (1+2+3+4+...+98+99+100) usando enquanto.
public class Main {

	public static void main(String[] args) {
		int soma, contador;
		
		soma = 0;
		contador = 1;
		
		while (contador < 101) {
			soma = soma + contador;
			contador++;
		}
		
		System.out.printf("A soma dos 100 primeiros números inteiros é: %d", soma);

	}

}
