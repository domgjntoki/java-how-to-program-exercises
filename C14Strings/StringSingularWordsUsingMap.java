package C14Strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;


/**
 *
 * @author Fredson Sumi
 */
public class StringSingularWordsUsingMap {
    public static void main(String[] args) {
        String frase = "Eu sou uma frase, uma frase tão bonita quanto eu".
                replaceAll("[^\\w^\\s^ãõáéíóú]", "").toLowerCase();
        String[] words = frase.split(" ");
        
        Map<String, Integer> newWords = new LinkedHashMap<>();
        for(String word : words){
            // se não contém a palavra, adicione e value = 1
            if(! newWords.containsKey(word))
                newWords.put(word, 1);
            
            // se contém, value += 1
            else
                newWords.put(word, newWords.get(word) + 1);
        }
        
        System.out.println("Palavra  Recorrência");
        
        for(Map.Entry<String, Integer> entry : newWords.entrySet()) {
            System.out.printf("%7s%13d%n", entry.getKey(), entry.getValue());
        }
        
    }
}
