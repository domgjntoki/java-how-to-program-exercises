package C18Recursao.exercicios;

import java.util.Scanner;

/**
 *
 * @author Fredson Sumi
 */
public class Palindromo {
    public static boolean palindromo(char[] frase, int length){
        if(length == 0)
            return true;
        return frase[frase.length - length] == frase[length - 1] &&
                palindromo(frase, length - 1);
        
    }
    
    public static void main(String[] args) {
        System.out.print("Insira uma frase: ");
        char[] frase = 
            new Scanner(System.in).nextLine().replaceAll(" ", "").toCharArray();
        System.out.printf("A frase %s um palíndromo%n",
                palindromo(frase, frase.length) ? "é" : "não é");
    }
}
