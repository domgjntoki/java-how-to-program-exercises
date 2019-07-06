package C15Arquivos;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author Fredson Sumi
 */
public class CreditInquiry {
    private static final MenuOption[] CHOICES = MenuOption.values();
    
    public static void main(String[] args) {
        MenuOption accountType = getRequest();
        
        while (accountType != MenuOption.END) {
            switch (accountType) {
            case ZERO_BALANCE:
                System.out.printf("%nAccounts with zero balances:%n");
                break;
            case CREDIT_BALANCE:
                System.out.printf("%nAccounts with credit balances:%n");
                break;
            case DEBIT_BALANCE:
                System.out.printf("%nAccounts with debit balances:%n");
                break;
            }
            
             System.out.printf("%-10s%-12s%-12s%-10s%n", "Account",
                        "First Name", "Last Name", "Balance");
            readRecords(accountType);
            accountType = getRequest();
        }
    }

    private static MenuOption getRequest() {
        int request = 4;
        System.out.printf("%nEnter request%n%s%n%s%n%s%n%s%n",
                            " 1 - List accounts with zero balances",
                            " 2 - List accounts with credit balances",
                            " 3 - List accounts with debit balances",
                            " 4 - Terminate program");
        
        try {
            Scanner input = new Scanner(System.in);
            do {
                System.out.printf("Enter your request: ");
                request = input.nextInt();
            } while (request < 1 || request > 4);
            
        } catch (NoSuchElementException e) {
            System.err.println("Invalid input. Terminating.");
        }
        
        return CHOICES[request - 1];
    }

    private static void readRecords(MenuOption accountType) {
        // abre o arquivo e processa o conteúdo
        try (Scanner input = new Scanner(Paths.get(
                "src/C15Arquivos/clients2.txt"))){
            while (input.hasNext()) {
                int accountNumber = input.nextInt();
                String firstName = input.next();
                String lastName = input.next();
                double balance = input.nextDouble();
                
                if(shouldDisplay(accountType, balance))
                    System.out.printf("%-10d%-12s%-12s%-10.2f%n", accountNumber,
                        firstName, lastName, balance);
                else
                    input.nextLine();
            }
            
        } catch (NoSuchElementException | IllegalStateException
                | IOException e) {
            System.err.println("Error processing file. Terminating");
            System.exit(1);
        }
    }

    private static boolean shouldDisplay(
            MenuOption accountType, double balance) {
        boolean should = false;
        
        if(accountType== MenuOption.CREDIT_BALANCE && balance < 0)
            should = true;
        else if(accountType == MenuOption.DEBIT_BALANCE && balance > 0)
            should = true;
        else if (accountType == MenuOption.ZERO_BALANCE && balance == 0) 
            should = true;
        
        return should;
    }
}
