// The game is known as 21 or BlackJack
import java.util.ArrayList;
import java.util.Scanner;

public class game {
    // Creating the deck of cards
    card[] deck = {
            new card("Spades",2), new card("Spades",3), new card("Spades",4), new card("Spades",5), new card("Spades",6), new card("Spades",7), new card("Spades",8), new card("Spades",9), new card("Spades",10), new card("Spades",11), new card("Spades",12), new card("Spades",13), new card("Spades",14),
            new card("Clubs",2), new card("Clubs",3), new card("Clubs",4), new card("Clubs",5), new card("Clubs",6), new card("Clubs",7), new card("Clubs",8), new card("Clubs",9), new card("Clubs",10), new card("Clubs",11), new card("Clubs",12), new card("Clubs",13), new card("Clubs",14),
            new card("Hearts",2), new card("Hearts",3), new card("Hearts",4), new card("Hearts",5), new card("Hearts",6), new card("Hearts",7), new card("Hearts",8), new card("Hearts",9), new card("Hearts",10), new card("Hearts",11), new card("Hearts",12), new card("Hearts",13), new card("Hearts",14),
            new card("Diamonds",2), new card("Diamonds",3), new card("Diamonds",4), new card("Diamonds",5), new card("Diamonds",6), new card("Diamonds",7), new card("Diamonds",8), new card("Diamonds",9), new card("Diamonds",10), new card("Diamonds",11), new card("Diamonds",12), new card("Diamonds",13), new card("Diamonds",14)
    };

    // Hands
    ArrayList<card> playerHand = new ArrayList<>();
    ArrayList<card> houseHand = new ArrayList<>();

    public static void menu1(int currency){
        System.out.println("Your wallet contains: "+ currency + " chips.");
        System.out.println("Please select an option:");
        System.out.println("1. Join the table");
        System.out.println("2. Do nothing");
        System.out.println("3. Exit");
    }

    public static int playGame(int wallet){
        System.out.println("Playing...");
        return wallet;
    }

    // TODO make playable version for console.
    public static void main(String[] args) {
        // Variables
        int wallet = 100;
        int playerScore = 0;
        int houseScore = 0;
        //
        Scanner read = new Scanner(System.in);
        String answer = "0";

        // Opening...
        while (!answer.equals("3")){
            System.out.println("Welcome to BlackJack!");
            menu1(wallet);
            answer = read.nextLine();
            //System.out.println(answer);

            switch (answer) {
                case "1":
                    System.out.println("Joining the table...");
                    playGame(wallet);
                    break;
                case "2":
                    System.out.println("Doing nothing...");
                    break;
                case "3":
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Your option was unreadable. Please try again.");
                    break;
            }
        }

    }

}