package extras.extra14;
//Exibir todos os primos de 2 à 100.

//para resolver esse problema eu presumi na lógica do meu código que o valor já
//era primo, para só então fazer as verificações se ele de fato primo ou não

public class Primo {
    public static void main(String[] args) {

        System.out.print("2");

        for(int n = 3; n <= 100; n += 2) {
           int divisor = 3; //itera todos os ímpares de 3 até a raiz de n

           boolean primo = true; //começa como true, mas virará false se não for primo

           double raiz = Math.sqrt(n); // calcula a raiz de n

            //se algum ímpar menor que a raiz for divisível por n, sabemos que n não é primo
            while(divisor <= (int) raiz){

               if(n % divisor == 0){ //verifica se o valor ímpar da vez é divisível por n
                   primo = false; //se for divisível ele avisa que não é primo e quebra o laço
                   break ;
               }
               divisor += 2;

           }

           if (primo){ //verifica se é primo
               System.out.print(", " + n);
           }
        }
    }
}
