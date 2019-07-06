package C16Colecoes;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Fredson Sumi
 */
public class SetTest {
    public static void main(String[] args) {
        String[] colors = {"red", "white", "blue", "green", "gray",
            "orange", "tan", "white", "cyan", "peach", "gray", "orange"};
        List<String> list = Arrays.asList(colors);
        
        System.out.printf("With duplicates: %s%n", list);
        Set<String> set = new HashSet<>(list);
        
        System.out.printf("Without duplicates: ", set);
        
        set.forEach(color -> System.out.printf("%s ", color));

        
        System.out.println();
        
        
    }
}

