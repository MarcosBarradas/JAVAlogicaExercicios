package extras.extra32;

 class Fila {
    char fila[];
    int putLoc, getLoc;

    Fila(int tamanho) {
        fila = new char[tamanho]; //instancia com valor de acordo com o argumento
        putLoc = getLoc = 0;
    }

    void put(char ch){
        if (putLoc == fila.length) {
            System.out.println("Fila Cheia");
            return ;//retorna void para inibir o restante das intruções
        }
        fila[putLoc++] = ch; //cada vez que entra um valor o put loc incrementa
        //então cada valor de entrada vai pra um índice diferente até
        //a fila ter todos os índices preenchidos, aí começa a exibir fila cheia
    }
    char get(){
        if(getLoc == putLoc) { //compara com o tanto de elementos que já foram colocados
            //nunca vai tentar pegar elemento em uma posição que não existe ainda, pois
            //nunca avançará mais do que o "metodo put"
            System.out.println("Fila vazia");
            return (char) 0;
        }
        return fila[getLoc++];//como está sempre incrementando depois de devolver o valor cada chamada trás o
        //índice posterior
        //se o get for igual ao put significa que todos os puts que foram dados já teve get anteriormente
        //então não da mais para fazer gets... pois todos que entraram já sairam
    }
}

public class Main {
    public static void main(String[] args) {
        Fila grandeFila = new Fila(100);
        Fila pequenaFila = new Fila(4);
        char ch;
        int i;

        System.out.println("Usando grandeFila para armazenar o alfabeto");
        //insere inteiros em formato de charactere... talvez vc nao saiba
        //mas em char armazena inteiros e eles representam seus respectivos caracteres do UNICODE
        for(i = 0; i < 26; i++) {
            grandeFila.put((char) ('A' + i)); //intera começando pelo A
            //gosto dessa estratégia de somar o indice com o valor mínimo,
            //pois como o primeiro índice é normalmente 0
            //ele vai exibir o número ao qual estamos somando zero, e nos seguintes numeros
            //os resultados crescentes
        }
        // pega e demonstra os elementos da Grande Fila
        System.out.println("Conteúdo grandeFila");
        for(i = 0; i < 26; i++) {
            ch = grandeFila.get(); //dentro do objeto há a sua própria incrementadora
            //por isso é só pegar repetidas vezes, que lá vai pulando de índice em índice

            //quando tentamos colocar mais itens do que deveria ele retorna 0
            //por isso essa condicional antes de exibir o ch
            if(ch != (char) 0) System.out.println(ch);
        }

        System.out.println("\n");

        System.out.println("Usando pequenaFila para gerar erros de propósito");
        for(i=0; i < 5; i++) {
            System.out.println("Tentando armazenar: " +
            (char) ('Z' - i));

            pequenaFila.put((char) ('Z' - i));

            System.out.println();
        }
        System.out.println("\n");

        //mains erros em pequenaFila
        System.out.println("Conteúdos de pequenaFila: ");
        for(i=0; i < 5; i++) {
            ch = pequenaFila.get();
            if(ch != (char) 0) System.out.println(ch);
        }
    }
}
