package extras.extra03;

/*Teorema de pitágoras com biblioteca Math*/

class Pitagoras{
	public static void main(String[] args){
	double catetoA, catetoB, hipotenusa;
	
	catetoA = 3;
	catetoB = 4;
	hipotenusa = Math.sqrt(catetoA*catetoA + catetoB*catetoB);//sqrt calcula a raiz quadrada
	
	System.out.println("A hipotenusa é " + hipotenusa); // valor esperado: 5
	}
}