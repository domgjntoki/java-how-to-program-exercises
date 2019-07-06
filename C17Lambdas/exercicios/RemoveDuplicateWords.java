package C17Lambdas.exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Fredson Sumi
 */
public class RemoveDuplicateWords {
    public static void main(String[] args) {
        System.out.print("Insira uma frase: ");
        String frase = new Scanner(System.in).nextLine();
        
        List<String> words = Arrays.asList(frase.split(" "));
        words.stream()
                .distinct()
                .forEach(word -> System.out.printf("%s ", word));
        System.out.println();
    }
}
