
import java.util.Scanner;
import java.util.Stack;


/**
 *
 * @author Fredson Sumi
 */
public class GameBrackets {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insira uma string de brackets: ");
        String string = input.nextLine();
        System.out.println(isBalanced(string) ? "Yes":"No");
    }

       
    
    public static boolean isBalanced(String string) {
      if ((string.length() % 2) == 1) return false;
      else {
          // [()] -> ] )
          // [(]) -> ) ]  
        Stack<Character> s = new Stack<>();
        for (char bracket : string.toCharArray())
          switch (bracket) {
            case '{': s.push('}'); break;
            case '(': s.push(')'); break;
            case '[': s.push(']'); break;         
            default :
              if (s.isEmpty() || bracket != s.pop()) {return false;}
          }
        return s.isEmpty();
      }
    }
}
