package C15Arquivos;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author Fredson Sumi
 */
public class CreateSequencialFile {
    private static ObjectOutputStream output;
    
    public static void main(String[] args) {
        openFile();
        addRecords();
        closeFile();
    }

    private static void openFile() {
        try {
            output = new ObjectOutputStream(
            Files.newOutputStream(Paths.get("src/C15Arquivos/clients.ser")));
        } catch (IOException e) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1);
        }
    }

    private static void addRecords() {
        Scanner input = new Scanner(System.in);
        System.out.printf("%s%n%s%nEnter your input: ",
            "Enter account number, first name, last name and balance.",
            "Enter a invalid input to end.");
        
        while (true) {
            try {
                // cria novo registro; esse exemplo supõe uma entrada válida
                Account record = new Account(input.nextInt(), input.next(), 
                        input.next(), input.nextDouble());
                output.writeObject(record);
            } catch (IOException e) {
                System.err.println("Error writing to file. Terminating.");
                System.exit(1);
            } catch(NoSuchElementException e){
                System.out.println("Invalid input, terminating :)");
                break;
            }
            System.out.print("Enter your input: ");
        }
        
    }

    private static void closeFile() {
        try {
            if(output != null)
                output.close();
        } catch (IOException e) {
            System.err.println("Error closing file. Terminating.");
        }
    }
}
