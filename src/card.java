public class card {
    String suit;
    int value;
    char letter;

    public card(){
        this.suit = "N/A";
        this.value = 0;
        this.letter = '0';
    }

    public card(String newSuit, int newValue){
        this.suit = newSuit;
        this.value = newValue;
        if (this.value == 11){
            this.letter = 'J';
        }
        else if (this.value == 12){
            this.letter = 'Q';
        }
        else if (this.value == 13){
            this.letter = 'K';
        }
        else if (this.value == 14){
            this.letter = 'A';
        }
    }

    public String getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    public char getLetter() {
        return letter;
    }
}
