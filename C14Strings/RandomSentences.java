package C14Strings;

import java.security.SecureRandom;

/**
 *
 * @author Fredson Sumi
 */
public class RandomSentences {
    public static void main(String[] args) {
        // article, noun, verb e preposition
        // order: article, noun, verb, preposition, article e noun
        SecureRandom random = new SecureRandom();
        String[] article = {"the", "a", "one", "some", "any"};
        String[] noun = {"boy", "girl", "dog", "town", "car"};
        String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};
        String[] preposition = {"to", "from", "over", "under", "on"};
        
        String[][] words = {article, noun, verb, preposition, article, noun};
        for(int i = 1; i <= 20; i++){
            String sentence = "";
            for(String[] word : words){
                String randomWord = word[random.nextInt(5)];
                sentence += " " + randomWord;
            }
            sentence = sentence.trim();
            System.out.println(Character.toUpperCase(sentence.charAt(0))
                + sentence.substring(1) + ".");
            if(i % 5 == 0)
                System.out.println();
        }
    }
}
