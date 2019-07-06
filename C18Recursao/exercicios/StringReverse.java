package C18Recursao.exercicios;

/**
 *
 * @author Fredson Sumi
 */
public class StringReverse {
    /**
     * aw - a = w + a = wa
     * 
     * @return String
     * @param string
     * @param length 
     */
    public static String stringReverse(String string) {
        int length = string.length();
        if(length == 1)
            return string;
        else
            return stringReverse(string.substring(1)) + string.charAt(0);
    }
    
    public static void main(String[] args) {
        System.out.println(stringReverse("reverso"));
    }
}
