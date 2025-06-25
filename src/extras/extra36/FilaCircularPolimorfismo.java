package extras.extra36;

public class FilaCircularPolimorfismo {
    public static void main(String[] args) {
        Queue q1 = new Queue(10);//TAMANHO COMO ARGUMENTO (int)

        char[] name = {'T', 'o', 'm'};
        Queue q2 = new Queue(name);//ARRAY COMO ARGUMENTO

        char ch;
        int i;
        for (i = 0; i < 10; i++) {
            q1.put((char) ('A' + i));//A, B, C...J
        }
        Queue q3 = new Queue(q1); //OBJETO COMO ARGUMENTO

        //exibe as filas
        //1º ) fila
        for(i =0; i< 10; i++){
            ch = q1.get();
            System.out.print(ch);
        }
        System.out.println("\n\n");

        //2º ) fila
        for(i =0; i< 3; i++){
            ch = q2.get();
            System.out.print(ch);
        }
        System.out.println("\n\n");
        //2º ) fila
        for(i =0; i< 10; i++){
            ch = q3.get();
            System.out.print(ch);
        }



    }
}
