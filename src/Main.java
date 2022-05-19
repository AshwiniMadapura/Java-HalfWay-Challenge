public class Main {
    public static void main(String[] args) {
        CardGame cardGame=new CardGame();
        Card card;
        System.out.println("Sorted deck into suits"); cardGame.getDeck();
        cardGame.shuffleDeck();
        System.out.println("Shuffled cards are"); cardGame.getDeck();
        System.out.println("First card on top of deck is:"); cardGame.dealCard();

    }
}