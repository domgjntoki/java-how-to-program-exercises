package C15Arquivos;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author Fredson Sumi
 */
public class ReadTextFile {
    private static Scanner input;
    
    public static void main(String[] args) {
        open();
        readRecords();
        close();
    }
    
    public static void open(){
        try {
            URL url = ReadTextFile.class.getResource("clients.txt");
            
            input = new Scanner(new File(url.toURI()));
        } catch (IOException | URISyntaxException  e) {
            System.err.println("Error opening file. Terminating");
            System.exit(1);
        } 
        
        
    }
    
    public static void readRecords(){
        System.out.printf("%-10s%-12s%-12s%-10s%n", "Account",
            "First Name", "Last Name", "Balance");
        try {
            while(input.hasNext())
                System.out.printf("%-10d%-12s%-12s$ %-10.2f%n", input.nextInt(),
                    input.next(), input.next(), input.nextDouble());
        } catch (NoSuchElementException e) {
            System.err.println("File improperly formed. Terminating.");
        } catch(IllegalStateException e){
            System.err.println("Error reading from file. Terminating.");
        } 
    }
    
    public static void close(){
        if(input != null)
            input.close();
    }
}
