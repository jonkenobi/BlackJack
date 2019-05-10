package contents;

public class Card {
	private String Suit;
	private int Number;
	public static String[] Suits = {"♡","♦","♣","♠"};
	Card(String Suit,int Number){
		this.Suit = Suit;
		this.Number = Number;
	}

	public int point(){
		if (this.Number>10){
			return 10;
		}
		if (this.Number==1){
			return 0;//marker for ace;
//			will deal with this in the HandScore class
		}
		return this.Number;
	}
	@Override
	public String toString(){
		return (this.Suit+this.Number);
	}

}