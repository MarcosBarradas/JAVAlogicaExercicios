package manzano.pagina46.exercicio07;
//Calcula o fabonacci até décimo quinto termo
public class Main {

	public static void main(String[] args) {
		int primeiro = 1;
		int segundo = 1;
		int proximo = 0;
		int index = 2;
		
		System.out.print("1, 1, ");
		while (index < 15) {
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			System.out.printf("%d, ", proximo);
			index++;
		}
		

	}

}
