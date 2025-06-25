package extras.extra09;

import java.util.Scanner;

public class Cronometro {

	public static void main(String[] args) {
		int hora, minuto, segundo;//aqui por questões de escopo
		
		Scanner read = new Scanner(System.in);
		
		do {
			System.out.println("Digite a hora: ");
			hora = read.nextInt();
			System.out.println("Digite o minuto: ");
			minuto = read.nextInt();
			System.out.println("Digite o segundo: ");
			segundo = read.nextInt();
			
			if(hora < 0 || hora > 23 || minuto < 0 || minuto > 59 || segundo < 0 || segundo > 59) {
				System.out.println("Valores inválidos! Hora deve ser entre 0 e 23,"
								+ " minutos e segundos entre 0 e 59.");
			}
		} while (hora < 0 || hora > 23 || minuto < 0 || minuto > 59 || segundo < 0 || segundo > 59);
		
		for (int h = hora; h >= 0; h--) {//começa as horas com a entrada do usuário
			
		    for (int m =  (h == hora ? minuto : 59); m >= 0; m--) {//verifica se a primeira hora se passou, se sim
		    													  // reinicia m pra 59
		        for (int s = (h == hora && m == minuto ? segundo : 59); s >= 0; s--){// verifica se a primera hora
		        																	 // e se primeiro min se passou
		        																	 // se sim reinicia para 59
		            System.out.println(h + ":" + m + ":" + s); 
		            		//exibe a hora, minuto e segundo
		            		// como está dentro do laço for s
		            		//exibe a cada segundo que se passa
		        }
		    } 
		}
		read.close();
		

	}

}
