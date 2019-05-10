package contents;

public abstract class CPU {
	private Hand hand;
	private String name;
	CPU(Hand cHand, String name) {
		this.hand = cHand;
		this.name = name;
	}

	public Hand getHand() {
		return this.hand;
	}

	public String getName(){
		return this.name;
	}

	void speak() {
	}

}
