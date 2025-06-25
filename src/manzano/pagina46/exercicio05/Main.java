package manzano.pagina46.exercicio05;
//Apresenta os resultados das potências de 3, variando do
// expoente 0 até o expoente 15. É considerado que qualquer número
// elevado a zero é 1, e elevado a 1 é ele próprio. Observe que
//neste exercício não pode ser utilizado o operador
//de exponenciação (^ ou ** ou math.pow).
	
//3* 3 = 9                      = 3^2
//3 * 9 = 3* 3* 3 = 27          = 3^3
//3 * 27 = 3* 3* 3* 3 = 81      = 3^4
//3 * 81 = 3* 3* 3* 3* 3 = 243  = 3^5

//resultado esperado: 14348907
public class Main {

	public static void main(String[] args) {
		int resultado = 1;
		int contadora = 0;
		
		while (contadora < 15) //verifica se chegou no expoente desejado
			{
			resultado *= 3; // cada incremento equivale à um expoente
			
			contadora++;
		}
		System.out.println("\nResultado: " + resultado);
	}

}
