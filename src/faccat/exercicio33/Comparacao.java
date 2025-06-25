package faccat.exercicio33;

import javax.swing.*;

/*
* Lê 2 valores e retorna se são iguais se o primeiro é maior ou
* se o segundo é maior.
*/
public class Comparacao {
    public static void main(String[] args) {
        int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
        int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));

        if(valor1 > valor2) {
            JOptionPane.showMessageDialog(null, "Primeiro é maior");
        } else if (valor1 < valor2) {
            JOptionPane.showMessageDialog(null, "Segundo é maior");
        } else {
            JOptionPane.showMessageDialog(null, "São iguais");
        }
    }
}
