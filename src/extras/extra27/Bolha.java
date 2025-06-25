package extras.extra27;

// Funciona essa loucura porque nas comparações o menor sempre acaba ficando em primeiro desde a primeira
// comparação. O segundo menor sempre vai andando de um em um até chegar em segundo lugar. Não vale
// a pena comparar com o menor o segundo menor, pois já sabemos o que vai acontecer.

//naturalmente o ultimo é comparado como penultimo, depois o penultimo com o antepenultimo e por aí vai
//até o primeiro item da lista. Depois o mesmo processo é repetido só que até o segundo item da lista.


public class Bolha {
    public static void main(String[] args) {
        int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        int a, b, t;
        int size = 10; // número de elementos a serem classificados

        // Exibe o array original
        System.out.print("Original array is:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + nums[i]);
        }
        System.out.println();

        // Esta é a classificação por bolha (Bubble Sort)
        for (a = 1; a < size; a++) {
            for (b = size - 1; b >= a; b--) {
                if (nums[b - 1] > nums[b]) {
                    // Se fora de ordem, troca os elementos
                    t = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = t;
                }
            }
        }

        // Exibe o array classificado
        System.out.print("Sorted array is:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + nums[i]);
        }
        System.out.println();
    }
}
