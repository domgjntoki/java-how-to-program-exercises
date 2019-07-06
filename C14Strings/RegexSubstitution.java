package C14Strings;

/**
 *
 * @author Fredson Sumi
 */
public class RegexSubstitution {
    public static void main(String[] args) {
        String firstString = "This sentence ends in 5 stars: *****";
        System.out.printf("Original String stars: %s%n", firstString);
        
        firstString = firstString.replaceAll("\\*", "^");
        System.out.printf("^ substituted for *: %s%n", firstString);
        // substitui asteriscos por circunflexos
        firstString = firstString.replaceAll("stars", "carets");
        System.out.printf(
            "\"carets\" substituted for \"stars\": %s%n", firstString);
    }
}
