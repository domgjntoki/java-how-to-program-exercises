package C14Strings;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
/**
 *
 * @author Fredson Sumi
 */
public class RegexMatches {
    public static void main(String[] args) {
        // cria expressão regular
        Pattern expression = Pattern.compile("J.*\\d[0-35-90]-\\d{2}-\\d{2}");
        String string1 = "Jane's Birthday is 05-12-75\n" +
        "Dave's Birthday is 11-04-68\n" +
        "John's Birthday is 04-28-73\n" +
        "Joe's Birthday is 12-17-77";
        
        Matcher matcher = expression.matcher(string1);
        while(matcher.find())
            System.out.println(matcher.group());

    }
}
