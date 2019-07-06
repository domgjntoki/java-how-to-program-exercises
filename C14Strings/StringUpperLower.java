package C14Strings;

import java.util.Scanner;
/**
 *
 * @author Fredson Sumi
 */
public class StringUpperLower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        System.out.printf("Sentence upper case: %s%n", sentence.toUpperCase());
        System.out.printf("Sentence lower case:  %s%n", sentence.toLowerCase());
    }
}
