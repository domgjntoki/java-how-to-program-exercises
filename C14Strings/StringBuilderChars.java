package C14Strings;

/**
 *
 * @author Fredson Sumi
 */
public class StringBuilderChars {
    public static void main(String[] args) {
        StringBuilder buffer = new StringBuilder("hello there");
        System.out.println("buffer: " + buffer);
        System.out.printf("Character at 0: %c%nCharacter at 4: %c%n%n",
                buffer.charAt(0), buffer.charAt(4));

        
        char[] charArray = new char[buffer.length()];
        buffer.getChars(0, buffer.length(), charArray, 0);
        
        System.out.print("The caracters are: ");
        for(char character : charArray)
            System.out.printf("%c", character);

        buffer.setCharAt(0, 'H');
        buffer.setCharAt(6, 'T');
        
        System.out.printf("%n%nbuffer = %s", buffer.toString());
        
        buffer.reverse();
        System.out.printf("%n%nbuffer = %s%n", buffer.toString());
    }
}
