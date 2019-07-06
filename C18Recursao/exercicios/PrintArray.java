package C18Recursao.exercicios;

/**
 *
 * @author Fredson Sumi
 */
public class PrintArray {
    public static void printArray(int[][] array){
        
        for (int[] array1 : array) {
            for (int i = 0; i < array1.length; i++)
                System.out.print(array1[i] + " ");
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int[][] array = new int[8][8];
        printArray(array);
        
    }
}
