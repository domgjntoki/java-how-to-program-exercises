package C14Strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
/**
 *
 * @author Fredson Sumi
 */
public class CodigoMorse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String, String> morse = new LinkedHashMap<>();
        morse.put("a", ".-");
        morse.put("b", "-..");
        morse.put("c", "-.-.");
        morse.put("d", "-..");
        morse.put("e", ".");
        morse.put("f", "..-.");
        morse.put("g", "--.");
        morse.put("h", "....");
        morse.put("i", "..");
        morse.put("j", ".---");
        morse.put("k", "-.-");
        morse.put("l", ".-..");
        morse.put("m", "--");
        morse.put("n", "-.");
        morse.put("o", "---");
        morse.put("p", ".--.");
        morse.put("q", "--.-");
        morse.put("r", ".-.");
        morse.put("s", "...");
        morse.put("t", "-");
        morse.put("u", "..-");
        morse.put("v", "...-");
        morse.put("w", ".--");
        morse.put("x", "-..-");
        morse.put("y", "-.--");
        morse.put("z", "--..");
        morse.put("1", ".----");
        morse.put("2", "..---");
        morse.put("3", "...--");
        morse.put("4", "....-");
        morse.put("5", ".....");
        morse.put("6", "-....");
        morse.put("7", "--...");
        morse.put("8", "---..");
        morse.put("9", "----.");
        morse.put("0", "-----");
        
        System.out.println("Convertor morse");
        System.out.print("Insira uma frase: ");
        String sentence = input.nextLine().trim().replace("\\W", "");
        System.out.print("Converter para: [1] morse ou [2] frase: ");
        int converter = input.nextInt();
        String convertida = "";
        if(converter == 1){
            for(String word : sentence.split(" ")){
                for(char letter : word.toCharArray()){
                    for(Map.Entry<String, String> entry: morse.entrySet()){
                        if(String.valueOf(letter).equals(entry.getKey()))
                            convertida += entry.getValue() + " ";
                    }
                    
                }
                convertida += "   ";
            }
        }
        
        else if(converter == 2){
            for(String word : sentence.split("   ")){
                for(String simbol : word.split(" ")){
                    for(Map.Entry<String, String> entry: morse.entrySet()){
                        if(simbol.equals(entry.getValue()))
                            convertida += entry.getKey();
                    }
                    
                }
                convertida += " ";
            }
        }
        
        System.out.println(convertida);
    }
}
