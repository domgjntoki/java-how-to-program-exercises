package C18Recursao.exercicios;

/**
 *
 * @author Fredson Sumi
 */
public class RecursionPower {
    public static int power(int base, int expoente){
        if(expoente <= 0)
            return 1;
        
        return base * power(base, expoente - 1);
    }
    
    public static void main(String[] args) {
        System.out.println(power(2, 3));
    }
}
