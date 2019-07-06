package C17Lambdas.exercicios;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Fredson Sumi
 */
public class RandomCaracters {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        List<Character> randomCaracters = new ArrayList<>();
        random.ints(30, 97, 123)
                .boxed()
                .forEach(value -> randomCaracters.add((char) value.intValue()));
        
        // Ordem Crescente
        System.out.printf("Ordem crescente: ");
        randomCaracters
                .stream()
                .sorted()
                .forEach(character -> System.out.printf("%C ", character));
        System.out.println();
        
        System.out.printf("Ordem descrescente: ");
        // Ordem Decrescente
        randomCaracters
                .stream()
                .sorted(Collections.reverseOrder())
                .forEach(character -> System.out.printf("%C ", character));
        System.out.println();
        
        System.out.printf("Crescente -duplicatas: ");
        // Ordem crescente sem duplicatas
        randomCaracters
                .stream()
                .distinct()
                .sorted()
                .forEach(character -> System.out.printf("%C ", character));
        System.out.println();
    }
}
