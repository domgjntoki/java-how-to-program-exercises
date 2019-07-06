package C14Strings;

/**
 *
 * @author Fredson Sumi
 */
public class StringMiscellaneous2 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "GOODBYE";
        String s3 = "    spaces   ";
        
        System.out.printf("s1 = %s%ns2 = %s%ns3 = %s%n%n", s1, s2, s3);
        
        // testa o método replace
        System.out.printf("Replace 'l' to 'L' in s1: %s%n%n", 
                s1.replace('l', 'L'));
        
        // testa o toLowerCase e toUpperCase
        System.out.printf("s1 in upper case: %s%n", s1.toUpperCase());
        System.out.printf("s2 in lower case: %s%n%n", s2.toLowerCase());
        
        // testa o método trim
        System.out.printf("s3 after trim: \"%s\"%n%n", s3.trim());
        
        // testa o método toCharArray
        char[] charArray = s1.toCharArray();
        System.out.printf("s1 as a character array: ", charArray);
        
        System.out.print("{");
        for(int i = 0; i < charArray.length; i++){
            if(i == charArray.length - 1)
                System.out.printf("'%c'}", charArray[i]);
            else
                System.out.printf("'%c', ", charArray[i]);
        }
        System.out.println();
        
    }
}
