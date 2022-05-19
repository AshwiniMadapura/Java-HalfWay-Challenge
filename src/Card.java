public class Card {

    private int rank,suit;
     String[] suits={"\u2665", "\u2666", "\u2663", "\u2660"};
     int value=0;
     String[] symbol={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    int[] deckOfCards=new int[52];

    Card(int suit,int rank){
        this.rank=rank;
        this.suit=suit;
    }
    public String toString()
    {
        return symbol[rank] + " of " + suits[suit];
    }


}
