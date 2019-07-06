package C16Colecoes.exercicios;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Fredson Sumi
 */
public class ContandoLetras {
    public static void main(String[] args) {
        LinkedHashMap<Character, Integer> letras = new LinkedHashMap<>(26);
        Scanner input = new Scanner(System.in);
        System.out.print("Insira uma string: ");
        char[] characters = input.nextLine().replaceAll(" ", "").toCharArray();

        for(int j = 0; j < characters.length; j++)
            if(letras.containsKey(characters[j])){
                int value = letras.get(characters[j]);
                letras.put(characters[j], value + 1);
            }
            else
                letras.put(characters[j], 1);
        
        
        for(Map.Entry<Character, Integer> entry : letras.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            System.out.printf("%c: %02d%n", key, value);
        }
    }
}
