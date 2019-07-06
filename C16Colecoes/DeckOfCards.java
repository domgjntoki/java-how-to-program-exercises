package C16Colecoes;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Fredson Sumi
 */
class Card{
    public static enum Face {Ace, Deuce, Three, Four, Five, Six,
        Seven, Eight, Nine, Ten, Jack, Queen, King };
    public static enum Suit {Clubs, Diamonds, Hearts, Spades};

    private final Face face;
    private final Suit suit;

    // construtor
    public Card(Face face, Suit suit){
        this.face = face;
        this.suit = suit;
    }

    // retorna face da carta
    public Face getFace(){return face;}

    // retorna naipe de Card
    public Suit getSuit(){return suit;}

    // retorna representação String de Card
    @Override
    public String toString(){
        return String.format("%s of %s", face, suit);
    }
}

public class DeckOfCards{
    private List<Card> list;

    public DeckOfCards(){
        Card[] deck = new Card[52];
        int i = 0;

        for(Card.Suit suit : Card.Suit.values())
            for(Card.Face face : Card.Face.values()){
                deck[i] = new Card(face, suit);
                i++;
            }

        list = Arrays.asList(deck);
        Collections.shuffle(list);
    }

    public void printCards(){
        for(int i = 0; i < list.size(); i++){
            System.out.printf("%-19s%s", list.get(i), 
                    ((i + 1) % 4 == 0) ? "\n" : "");
            
        }
    }
    
    public static void main(String[] args) {
        DeckOfCards cards = new DeckOfCards();
        cards.printCards();
    }
}
    
   
    
    


