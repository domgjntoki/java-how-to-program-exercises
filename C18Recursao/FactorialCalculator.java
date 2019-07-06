package C18Recursao;

import java.math.BigInteger;

/**
 *
 * @author Fredson Sumi
 */
public class FactorialCalculator {
    
    // método fatorial recursivo (supõe que o parâmetro é >= 0)ÿ
    public static BigInteger factorial(BigInteger number){
         if(number.compareTo(BigInteger.ONE) <= 0)
             return BigInteger.ONE;
             
        return number.multiply(factorial(number.subtract(BigInteger.ONE)));
         
    }
    
    public static void main(String[] args) {
        for(int i = 0; i <= 70; i++)
            System.out.printf("%d! = %d%n", i, factorial(
                    BigInteger.valueOf(i)));

    }
}
