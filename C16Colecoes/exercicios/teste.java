package C16Colecoes.exercicios;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Fredson Sumi
 */
public class teste {
    public static void main(String[] args) {
        String frase = "abc";
        int length = frase.length();
        List<String> string = 
                         Arrays.asList(frase.substring(length - 1).split(""));
                 Set<String> set = new HashSet<>(string);
                 System.out.println(set.size());
                 System.out.println(string.size());
    }
}
