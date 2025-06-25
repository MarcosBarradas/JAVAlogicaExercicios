package extras.extra15;
//exibe um menu com duas intruções de controle:
//1- exibe como funciona o if
//2- exibe como funciona o switch
import java.io.IOException;

public class Ajuda {
    public static void main(String[] args)
            throws IOException { // java é paranóico então usamos IOException para conseguir usar o system.in.read();
        char ch;
        System.out.println("Menu de ajuda: ");
        System.out.println("1- if");
        System.out.println("2- switch");
        System.out.println("Seleciona uma:");
        ch = (char) System.in.read();

        switch(ch) {
            case '1':
                System.out.println("Estrutura if: \n");
                System.out.println("if (condição) instruções;");
                System.out.println("else instruções;");
                break;
            case '2':
                System.out.println("O Switch: \n");
                System.out.println("Switch(expressão) {");
                System.out.println("case constante:");
                System.out.println("    instruções consequentes;");
                System.out.println("    break;");
                System.out.println("    default: ");
                System.out.println("    Intruções de segurança; ");
                System.out.println("    // ...");
                System.out.println("    }");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
