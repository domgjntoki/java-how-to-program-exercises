package C14Strings;

import java.util.Scanner;
/**
 *
 * @author Fredson Sumi
 */
public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String[] sentence = input.nextLine().split(" ");
        for(int i = sentence.length - 1; i >= 0; i--)
            System.out.print(sentence[i] + " ");
        System.out.println();
    }
}
