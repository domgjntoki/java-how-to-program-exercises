package C16Colecoes.exercicios;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Fredson Sumi
 */
public class ContandoPalavrasDuplicadas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insira uma string: ");
        String[] words = 
                input.nextLine().replaceAll("[^\\w\\s]", "").split("\\s+");
        LinkedHashMap<String, Integer> contagem = new LinkedHashMap<>();
        for(String word : words){
            if(contagem.containsKey(word)){
                int value = contagem.get(word);
                contagem.put(word, value + 1);
            }
            else
                contagem.put(word, 1);
                
        }
        int repeticoes = 0;
        for (Map.Entry<String, Integer> entry : contagem.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if(value > 1)
                repeticoes ++;
            System.out.printf("%s: %d repetições.%n", key, value);
        } 
        System.out.println("Palavras repetidas: " + repeticoes);
        
        
    }
}
