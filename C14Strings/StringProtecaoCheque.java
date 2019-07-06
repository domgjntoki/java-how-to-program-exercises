package C14Strings;

/**
 *
 * @author Fredson Sumi
 */
public class StringProtecaoCheque {
    public static void main(String[] args) {
        String quantia = "99.87";
        String formato = "*********";
        String quantiaFormato = formato.substring(0, 9 - quantia.length()) + quantia;
        System.out.println(quantiaFormato);
    }
}
