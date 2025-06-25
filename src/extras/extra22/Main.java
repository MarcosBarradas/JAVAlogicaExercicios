package extras.extra22;
//exercício pedido pelo livro para testar,,. fácil, mas serviu para eu fixar a limpeza do buffer com doWhile
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        char lido;
        char limpa;
        do {
            System.out.println("Digite um caractere (. para sair): ");
            lido = (char) System.in.read();
            if(lido == '.') break;
            do {
                limpa = (char) System.in.read();
            } while (limpa != '\n');
            System.out.println(lido + " " + limpa);
        } while(true);
    }
}
