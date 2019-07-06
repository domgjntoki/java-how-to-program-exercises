package C14Strings;

import java.util.Scanner;

/**
 *
 * @author Fredson Sumi
 */
public class StringCompareToExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("s1: ");
        String s1 = input.nextLine();
        System.out.print("s2: ");
        String s2= input.nextLine();
        
        if(s1.compareTo(s2) < 0)
            System.out.println("s1 < s2");
        else if (s1.compareTo(s2) > 0)
            System.out.println("s1 > s2");
        else
            System.out.println("s1 = s2");
    }
}
