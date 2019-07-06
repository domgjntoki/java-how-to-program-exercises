package C16Colecoes.exercicios;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Fredson Sumi
 */
public class NumerosPrimosFatoresPrimos {
    public static void main(String[] args) {
        Set<Integer> fatoresPrimos = new LinkedHashSet<>();
        System.out.print("Insira um número: ");
        int numero = new Scanner(System.in).nextInt();
        
        int fatores = 1;
        for(int i = 2; i < numero / 2; i++){
            if(numero % i == 0){
                fatores++;
                int fatoresDivisor = 1;
                for(int j = 2; j < (int) Math.pow(i, 0.5) + 1; j++){

                    if(i % j == 0){
                        fatoresDivisor++;
                        break;
                    }
                }
                if(fatoresDivisor == 1)
                    fatoresPrimos.add(i);
                
            }
        }
        if(fatores == 1)
            System.out.printf("O número %d é primo%n", numero);
        else
            System.out.printf("Os fatores primos de %d são: %s%n",
                    numero, fatoresPrimos);
        
            
    }
}
