package extras.extra04;

/*Exercicio converte polegadas para metros e espaça a cada 12 metros*/

class ConversorPolegadas {
	public static void main(String[] args){
		double polegada, metro;
		int contadora;
		
		contadora = 0;
		for(polegada = 1; polegada <= 100; polegada++) {
			metro = polegada / 39.37;
			System.out.println(polegada + " polegadas tem " +
								metro + "metros");
			
			
			contadora++;
			if(contadora == 12) {
				contadora = 0; //reinicia contadora
				System.out.println("");
			}
		}
	}
}
