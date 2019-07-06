package C19Search;

import java.security.SecureRandom;
import java.util.Arrays;

public class InsertionSortTest {
    public static void main(String[] args) {
        SecureRandom generator = new SecureRandom();

        int[] data = new int[10]; // cria o array

        for (int i = 0; i < data.length; i++) // preenche o array
            data[i] = 10 + generator.nextInt(90);

        System.out.printf("Unsorted array:%n%s%n%n",
                Arrays.toString(data)); // exibe o array
        insertionSort(data); // classifica o arrayÿ

        System.out.printf("Sorted array:%n%s%n%n",
                Arrays.toString(data)); // exibe o array
    }

    private static void insertionSort(int[] data) {
        for(int next = 1; next < data.length; next++){
            int insert = data[next];
            int insertIndex = next;
            while(insertIndex > 0 && data[insertIndex - 1] > insert){
                data[insertIndex] = data[insertIndex - 1];
                insertIndex--;
            }
            data[insertIndex] = insert;
            printPass(data, next, insertIndex);
        }
    }

    private static void printPass(int[] data, int pass, int index){
        System.out.printf("after pass %2d: ", pass);

        for (int i = 0; i < index; i++)
            System.out.printf("%d ", data[i]);

        System.out.printf("%d* ", data[index]); // indica troca

        // termina de gerar a saída do array
        for (int i = index + 1; i < data.length; i++)
            System.out.printf("%d ", data[i]);

        System.out.printf("%n "); // para alinhamento

        // indica quantidade do array que é classificado
        for(int i = 0; i <= pass; i++)
            System.out.print("-- ");
        System.out.println();
    }
}
