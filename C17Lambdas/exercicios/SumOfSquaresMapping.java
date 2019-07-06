package C17Lambdas.exercicios;

import java.util.stream.IntStream;

/**
 *
 * @author Fredson Sumi
 */
public class SumOfSquaresMapping {
    public static void main(String[] args) {
        int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};
        int soma = IntStream.of(values).map(value -> value * value).sum();
        System.out.println(soma);
    }
}
