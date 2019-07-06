package C14Strings;

/**
 *
 * @author Fredson Sumi
 */
public class StringBuilderCaplen {
    public static void main(String[] args) {
        StringBuilder buffer = new StringBuilder("Hello, how are you?");
        System.out.printf("buffer: %s%nlenght: %d%ncapacity: %d%n%n",
                buffer, buffer.length(), buffer.capacity());
        
        buffer.ensureCapacity(75);
        System.out.printf("New capacity: %d%n%n", buffer.capacity());
        
        buffer.setLength(10);
        System.out.printf("New lenght: %d%nBuffer: %s%n", buffer.length(), buffer);
    }
}
