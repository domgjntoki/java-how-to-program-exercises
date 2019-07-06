package C14Strings;

/**
 *
 * @author Fredson Sumi
 */
public class StringConstructors {
    public static void main(String[] args) {
        char[] charArray = {'b', 'i', 'r', 't', 'h', ' ', 'd', 'a', 'y'};
        String s = new String("hello");
        
        String s2 = new String();
        String s3 = new String(s);
        String s4 = new String(charArray);
        String s5 = new String(charArray, 6, 3);
        
        System.out.printf(
            "s = %s%ns2 = %s%ns3 = %s%ns4 = %s%ns5 = %s%n",s, s2, s3, s4, s5);
                
    }
}
