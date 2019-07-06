package C15Arquivos;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;
/**
 *
 * @author Fredson Sumi
 */
public class CreateTextFile {
    public static Formatter output;
    
    public static void main(String[] args) {
        openFile();
        addRecords();
        closeFile();
    }
    
    public static void openFile(){
        // abre o arquivo clients.txt
        try {
            output = new Formatter("src/C15Arquivos/clients2.txt");
        } catch (SecurityException e) {
            System.out.println("Permission denied. Terminating");
            System.exit(1);
        } catch (FileNotFoundException e){
            System.out.println("Error opening file. Terminating");
            System.exit(1);
        }
        
    }
    
    // adiciona registros ao arquivo
    public static void addRecords(){
        Scanner input = new Scanner(System.in);
        System.out.printf("%s%n%s%n? ",
            "Enter account number, first name, last name and balance.",
            "Invalid input to end");
        while(true){
            try {
                // gera saída do novo registro para o arquivo; supõe entrada válida
                output.format("%d %s %s %,.2f%n", 
                        input.nextInt(), input.next(), 
                        input.next(), input.nextDouble());
                
            } catch (FormatterClosedException e) {
                System.err.println("Error writing to file. Terminating");
                break;
            } catch(NoSuchElementException e){
                System.err.println("Invalid input please try again.");
                input.nextLine();
                break;
            }
            
            System.out.print("? ");
        }
    }
    
    public static void closeFile(){
        if(output != null)
            output.close();
    }
}
