package C19Search.exercicios;

import C19Search.BinarySearch;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;


public class RecursiveBinarySearch {
    public static int recCost = 0;
    private static int recursiveLinearSearch(int key, int data[]){
        return recursiveBinarySearch(key, data, 0, data.length);
    }
    private static int recursiveBinarySearch(int key, int data[], int min, int max) {
        recCost++;
        int middle = (min + max) / 2;
        // base case: stop search when min >= max or when found the index
        if (min >= max || data[middle] == key)
            return middle >= data.length ? -1 : (data[middle] == key ? middle : - 1);
        else if (data[middle] < key)
            return recursiveBinarySearch(key, data, middle + 1, max);
        else
            return recursiveBinarySearch(key, data, min, middle - 1);
    }

    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int loop = 100000;
        long start = System.nanoTime();
        for(int i = 0; i < loop; i++){
            int[] data = random.ints(25, -99, 99).toArray();
            Arrays.sort(data);
            int key = random.nextInt(199) - 99;
            int a = recursiveLinearSearch(key, data);
        }
        System.out.println("Recursive Time: " + (System.nanoTime() - start) / 1000000 + " ms");
        start = System.nanoTime();
        for(int i = 0; i < loop; i++){
            int[] data = random.ints(25, -99, 99).toArray();
            Arrays.sort(data);
            int key = random.nextInt(199) - 99;
            int a = BinarySearch.binarySearch(data, key);
        }
        System.out.println("Linear Time: " + (System.nanoTime() - start) / 1000000 + " ms");

        int[] data = random.ints(25, -99, 99).toArray();
        Arrays.sort(data);
        int key = random.nextInt(199) - 99;
        recCost = 0;
        BinarySearch.cost = 0;
        recursiveLinearSearch(key, data);
        BinarySearch.binarySearch(data, key);
        System.out.println("recCost = " + recCost);
        System.out.println("BinarySearch.cost = " + BinarySearch.cost);
    }
}
