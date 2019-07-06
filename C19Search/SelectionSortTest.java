package C19Search;

import java.security.SecureRandom;
import java.util.Arrays;

public class SelectionSortTest {
    public static void selectionSort(int[] data){
        for(int i = 0; i < data.length - 1; i++){
            int smallest = i;
            for(int j = i + 1; j < data.length; j++)
                if(data[j] < data[smallest])
                    smallest = j;
            swap(data, i, smallest);
            printPass(data, i+ 1, smallest);
        }
    }
    public static void swap(int[] data, int first, int second){
        int hold = data[first];
        data[first] = data[second];
        data[second] = hold;
    }

    private static void printPass(int[] data, int pass, int index) {
        System.out.printf("after pass %2d: ", pass);

        // saída de elementos até item selecionado
        for (int i = 0; i < index; i++)
            System.out.printf("%d ", data[i]);

        System.out.printf("%d* ", data[index]); // indica troca

        // termina de gerar a saída do array
        for (int i = index + 1; i < data.length; i++)
            System.out.printf("%d ", data[i]);

        System.out.printf("%n "); // para alinhamento

        // indica quantidade do array que é classificado
        for (int j = 0; j < pass; j++)
            System.out.print("-- ");
        System.out.println();
    }

    public static void main(String[] args) {
        SecureRandom generator = new SecureRandom();

        int[] data = new int[10]; // cria o array

        for (int i = 0; i < data.length; i++) // preenche o array
            data[i] = 10 + generator.nextInt(90);

        System.out.printf("Unsorted array:%n%s%n%n",
                Arrays.toString(data)); // exibe o array
        selectionSort(data); // classifica o arrayÿ

        System.out.printf("Sorted array:%n%s%n%n",
                Arrays.toString(data)); // exibe o array
    }
}
