package C14Strings;

import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author Fredson Sumi
 */
public class StringCorretorOrtográficoTeste {
    public static void main(String[] args) throws IOException {
  
        Scanner input = new Scanner(System.in);
        System.out.print("Insira uma palavra: ");
        String frase = input.nextLine();
        StringCorretorOrtografico.corretor(frase);
       
    }
}
