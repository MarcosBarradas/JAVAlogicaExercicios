package faccat.exercicio36;

import javax.swing.*;

/* lê as idades de 2 homens e de 2 mulheres (considera que as
        * idades dos homens serão sempre diferentes entre si, bem como as das mulheres).
        * Calcula e escreve a soma das idades do homem mais velho com a mulher mais
 * nova, e o produto das idades do homem mais novo com a mulher mais velha.
 */
public class Main {
    public static void main(String[] args) {
        int homem1 = Integer.parseInt(JOptionPane.showInputDialog("Escreva a idade de um homem"));
        int homem2 = Integer.parseInt(JOptionPane.showInputDialog("Escreva a idade de um homem diferente"));
        int mulher1 = Integer.parseInt(JOptionPane.showInputDialog("Escreva a idade de uma mulher"));
        int mulher2 = Integer.parseInt(JOptionPane.showInputDialog("Escreva a idade de uma mulher diferente"));

        int velhoComNova; // soma do homem mais velho com a mulher mais nova
        int novoComVelha; //soma do homem mais novo com a mulher mais velha

        if(homem1 > homem2){
            //se homem1 for mais velho
            if(mulher1 < mulher2) {
                velhoComNova = homem1 + mulher1;
                novoComVelha = homem2 + mulher2;
            } else {
                velhoComNova = homem1 + mulher2;
                novoComVelha = homem2 + mulher1;
            }
        } else { //homem2 > homem1
            if(mulher1 < mulher2) {
                velhoComNova = homem2 + mulher1;
                novoComVelha = homem1 + mulher2;
            } else {
                velhoComNova = homem2 + mulher2;
                novoComVelha = homem1 + mulher1;
            }
        }
        String mensagem = "A soma do homem mais velho com a mulher mais nova: " + velhoComNova +
                "\n A soma do homem mais novo com a mulher mais velha" + novoComVelha;
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
