package C15Arquivos.exercicios;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Fredson Sumi
 */
public class StudentPoolOutput {
 
    public static void main(String[] args) throws FileNotFoundException {
        Formatter output = 
                new Formatter("src/C15Arquivos/exercicios/pesquisa.txt");
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Vote de 0 a 5 para a pesquisa de satisfação, "
                    + "valor invalido para terminar: ");
                output.format("%d%n", input.nextInt());
                
            } catch (InputMismatchException e) {
                System.out.println("Input inválido, terminando.");
                break;
            } 
        }
        output.close();
    }
}
