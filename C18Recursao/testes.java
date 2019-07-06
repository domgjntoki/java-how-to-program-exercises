package C18Recursao;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Fredson Sumi
 */
public class testes {
    public static void main(String[] args) {
        int pot = 0;
        for(int n = 5; (n/= 2) > 0; pot++);
        System.out.println(pot);
        
    }
} 

