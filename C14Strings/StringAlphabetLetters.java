package C14Strings;

import java.util.Scanner;

/**
 *
 * @author Fredson Sumi
 */
public class StringAlphabetLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insira uma sentença: ");
        String sentence = input.nextLine().toLowerCase();
        int[] letters = new int[26];
        for(int i = 97; i < 123; i++){
            int lastIndex = sentence.indexOf((char) i);
            int vezes = 0;
                while(sentence.indexOf((char) i, lastIndex) != -1){
                    lastIndex = sentence.indexOf((char) i, lastIndex) + 1;
                    letters[i - 97] += 1;       
                }
        }
        for(int i = 0; i < letters.length; i++){
            System.out.printf("%s: %d%n", (char) (i + 97), letters[i]);
        }
    }
}
