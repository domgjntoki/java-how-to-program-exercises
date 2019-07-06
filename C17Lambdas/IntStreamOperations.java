package C17Lambdas;

import java.util.stream.IntStream;

/**
 *
 * @author Fredson Sumi
 */
public class IntStreamOperations {
    public static void main(String[] args) {
        int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};
        // exibe valores originais
        System.out.print("Original values: ");
        IntStream.of(values)
                .forEach(value -> System.out.printf("%d ", value));
        System.out.println();
 
        // count, min, max, sum e average dos valores
        System.out.printf("%nCount: %d%n", IntStream.of(values).count());
        System.out.printf("Max: %d%n", IntStream.of(values).max().getAsInt());
        System.out.printf("Min: %d%n", IntStream.of(values).min().getAsInt());
        System.out.printf("Sum: %d%n", IntStream.of(values).sum());
        System.out.printf("Average: %,.2f%n", 
                IntStream.of(values).average().getAsDouble());
        // Recebendo todos os resultados com summaryStatics
        System.out.println(IntStream.of(values).summaryStatistics());
        
        // soma dos valores com o método reduce
        System.out.printf("%nSum via reduce method: %d%n", 
                IntStream.of(values).reduce(0, (x, y) -> x + y));
        
        // soma das raízes quadradas dos valores com o método reduce
        System.out.printf("Sum of squares via reduce method: %d%n",
                IntStream.of(values).reduce(0, (x, y) -> x + y * y));
        
        // produto dos valores com o método reduce
        System.out.printf("Product via reduce method: %d%n", 
                IntStream.of(values).reduce(1, (x, y) -> x * y));
        
        // valores pares exibidos em ordem classificada
        System.out.printf("%nEven values printed in sorted order: ");
        IntStream.of(values)
                .filter(value -> value % 2 == 0)
                .sorted()
                .forEach(value -> System.out.printf("%d ", value));
        System.out.println();
        
        // valores ímpares multiplicados por 10 e exibidos em ordem classificada
        System.out.printf(
                "Odd values multiplied by 10 diplayed in sorted order");
        IntStream.of(values)
                .filter(value -> value % 2 == 1)
                .map(value -> value * 10)
                .sorted()
                .forEach(value -> System.out.printf("%d ", value));
        System.out.println();
        
        // soma o intervalo dos números inteiros de 1 a 10, exclusivo
        System.out.printf("%nSum of integers from 1 to 9: %d",
                IntStream.range(1, 10).sum());
        
        // soma o intervalo dos números inteiros de 1 a 10, inclusive
        System.out.printf("Sum of integers from 1 to 10: %d%n",
                IntStream.rangeClosed(1, 10).sum());
        
        
    }
}
