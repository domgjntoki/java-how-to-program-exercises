package C14Strings;

import java.util.Scanner;
/**
 *
 * @author Fredson Sumi
 */
public class StringOnlyB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine().toLowerCase();
        String[] words = sentence.split(" ");
        for(String word: words){
            if(word.startsWith("b"))
                System.out.println(word);
        }
    }
}
