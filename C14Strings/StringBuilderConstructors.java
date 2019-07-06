package C14Strings;

/**
 *
 * @author Fredson Sumi
 */
public class StringBuilderConstructors {
    public static void main(String[] args) {
        StringBuilder buffer1 = new StringBuilder();
        StringBuilder buffer2 = new StringBuilder(10);
        StringBuilder buffer3 = new StringBuilder("hello");
        
        StringBuilder[] buffers = {buffer1, buffer2, buffer3};
        for(int i = 0; i < buffers.length; i++)
            System.out.printf("buffer%d: \"%s\"%n", i + 1, buffers[i]);
        
    }
}
