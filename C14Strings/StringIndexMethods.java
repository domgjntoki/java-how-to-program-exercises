package C14Strings;

/**
 *
 * @author Fredson Sumi
 */
public class StringIndexMethods {
    public static void main(String[] args) {
        String letters = "abcdefghijklmabcdefghijklm";
        
        // testa indexOf para localizar um caractere em uma string
        System.out.printf("'c' is located at index %d%n", letters.indexOf('c'));
        System.out.printf("'a' is located at index %d%n", 
                letters.indexOf('a', 1));
        System.out.printf("'$' is located at index %d%n", letters.indexOf('$'));
        System.out.println();
        
        // testa lastIndexOf para localizar um caractere em uma string
        System.out.printf("Last 'c' is located at index %d%n", 
                letters.lastIndexOf('c'));
        System.out.printf("Last 'a' is located at index %d%n", 
                letters.lastIndexOf('a', 25));
        System.out.printf("Last '$' is located at index %d%n", 
                letters.lastIndexOf('$'));
        System.out.println();
        
        // testa indexOf para localizar uma substring em uma string
        System.out.printf("\"def\" is located at index %d%n", 
                letters.indexOf("def"));
        System.out.printf("\"def\" is located at index %d%n", 
                letters.indexOf("def", 7));
        System.out.printf("\"hello\" is located at index %d%n", 
                letters.indexOf("hello"));
        System.out.println();
        
        // testa lastIndexOf para localizar uma substring em uma string
        System.out.printf("Last \"def\" is located at index %d%n",
                letters.lastIndexOf("def"));
        System.out.printf("Last \"def\" is located at index %d%n",
                letters.lastIndexOf("def", 25));
        System.out.printf("Last \"hello\" is located at index %d%n",
                letters.lastIndexOf("hello"));
        System.out.println();
    }
}
