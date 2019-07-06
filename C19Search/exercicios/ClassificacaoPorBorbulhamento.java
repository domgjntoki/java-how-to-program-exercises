package C19Search.exercicios;

import java.security.SecureRandom;
import java.util.Arrays;

public class ClassificacaoPorBorbulhamento {
    private static void borbSort(int[] data){
        for(int i = 0; i < data.length - 1; i++){
            int hasChanges = 0;
            for(int j = 0; j < data.length - i - 1; j++){
                if(data[j] > data[j + 1]){
                    hasChanges++;
                    int hold = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = hold;
                }
            }
            if(hasChanges == 0) break;
        }
    }

    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int[] data = random.ints(20, 1, 100).toArray();
        System.out.println("Array = " + Arrays.toString(data));
        borbSort(data);
        System.out.println("Array = " + Arrays.toString(data));
    }
}
