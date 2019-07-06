package C18Recursao.exercicios;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Fredson Sumi
 */
public class MinimumValueArray {

    public static int recursiveMinimum(List<Integer> array){
        int size = array.size();
        if(size == 1) return array.get(0);
        
        return Math.min(recursiveMinimum(array.subList(1, size)), array.get(0));
    }
    public static void main(String[] args) {
        Integer[] values2 = {2, 3, 1, 5, -89, -72, 2, -4, 0};
        List<Integer> array = Arrays.asList(values2);
        System.out.println(recursiveMinimum(array));
    }
}
