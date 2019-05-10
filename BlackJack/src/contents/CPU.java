package contents;

public abstract class CPU {
	private Hand hand;

	CPU(Hand cHand) {
		this.hand = cHand;
	}

	public Hand getHand() {
		return this.hand;
	}

	void speak() {
	}

}
