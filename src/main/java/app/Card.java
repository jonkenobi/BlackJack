package app;

public class Card {
    private String Suit;
    private int Number;

    //TODO Issues with decoding were causing symbols to not display properly here.
    // Will fix UTF-8 encoding in future to display symbols.
    public static String[] Suits = {"Heart", "Diamond", "Club", "Spade"};

    Card(String Suit, int Number) {
        this.Suit = Suit;
        this.Number = Number;
    }

    public int point() {
        if (this.Number > 10) {
            return 10;
        }
        if (this.Number == 1) {
            return 0;//marker for ace;
            //will deal with this in the HandScore class
        }
        return this.Number;
    }

    @Override
    public String toString() {
        switch (Number) {
            case 1:
                return (this.Suit + "A");

            case 11:
                return (this.Suit + "J");

            case 12:
                return (this.Suit + "Q");

            case 13:
                return (this.Suit + "K");
            default:
                return this.Suit + this.Number;
        }
    }
}

