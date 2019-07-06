package C16Colecoes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Fredson Sumi
 */
public class Sort1 {
    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        // Cria e exibe uma lista contendo os elementos do array naipes
        List<String> list = Arrays.asList(suits);
        System.out.printf("Unsorted array elements: %s%n", list);

       Collections.sort(list); // classifica ArrayListÿ
       System.out.printf("Sorted array elements: %s%n", list);
    }
}
