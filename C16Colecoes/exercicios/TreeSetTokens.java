package C16Colecoes.exercicios;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Fredson Sumi
 */
public class TreeSetTokens {
    public static void main(String[] args) {
        System.out.print("Insira uma string: ");
        String[] words = new Scanner(System.in).nextLine().split(" ");
        TreeSet<String> treeSet = new TreeSet<>(Arrays.asList(words));
        for(String word: treeSet)
            System.out.println(word);
    }
}
