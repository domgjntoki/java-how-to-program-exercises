package C15Arquivos.exercicios;


import java.io.FileNotFoundException;

import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;


/**
 *
 * @author Fredson Sumi
 */
public class CreateTransOldmast {
    private static Formatter outputTrans;
    private static Formatter outputOldmast;
    public static void main(String[] args) {
        open();
        addOldmast();
        addTrans();
        close();
    }

    private static void open() {
        try {
            outputTrans = new Formatter("src/C15Arquivos/exercicios/trans.txt");
            outputOldmast = new Formatter(
                    "src/C15Arquivos/exercicios/oldmast.txt");
        } catch (FileNotFoundException ex) {
            System.err.println("File not found. Try it again.");
            System.exit(1);
        } catch(SecurityException e){
            System.err.println("Permission denied");
            System.exit(1);
        }
    }

    private static void addOldmast() {
        Scanner input = new Scanner(System.in);
        System.out.printf("Create oldmast.txt%n%s%n%s%n? ",
            "Enter account number, first name, last name and balance.",
            "Invalid input to end");
        
            while (true) {
                try {
                    outputOldmast.format("%d %s %s %,.2f%n",
                    input.nextInt(), input.next(), 
                    input.next(), input.nextDouble());
                } catch(FormatterClosedException e){
                    System.err.println("Error writing to file. Terminating");
                    break;
                } catch(NoSuchElementException e){
                    System.err.println("Invalid input, end.");
                    break;
                }
                System.out.printf("? ");
            }
    }
    
    private static void addTrans() {
        Scanner input = new Scanner(System.in);
        System.out.printf("Create trans.txt%n%s%n%s%n? ",
            "Enter account number and transaction value.",
            "Invalid input to end");
            while (true) {
                try {
                    outputTrans.format("%d %,.2f%n",
                        input.nextInt(), input.nextDouble());
                } catch(FormatterClosedException e){
                    System.err.println("Error writing to file. Terminating");
                    break;
                } catch(NoSuchElementException e){
                    System.err.println("Invalid input, end.");
                    break;
                }
                System.out.printf("? ");
            }
    }

    private static void close() {
        if(outputOldmast != null && outputTrans != null){
            outputOldmast.close();
            outputTrans.close();
        }
        
    }

    
}
