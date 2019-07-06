package C11;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author Fredson Sumi
 */
public class DivideByZeroWithExceptionHandling {
    public static int quotient(int numerator, int denominator)
        throws ArithmeticException
    {
        return numerator / denominator;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueLoop = true;
        do {
            try{
                System.out.print("Please enter a integer numerator: ");
                int numerator = input.nextInt();
                System.out.print("Please enter a integer denominator: ");
                int denominator = input.nextInt();
                
                System.out.printf("Result -> %d / %d = %d%n", 
                    numerator, denominator, quotient(numerator, denominator));
                continueLoop = false;
            }
            
            catch(ArithmeticException e){
                System.err.printf("Exception: %s%n", e);
                System.err.println("You can't divide by zero!");
            }
            
            catch(InputMismatchException e){
                System.err.printf("Exception: %s%n", e);
                System.err.println("You Must enter integers, try again.");
                input.nextLine();
            }
        } while (continueLoop);
        
    }
}
