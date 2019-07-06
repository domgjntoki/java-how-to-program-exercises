package C15Arquivos.exercicios;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fredson Sumi
 */
public class StudentPoolFrequencyOutput {
    public static Scanner read;
    public static Formatter output;
    public static void main(String[] args) {
        try {
            read = new Scanner(
                    Paths.get("src/C15Arquivos/exercicios/pesquisa.txt"));
        } catch (IOException ex) {
            System.err.println("Failed to read file. Terminating");
            System.exit(1);
        }
        int[] frequencies = new int[6];
        while (read.hasNext()) {
            frequencies[read.nextInt()]++;
        }
        
        
        try {
            output = new Formatter(
                    "src/C15Arquivos/exercicios/frequencias.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Terminating.");
            System.exit(1);
        }
        output.format("Estrela  Frequencia%n");
        for (int i = 0; i < frequencies.length; i++) {
            output.format("%-7d%3d%n", i, frequencies[i]);
        }
        output.close();
    }
}
