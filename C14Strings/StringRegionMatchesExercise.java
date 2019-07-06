package C14Strings;

import java.util.Scanner;

/**
 *
 * @author Fredson Sumi
 */
public class StringRegionMatchesExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("s1: ");
        String s1 = input.nextLine();
        System.out.print("s2: ");
        String s2 = input.nextLine();
        System.out.print("Número de comparações: ");
        int compareNumber = input.nextInt();
        System.out.print("Index inicial de comparação: ");
        int initialIndex = input.nextInt();
        
        System.out.println(s1.regionMatches(
                initialIndex, s2, initialIndex, compareNumber));
    }
}
