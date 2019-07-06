package C14Strings;
import java.util.Scanner;
/**
 *
 * @author Fredson Sumi
 */
public class PigLatin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        
        String[] words = sentence.split(" ");
        for(String word : words){
            printLatinWord(word);
            System.out.print(" ");
        }
        System.out.println();
        
    }
    public static void printLatinWord(String word){
            word = word.trim();
            word = ((word.substring(1)) + word.charAt(0) + "ay").toLowerCase();
            System.out.print(word);
    }
    
}

