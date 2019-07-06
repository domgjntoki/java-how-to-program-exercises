package C16Colecoes;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Fredson Sumi
 */
public class WordTypeCount {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>(); // capacidade inicial padrao = 16
        
        createMap(map);
        displayMap(map);
    }

    private static void createMap(Map<String, Integer> map) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = input.nextLine();
        
        // tokeniza a entrada
        String[] tokens = string.split(" ");
        
        // processamento de texto de entrada
        for(String token : tokens){
            String word = token.toLowerCase();
            if(map.containsKey(word)){
                int count = map.get(word);
                map.put(word, count + 1);
            }
            
            else
                map.put(word, 1);
        }
        
        
    }
    public static void displayMap(Map<String, Integer> map) {
        Set<String> keys = map.keySet(); // obtém chaves
        
        // classifica as chaves
        TreeSet<String> sortedKeys = new TreeSet<>(keys);
        
        System.out.printf("%nMap contains:%nKey\t\tValue%n");
        // gera saída de cada chave no mapa
        for(String key : sortedKeys)
            System.out.printf("%-10s%10s%n", key, map.get(key));
        
        System.out.printf(
            "%nsize: %d%nisEmpty: %b%n", map.size(),map.isEmpty());
    }
}
