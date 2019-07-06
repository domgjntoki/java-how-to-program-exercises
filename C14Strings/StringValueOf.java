package C14Strings;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fredson Sumi
 */
public class StringValueOf {
    public static void main(String[] args) {
        List<Character> charArray = Arrays.asList('a', 'b', 'c', 'd', 'e');
        boolean booleanValue = true;
        char characterValue = 'Z';
        int integerValue = 7;
        long longValue = 10000000000L; // sufixo L indica tipo long ÿ
        float floatValue = 2.5f; // f indica que 2.5 é um tipo floatÿ
        double doubleValue = 33.333; // sem sufixo, tipo double é padrão
        Object objectRef = "hello"; // atribui string a uma referência Object
        
        Object[] objects = {charArray, booleanValue, characterValue,
            integerValue, longValue, floatValue, doubleValue, objectRef};

        for(Object object : objects){
            System.out.printf("%s: %s%n", 
                    String.valueOf(object.getClass().getName()).substring(10), 
                    String.valueOf(object));
        }
    }
}
