package extras.extra23;

import java.io.IOException;

//leia caracteres da entrada do sistema e transforme em maiúscula se for minúscula e o oposto também
public class Maiuscula {
    public static void main(java.lang.String[] args) throws IOException {
        char letra;

        System.out.println("Digita aí uma letra e inverto a caixa dela:");
        letra = (char) System.in.read();
        System.out.println("Antes: " + letra);

        if(letra >= 97) letra -= 32;
        else letra += 32;

        System.out.println("Depois: "+ letra);

    }
}
