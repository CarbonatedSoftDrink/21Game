// The game is known as 21 or BlackJack

public class game {
    int wallet = 100;
    int playerScore = 0;
    int houseScore = 0;
    // Creating the deck of cards
    card[] deck = {
            new card("Spades",2), new card("Spades",3), new card("Spades",4), new card("Spades",5), new card("Spades",6), new card("Spades",7), new card("Spades",8), new card("Spades",9), new card("Spades",10), new card("Spades",11), new card("Spades",12), new card("Spades",13), new card("Spades",14),
            new card("Clubs",2), new card("Clubs",3), new card("Clubs",4), new card("Clubs",5), new card("Clubs",6), new card("Clubs",7), new card("Clubs",8), new card("Clubs",9), new card("Clubs",10), new card("Clubs",11), new card("Clubs",12), new card("Clubs",13), new card("Clubs",14),
            new card("Hearts",2), new card("Hearts",3), new card("Hearts",4), new card("Hearts",5), new card("Hearts",6), new card("Hearts",7), new card("Hearts",8), new card("Hearts",9), new card("Hearts",10), new card("Hearts",11), new card("Hearts",12), new card("Hearts",13), new card("Hearts",14),
            new card("Diamonds",2), new card("Diamonds",3), new card("Diamonds",4), new card("Diamonds",5), new card("Diamonds",6), new card("Diamonds",7), new card("Diamonds",8), new card("Diamonds",9), new card("Diamonds",10), new card("Diamonds",11), new card("Diamonds",12), new card("Diamonds",13), new card("Diamonds",14)
    };

    // Opening...
    public static void main(String[] args) {
        System.out.println("Welcome to BlackJack!");

    }

}