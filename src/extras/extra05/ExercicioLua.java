package extras.extra05;

/*Exercício peso na lua - sabendo que o peso na lua é 17% do peso da terra.*/

class ExercicioLua{
	public static void main(String[] args){
		float peso, resultado;
		
		peso = 75.0f;
		resultado = peso * 0.17f;
		
		System.out.println("Esse é o seu peso na lua: " + resultado);
	}
}