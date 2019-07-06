package C19Search.exercicios;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class RecursiveLinearSearch {
    private static int recursiveLinearSearch(int key, int data[]){
        return recursiveLinearSearch(key, data, 0);
    }
    private static int recursiveLinearSearch(int key, int data[], int index){
        if(index == data.length)
            return -1;
        if(key == data[index])
            return index;
        else
            return recursiveLinearSearch(key, data, ++index);
    }

    public static void main(String[] args) {
        int[] data = new SecureRandom().ints(15, 0, 15).toArray();
        System.out.println("Array: " + Arrays.toString(data));
        System.out.print("Enter a key: ");
        int key = new Scanner(System.in).nextInt();
        System.out.println("Found at: " + recursiveLinearSearch(key, data));
    }
}
