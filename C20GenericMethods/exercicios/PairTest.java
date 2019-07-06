package C20GenericMethods.exercicios;

import java.util.List;

public class PairTest {
    public static void main(String[] args) {
        Pair<String, Integer> person = new Pair<>("Fredson", 17);
        Pair<String, String> couple = new Pair<>("Otaku", "Trap");
        Pair<Integer, Integer> firstPrimes = new Pair<>(2, 3);
        Pair<String, Boolean> isGay = new Pair<>("Lucas", Boolean.TRUE);
        Pair<String, Character> firstLetter = new Pair<>("Astolfo", 'A');
        Pair<Double, Float> doubleFloatPair = new Pair<>(5.678, 231.432f);
        Pair listPair[] = {person, couple, firstPrimes, isGay, firstLetter, doubleFloatPair};
        for(Pair pair : listPair){
            System.out.println(pair);
        }
    }
}
