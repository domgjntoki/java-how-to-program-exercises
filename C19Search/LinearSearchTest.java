package C19Search;

import java.util.Scanner;

public class LinearSearchTest {
    public static <T> int linearSearch(T[] data, T searchKey){
        for(int i = 0; i < data.length; i++){
            if(searchKey == data[i])
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("a");

    }
}
