package C14Strings;

import java.util.Scanner;
/**
 *
 * @author Fredson Sumi
 */
public class StringIndexCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insira uma sentença: ");
        String sentence = input.nextLine();
        System.out.print("Caractere que quer saber a quantidade de vezes: ");
        String caracter = input.nextLine();
        int lastIndex = sentence.indexOf(caracter);
        int vezes = 0;
        while(sentence.indexOf(caracter, lastIndex) != -1){
            lastIndex = sentence.indexOf(caracter, lastIndex) + 1;
            vezes += 1;
                
        }
        
        System.out.printf("Contagem de vezes: %d%n", vezes);
    }
}
