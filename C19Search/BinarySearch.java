package C19Search;

import java.security.SecureRandom;
import java.util.Arrays;

public class BinarySearch {
    public static int cost = 0;
    public static void main(String[] args) {
        int[] data = new int[1000];
        SecureRandom random = new SecureRandom();
        for (int i = 0; i < data.length; i++){
            data[i] = i + 1;
        }
        Arrays.sort(data);
        System.out.println("List = " + Arrays.toString(data));
    //    System.out.print("Enter a key: ");
       // int key = new Scanner(System.in).nextInt();
        int key = random.nextInt(100) + 1;
        System.out.print("Sorted number: " + key);
        System.out.println("result= " + binarySearch(data, key));
    }
    public static int binarySearch(int[] data, int key){
        int min = 0;
        int max = data.length;
        int middle = (min + max) / 2;
        int result = -1;
        while((middle != result) && (min < max)){
            if(key == data[middle]) {
                result =  middle;
            } else if(data[middle] < key){
                min = middle + 1;
            } else {
                max = middle - 1;
            }
            middle = (min + max) / 2;
            cost++;
        }
        return result;
    }
    public static void printBinary(int middle, int min, int max, int[] data){
        printBinary(middle, min, max, data, false);
    }
    private static void printBinary(int middle, int min, int max, int[] data, boolean isHeader){
        for(int i = 0; i < data.length; i++){
            int value = isHeader ? i : data[i];
            if(i >= min && i <= max) {
                if(i != middle)
                    System.out.printf(" %03d ", value);
                else
                    System.out.printf(" %03d*", value);
            }
            else
                System.out.print("     ");
        }
        System.out.println();
    }
    public static void printBinaryHeader(int min, int max, int[] data){
        for(int i = 0; i < max * 5; i++) {
            System.out.print(i % 2 == 0 ? "-" : "=");
        }
        System.out.println();
        printBinary(-1, min, max, data, true);
        for(int i = 0; i < max * 5; i++) {
            System.out.print(i % 2 == 0 ? "-" : "=");
        }
        System.out.println();
    }
}
