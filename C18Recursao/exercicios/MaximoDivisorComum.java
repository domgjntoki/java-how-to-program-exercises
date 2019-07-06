package C18Recursao.exercicios;

/**
 *
 * @author Fredson Sumi
 */
public class MaximoDivisorComum {
    public static int mdc(int x, int y){
        if(y == 0)
            return x;
        
        return mdc(y, x % y);
    }
    
    public static void main(String[] args) {
        System.out.println(mdc(215, 115));
    }
}
