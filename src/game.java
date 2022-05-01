// The game is known as 21 or BlackJack
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class game {

    public static void menu1(int currency){
        System.out.println("Your wallet contains: "+ currency + " chips.");
        System.out.println("Please select an option:");
        System.out.println("1. Join the table");
        System.out.println("2. Do nothing");
        System.out.println("0. Exit");
    }

    public static void menu2(int currency){
        System.out.println("Your wallet contains: "+ currency + " chips.");
        System.out.println("Please select an option:");
        System.out.println("1. Place an opening bet");
        System.out.println("0. Exit");
    }

    public static void displayHand(ArrayList<card> hand){
        for (int i = 0; i < hand.size(); i++){
            hand.get(i).displayCard();
            System.out.print(", ");
        }

    }

    public static void deal(card[] deck, card[] using, ArrayList<card> hand){
        Random random = new Random();
        int capacity = deck.length;
        int chosen = random.nextInt(capacity);
        hand.add(deck[chosen]);
        using[using.length-1] = deck[chosen];

    }

    public static int playGame(int wallet){
        // Hands
        ArrayList<card> playerHand = new ArrayList<>();
        ArrayList<card> houseHand = new ArrayList<>();
        // arrays and variables
        Random randomObj = new Random();
        int playerScore = 0;
        int houseScore = 0;
        int bet = 0;
        Scanner read = new Scanner(System.in);
        String answer = "-1";
        card[] deck = {
                new card("Spades",2), new card("Spades",3), new card("Spades",4), new card("Spades",5), new card("Spades",6), new card("Spades",7), new card("Spades",8), new card("Spades",9), new card("Spades",10), new card("Spades",11), new card("Spades",12), new card("Spades",13), new card("Spades",14),
                new card("Clubs",2), new card("Clubs",3), new card("Clubs",4), new card("Clubs",5), new card("Clubs",6), new card("Clubs",7), new card("Clubs",8), new card("Clubs",9), new card("Clubs",10), new card("Clubs",11), new card("Clubs",12), new card("Clubs",13), new card("Clubs",14),
                new card("Hearts",2), new card("Hearts",3), new card("Hearts",4), new card("Hearts",5), new card("Hearts",6), new card("Hearts",7), new card("Hearts",8), new card("Hearts",9), new card("Hearts",10), new card("Hearts",11), new card("Hearts",12), new card("Hearts",13), new card("Hearts",14),
                new card("Diamonds",2), new card("Diamonds",3), new card("Diamonds",4), new card("Diamonds",5), new card("Diamonds",6), new card("Diamonds",7), new card("Diamonds",8), new card("Diamonds",9), new card("Diamonds",10), new card("Diamonds",11), new card("Diamonds",12), new card("Diamonds",13), new card("Diamonds",14)
        };
        card[] using = new card[52];

        // TODO bet first, then deal cards.
        System.out.println("Playing...");
        System.out.println("This version is played with 1 deck of 52 cards.");
        while(!answer.equals("0")){
            while (bet <= 0){
                menu2(wallet);
                answer = read.nextLine();
                if (answer.equals("0")){
                    System.out.println("Exiting the table...");
                    return wallet;
                }
                else if (answer.equals("1")){
                    try{
                        System.out.println("Please enter the amount you'd like to bet: ");
                        bet = read.nextInt();
                        break;
                    }
                    catch (Exception e){
                        System.out.println("Invalid input.");
                    }
                }
                else {
                    System.out.println("Sorry, your answer is unreadable.");
                }

            }
            System.out.println("Great! Dealing out cards...");
            // First deal
            playerHand.add(deck[randomObj.nextInt(deck.length)]);
            houseHand.add(deck[randomObj.nextInt(deck.length)]);
            playerHand.add(deck[randomObj.nextInt(deck.length)]);
            houseHand.add(deck[randomObj.nextInt(deck.length)]);
        }

        return wallet;
    }

    // Main
    public static void main(String[] args) {
        // Variables
        int wallet = 100;
        //
        Scanner read = new Scanner(System.in);
        String answer = "-1";

        // Opening...
        while (!answer.equals("0")){
            System.out.println("Welcome to BlackJack!");
            menu1(wallet);
            answer = read.nextLine();
            //System.out.println(answer);

            switch (answer) {
                case "1":
                    System.out.println("Joining the table...");
                    wallet = playGame(wallet);
                    break;
                case "2":
                    System.out.println("Doing nothing...");
                    break;
                case "0":
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Your option was unreadable. Please try again.");
                    break;
            }
        }

    }

}