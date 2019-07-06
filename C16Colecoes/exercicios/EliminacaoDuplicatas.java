package C16Colecoes.exercicios;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Fredson Sumi
 */
public class EliminacaoDuplicatas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insira nomes: ");
        String[] nomes = input.nextLine().split("\\s+");
        Set<String> nomesSemDuplicadas = new HashSet<>(Arrays.asList(nomes));
        System.out.print("Nomes sem duplicatas: ");
        
        for(String nome : nomesSemDuplicadas)
            System.out.printf("%s ", nome);
        System.out.println();
    }
}
