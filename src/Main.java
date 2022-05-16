public class Main {
    public static void main(String[] args) {
        CardGame cardGame=new CardGame();
        Card card;
        while (cardGame.getTotalCards()!= 0 )
        {
            card = cardGame.dealCard();
            System.out.println( card.toString() );
        }

    }
}