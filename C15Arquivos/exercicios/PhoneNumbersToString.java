package C15Arquivos.exercicios;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fredson Sumi
 */
public class PhoneNumbersToString {
    private static Formatter possiveisStrings;
    private static HashMap<Integer, String[]> numerosString;
    
    
    public static void main(String[] args) throws IOException {
        createFile();
        adicionarNumeros();
        Scanner input = new Scanner(System.in);
        System.out.print("Insira um número de telefone: ");
        
        criarPossibilidadesRecursao(input.next());
        close();
    }
    
    public static void criarPossibilidadesRecursao(String numero){
        criarPossibilidadesRecursao(numero, "", numero.length());
    }
    private static void criarPossibilidadesRecursao(String numero, String valor,
        int loopAtual){
        if(loopAtual == 0){
            formarAnagrama(numero, valor);
            return;
        }
        for (int i = 0; i < 3; i++) 
            criarPossibilidadesRecursao(numero, valor + i, loopAtual - 1);   
    }

    private static void adicionarNumeros() throws IOException {
        Scanner numerosStringsTxt = new Scanner(Paths.get(
                "src/C15Arquivos/exercicios/numerosStrings.txt"));
        numerosString = new HashMap<>();
        while (numerosStringsTxt.hasNext()) {
            int numero = numerosStringsTxt.nextInt();
            String a = numerosStringsTxt.next();
            String b = numerosStringsTxt.next();
            String c = numerosStringsTxt.next();
            numerosString.put(numero, new String[]{a, b, c});
        }
        
        
    }

    private static void formarAnagrama(String numero, String anagrama) {
        String anagramA = "";
        for (int i = 0; i < numero.length(); i++) {
            int valor = Integer.parseInt(String.valueOf(numero.charAt(i)));
            int posicaoAnagrama = 
                    Integer.parseInt(String.valueOf(anagrama.charAt(i)));
            anagramA += (numerosString.get(valor)[posicaoAnagrama]);

        }
        possiveisStrings.format("%s%n", anagramA);
    }
    
    public static void createFile(){
        try {
            possiveisStrings = new Formatter(
                    "src/C15Arquivos/exercicios/palavrasFormadasRecursao2.txt");
        } catch (FileNotFoundException ex) {
            System.err.println("File not found.");
        }
        
    }

    private static void close() {
        possiveisStrings.close();
    }
}
