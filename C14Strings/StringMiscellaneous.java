package C14Strings;

/**
 *
 * @author Fredson Sumi
 */
public class StringMiscellaneous {
    public static void main(String[] args) {
        String s1 = "hello there";
        char[] charArray = new char[5];
        
        System.out.printf("s1 = %s%n", s1);
        
        // testa o método lenght
        System.out.printf("s1 lenght = %d%n", s1.length());
        
        // faz loop pelos caracteres em s1 com charAt e os exibe na ordem inversa
        System.out.print("The string inversed is : ");
        for(int i = s1.length() - 1; i >= 0; i--)
            System.out.printf("%c ", s1.charAt(i));

        // copia caracteres a partir de string para charArray
        s1.getChars(0, 5, charArray, 0);
        
        System.out.printf("%nThe character array is: ");
        for(char character : charArray)
            System.out.printf("%c", character);
        
        System.out.println();
    }
}
