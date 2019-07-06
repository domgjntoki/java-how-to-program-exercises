package C07Arrays;

public class ArrayFractions {
    public static void main(String[] args) {
        final int ARRAY_SIZE = 10;
        
        double[] fractions = new double[ARRAY_SIZE];
        
        fractions[9] = 5.667;
        fractions[6] = 3.333;
        
        double total = 0;
        
        for (int x = 0; x < fractions.length; x++)
            total += fractions[x];
        
    }
}
