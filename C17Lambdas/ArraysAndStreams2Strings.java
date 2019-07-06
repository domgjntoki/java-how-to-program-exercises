package C17Lambdas;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Comparator;

/**
 *
 * @author Fredson Sumi
 */
public class ArraysAndStreams2Strings {
    public static void main(String[] args) {
        String[] strings =
            {"Red", "orange", "Yellow", "green", "Blue", "indigo", "Violet"};
        // exibe strings originais
        System.out.printf("Original strings: %s%n", Arrays.asList(strings));
        
        // strings em maiúsculas
        System.out.printf("Strings to upper case: %s%n",
                Arrays.stream(strings)
                        .map(String::toUpperCase)
                        .collect(Collectors.toList()));
        
        // strings menores que “n” (sem distinção maiúsc/minúsc) em ordem crescente
        System.out.printf("strings greater than \"m\" sorted ascending: %s%n",
                Arrays.stream(strings)
                        .filter(s -> s.compareToIgnoreCase("m") > 0)
                        .sorted(String.CASE_INSENSITIVE_ORDER)
                        .collect(Collectors.toList()));
        
        // strings menores que “n” (com distinção maiúsc/minúsc) em ordem decrescente
        System.out.printf("strings greater than \"m\" sorted descending: %s%n",
                Arrays.stream(strings)
                        .filter(s -> s.compareToIgnoreCase("m") > 0)
                        .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
                        .collect(Collectors.toList()));
        
                
                
    }
   
}
