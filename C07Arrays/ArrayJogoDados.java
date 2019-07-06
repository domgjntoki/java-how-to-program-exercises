package C07Arrays;
import java.security.SecureRandom;
public class ArrayJogoDados {
    public static void main(String[] args) {
        SecureRandom dado = new SecureRandom();
        int soma;
        int[] possibilidades = new int [11];
        for (int i = 0; i < 36000000; i++){
            soma = 2 + dado.nextInt(6) + dado.nextInt(6);
            ++possibilidades[soma - 2];
        }
        
        for (int i = 0; i < possibilidades.length; i++){
            System.out.printf("%2d: %d%n", i + 2, possibilidades[i]);
        }        
    }
}
