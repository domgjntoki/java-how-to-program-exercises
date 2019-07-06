package C14Strings;

/**
 *
 * @author Fredson Sumi
 */
public class String5for3 {
    public static void main(String[] args) {
        String bathe = "bathe";
        System.out.println(bathe);
        int anagramas = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    if( i != j && j != k && i != k){
                        System.out.printf("%c%c%c%n", 
                            bathe.charAt(i), bathe.charAt(j), bathe.charAt(k));
                            anagramas++;
                    }
                }
            }
        }
        System.out.printf("anagramas: %d%n", anagramas);
    }
}
