package extras.extra38;

public class ClassificacaoRapida {
    static void qsort(char[] items) {
        qs(items, 0, items.length-1);
    }
    private static void qs(char[] items, int left, int right) {
        int i = left;
        int j = right;
        char x = items[(left+right)/2];//meio do array item
        char y;

        do {
            while ((items[i] < x) && (i < right)) i++;
            while ((items[j] > x) && (j > left)) j--;

            if (i <= j) {
                y = items[i];
                items[i] = items[j];
                items[j] = y;
                i++; j--;
            }
        } while (i <= j);

        if(left < j) qs(items, left, j);
        if(i < right) qs(items, i, right);

    }
}
