package C14Strings;
import java.util.Scanner;
/**
 *
 * @author Fredson Sumi
 */
public class StringSentenceLettersCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insira uma palavra: ");
        String[] sentence = input.nextLine().split(" ");
        System.out.println("Letras  Recorrência");
        for (int i = 1; i <= 30; i++) {
            int recorrencia = 0;
            for(String word : sentence){
                if(i == word.length())
                    recorrencia++;
            }
            System.out.printf("%6d%13d%n", i, recorrencia);
        }
    }
}
