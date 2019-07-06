package C17Lambdas;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author Fredson Sumi
 */
public class testes {
    public static void main(String[] args) {
        System.out.print("Insira um numero: ");
        int numero = new Scanner(System.in).nextInt();
        
        System.out.printf("%d! = %d%n", 
            numero, IntStream.rangeClosed(1, numero).reduce(1, (x, y) -> x*y));
    }
}
