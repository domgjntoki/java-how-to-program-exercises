package C15Arquivos.exercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fredson Sumi
 */
public class FileMatch {
    private static Scanner inputTrans;
    private static Scanner inputOldmast;
    private static Formatter newmast;
    private static Formatter log;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

    public FileMatch() {
    }
    public static void main(String[] args) {
        openFile();
        fileMatches();
        closeFiles();
    }

    private static void openFile() {
        
        try {
            inputTrans = new Scanner(new File(
                    "src/C15Arquivos/exercicios/trans.txt"));
            inputOldmast = new Scanner(new File(
                    "src/C15Arquivos/exercicios/oldmast.txt"));
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
            System.exit(1);
        }
    }

    private static void fileMatches() {
        try {
            newmast = new Formatter("src/C15Arquivos/exercicios/newmast.txt");
            log = new Formatter("src/C15Arquivos/exercicios/log.txt");
            
        } catch (FileNotFoundException ex) {
            System.err.println("File not found");
            System.exit(1);
        }
        // variavel q determina se é pra usar o método nextInt() de trans
        boolean foi = true;
        int conta2 = inputTrans.nextInt();
        while (true) {
            int conta1 = inputOldmast.nextInt(); 
            double conta1Balance;
            System.out.printf("%d %d%n", conta1, conta2);
            
            if(conta1 == conta2){
                newmast.format("%d %s %s ", conta1, 
                inputOldmast.next(), inputOldmast.next());
                
                conta1Balance = 
                        inputOldmast.nextDouble() + inputTrans.nextDouble();
                if(foi)
                    conta2 = inputTrans.nextInt();
                System.out.println(conta2);
                
                while (conta1 == conta2) {
                    conta1Balance += inputTrans.nextDouble();
                    conta2 = inputTrans.nextInt();
                    System.out.printf("\033[32;1m%d\033[m%n", conta2);
                }
                newmast.format("%,.2f%n", conta1Balance);
                
                foi = true;
            } else {
                System.out.println("else");
                
                log.format(
                    "Unmatched transaction record for account number %d%n",
                        conta1);
                System.out.println(inputOldmast.nextLine());
                inputTrans.nextLine();
                if(inputTrans.hasNext() == false)
                    break;
                foi = false;
            }
            
        }
  
    
    }
    public static void closeFiles(){
        if(log != null && newmast != null && 
                inputTrans != null && inputOldmast != null){
            log.close();
            newmast.close();
            inputTrans.close();
            inputOldmast.close();
        }
    }
    
}
