package C18Recursao;

import java.math.BigInteger;

/**
 *
 * @author Fredson Sumi
 */
public class FibonacciCalculator {
    private static final BigInteger TWO = BigInteger.valueOf(2);
    public static int chamadas = 0;
    // declaração recursiva do método fibonacci 
    public static BigInteger fibonacci(BigInteger number) {
        // casos básicos 
        chamadas++;
        if (number.equals(BigInteger.ZERO) || number.equals(BigInteger.ONE)) 
            return number; 
        
        return fibonacci(number.subtract(BigInteger.ONE))
                .add(fibonacci(number.subtract(TWO))); 
    } 
    // exibe os valores de Fibonacci de 0 a 40
    public static void main(String[] args) {
        for (int counter = 0; counter <= 40; counter++){
            System.out.printf("Fibonacci of %d is: %d, chamadas: %d%n", counter,
                fibonacci(BigInteger.valueOf(counter)), chamadas);
            chamadas = 0;
        }
    }
}
