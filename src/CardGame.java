import java.util.ArrayList;
import java.util.Collections;

public class CardGame {

    public ArrayList<Card> deckOfCards;
    int i;

   CardGame() {
       i = 51;

       deckOfCards = new ArrayList<>();
       int value = 0;
       for (int a = 0; a <= 3; a++) {
           for (int b = 0; b <= 12; b++) {
               deckOfCards .add(new Card(a, b)) ;
               value++;
           }
       }
   }

   public ArrayList<Card> shuffleDeck(){

       Collections.shuffle(deckOfCards);
//       System.out.println("testing"+deckOfCards.get(0));
       return deckOfCards;
   }

   public void getDeck(){
       for (int i=0;i<deckOfCards.size();i++){
           System.out.println(deckOfCards.get(i));
       }
   }

   public Card dealCard(){
       return deckOfCards.get(0);
   }
    public int getTotalCards()
    {
        return i;
    }

}
