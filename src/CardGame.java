import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CardGame {

    public Card[] cards;
    int i;

   CardGame() {
       i = 51;

       cards = new Card[52];
       int value = 0;
       for (int a = 0; a <= 3; a++) {
           for (int b = 0; b <= 12; b++) {
               cards[value] = new Card(a, b);
               value++;
           }
       }
   }

   public Card dealCard(){
       Random generator = new Random();
       int index=0;

       do {
           index = generator.nextInt( 52 );
       } while (cards[index] == null);

       i--;
       Card temp = cards[index];
       cards[index]= null;
       return temp;
   }
    public int getTotalCards()
    {
        return i;
    }

//    public void sortDeckIntoSuits(){
//       for (int i=0;i<52;i++){
//           String suits = suit[deckOfCards[i] / 13];
//           String rank = symbol[deckOfCards[i] % 13];
//           System.out.println( rank + " of " + suits);
//           System.out.println(remaining);
//       }
//
//    }


//    public List<Card> getDeck(){
//        return List.copyOf(cards);
//    }
//
//    public ArrayList<Card> load(){
//        ArrayList<Card> cards=new ArrayList<>();
////        cards.add(Card.);
//        return cards;
//    }
}
