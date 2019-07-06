package C07Arrays;

import java.util.Arrays;
import java.util.Collections;
import javax.print.attribute.IntegerSyntax;

/**
 *
 * @author Fredson Sumi
 */
public class accessibility {
    public static void main(String[] args) {
        int[] numeros = {1, 2, -3, 3, 0};
        int min = Arrays.stream(numeros).min().getAsInt();
        System.out.println(min);
    }
}
