package C18Recursao.exercicios;

import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author Fredson Sumi
 */
public class BinaryStrings {
    private static Formatter output;
    public static void binaryStrings(int numberOf){
        binaryStrings(numberOf, "");
    }
            
    public static void binaryStrings(int numberOf, String value){
            if(numberOf == 0)
                output.format("%s%n", value);
           //     System.out.println(value);
            
            else
                for (int i = 0; i < 2; i++)
                    binaryStrings(numberOf - 1, value + i);      
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        output = new Formatter(
                    "src/C18Recursao/exercicios/binarios.txt");
        System.out.print("Numero dos binario: ");
        int numero = new Scanner(System.in).nextInt();
        binaryStrings(numero);
    }
    
}
