package C14Strings;

/**
 *
 * @author Fredson Sumi
 */
public class StaticCharMethods3 {
    public static void main(String[] args) {
        Character c1 = 'A';
        Character c2 = 'a';
        System.out.printf("c1: %s%nc2: %s%n%n", c1.charValue(), c2.charValue());
        System.out.printf("c1 and c2 %s equal%n", 
                c1.equals(c2) ? "are" : "are not" );
    }
}
