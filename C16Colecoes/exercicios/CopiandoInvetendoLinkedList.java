package C16Colecoes.exercicios;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author Fredson Sumi
 */
public class CopiandoInvetendoLinkedList {
    public static void main(String[] args) {
        Character[] characteres = 
            {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        LinkedList<Character> list1 = 
                new LinkedList<>(Arrays.asList(characteres));
        System.out.printf("List1: %s%n", list1);
        LinkedList<Character> list2 = list1;
        Collections.reverse(list2);
        System.out.printf("List2: %s%n", list2);
    }
}
