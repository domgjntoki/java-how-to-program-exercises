package C16Colecoes;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Fredson Sumi
 */
public class ListTest {
    public static void main(String[] args) {
        String[] colors = 
            {"black", "yellow", "green", "blue", "violet", "silver"};
        List<String> list1 = new LinkedList<>();
        list1.addAll(Arrays.asList(colors));
        
        String[] colors2 = 
            {"gold", "white", "brown", "blue", "gray", "silver"};
        List<String> list2 = new LinkedList<>();
        list2.addAll(Arrays.asList(colors2));
        
        list1.addAll(list2);
        list2 = null;
        printList(list1);
        
        convertToUppercaseStrings(list1);
        printList(list1);
        
        System.out.printf("%nDeleting elements 4 to 6...");
        removeItens(list1, 4, 7);
        printList(list1);
        printReversedList(list1);
    }
    
    public static void printList(List<String> list) {
        System.out.printf("%nlist%n");
        for(String color : list)
            System.out.printf("%s ", color);
        System.out.println();
    }
    
    public static void convertToUppercaseStrings(List<String> list) {
        ListIterator<String> iterator = list.listIterator();
        
        while (iterator.hasNext()) {
            String color = iterator.next(); // obtém o item
            iterator.set(color.toUpperCase()); // converte em letras maiúsculas
        }
        
    }
    
    public static void removeItens(List<String> list, int start, int end) {
        list.subList(start, end).clear();
    }
    
    public static void printReversedList(List<String> list) {
        ListIterator<String> iterator = list.listIterator(list.size());
        
        System.out.printf("%nReversed list:%n");
        
        while (iterator.hasPrevious()) {
            System.out.printf("%s ", iterator.previous());
        }
        System.out.println();
    }
}
