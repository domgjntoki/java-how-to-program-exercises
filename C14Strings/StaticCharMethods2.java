package C14Strings;
import java.util.Scanner;
/**
 *
 * @author Fredson Sumi
 */
public class StaticCharMethods2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // obtém um radical
        System.out.print("Please enter a radix: ");
        int radix = input.nextInt();
        
        // obtém escolha de usuário
        System.out.printf("Please choose one:%n[1] %s%n[2] %s%n",
                "Convert digit to character", "Convert character to digit");
        int choice = input.nextInt();
        
        switch (choice) {
            case 1:
                System.out.print("Enter a digit: ");
                int digit = input.nextInt();
                System.out.printf("Convert digit to character: %s%n",
                        Character.forDigit(digit, radix));
                break;
            case 2:
                System.out.print("Enter a character: ");
                char c = input.next().charAt(0);
                System.out.printf("Convert caracter to digit: %s%n",
                        Character.digit(c, radix));
        }
    }
}
