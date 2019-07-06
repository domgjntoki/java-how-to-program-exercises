package C14Strings;
import java.util.Scanner;
/**
 *
 * @author Fredson Sumi
 */
public class StringTokens {
    public static void main(String[] args) {
        // (555) 555-5555
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number (format: (555) 555-5555 ): ");
        String number = input.nextLine();
        
        if(number.matches("\\(\\d{3}\\)\\s+\\d{3}-\\d{4}")){
            String[] tokens = number.split(" ");
            String area = tokens[0].replaceAll("[^\\d]", "");
            String phoneNumber = tokens[1].replaceAll("[^\\d]", "");
            System.out.printf("Area: %s%n", area);
            System.out.printf("Phone number: %s%n", phoneNumber);
        }
        else
            System.out.println("Invalid phone number");
        
    }
}
