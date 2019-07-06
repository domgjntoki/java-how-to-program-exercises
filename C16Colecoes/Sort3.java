package C16Colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Fredson Sumi
 */
public class Sort3 {
    public static void main(String[] args) {
        List<Time2> list = new ArrayList<>();
        list.add(new Time2(6, 24, 34));
        list.add(new Time2(18, 14, 58));
        list.add(new Time2(6, 5, 54));
        list.add(new Time2(12, 14, 58));
        list.add(new Time2(6, 24, 22));
        
        // gera saída de elementos List
        System.out.printf("Unsorted array elements: %s%n", list);
        
        // classifica em ordem utilizando um comparador
        Collections.sort(list, new TimeComparator());
        
        // gera saída de elementos List
        System.out.printf("Sorted array elements: %s%n", list);
    }
}
