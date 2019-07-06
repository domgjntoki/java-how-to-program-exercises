package C15Arquivos;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author Fredson Sumi
 */
public class ReadSequencialFile {
    private static ObjectInputStream input;
    public static void main(String[] args) {
        openFile();
        readRecords();
        closeFile();
    }

    private static void openFile() {
        try {
            input = new ObjectInputStream(
                Files.newInputStream(Paths.get("src/C15Arquivos/clients.ser")));
        } catch (IOException e) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1);
        }
    }

    private static void readRecords() {
        System.out.printf("%-10s%-12s%-12s%-10s%n", "Account",
            "First Name", "Last Name", "Balance");
        
        try {
            while (true) {
                Account record = (Account) input.readObject();
                // exibe o conteúdo de registro
                System.out.printf("%-10d%-12s%-12s%-10.2f%n",
                        record.getAccount(), record.getFirstName(),
                        record.getLastName(), record.getBalance());
            }
        } catch(EOFException e){
            System.err.printf("%nNo more records%n");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error reading from file. Terminating.");
        }  
    }

    private static void closeFile() {
        try {
            if(input != null){
                input.close();
            }
        } catch (IOException e) {
            System.err.println("Error closing file. Terminating.");
            System.exit(1);
        }
       
    }
}
