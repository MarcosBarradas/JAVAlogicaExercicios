package extras.extra36;
//Criando uma fila circular com polimorfismo
//cria uma fila nova, recebe outros objetos do mesmo tipo
//e recebe arrays de caracteres
public class Queue {
    private char[] queue;
    private int putloc, getloc;

    //Constrói uma nova fila (vazia)
    Queue(int size) {
        queue = new char[size];
        putloc = getloc = 0;
    }
    Queue(Queue existent) {
        this.queue = new char[existent.queue.length]; //deixa o tamanho igual o da fila existente
        this.putloc = existent.putloc; //armazena o quanto já foi percorrida a outra lista
        this.getloc = existent.getloc; // armazena o quanto já foi consumido da outra lista

        for (int i=getloc; i<queue.length; i++) //pega todos os itens que tem "disponíveis" dentro do objeto existente
            {
            this.queue[i] = existent.queue[i];
        }
    }
    Queue(char[] arr) {
        this.queue = new char[arr.length];
        putloc = getloc = 0;

        for (int i=0; i<arr.length; i++) {
            put(arr[i]);
        }
    }

    void put(char c) {
        if(putloc == queue.length) {
            System.out.println("filinha tá cheia");
        }
        queue[putloc++] = c;
    }
    char get() {
        if(getloc == putloc) {
            System.out.println("filinha vazia");
            return (char)0;//essa linha evita erros
        }
        return queue[getloc++];
    }
}
