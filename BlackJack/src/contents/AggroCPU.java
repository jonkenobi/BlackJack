package contents;

public class AggroCPU extends CPU {

	AggroCPU(Hand hand){
		super(hand);
	}

	@Override
	public void speak() {
		System.out.println("CPU:「俺は負けんぞ！」");

	}

	public void AggroPlay(Deck deck) {
		int currentScore = this.getHand().HandScore();
		while (currentScore < 21 && currentScore != -1) {
			this.getHand().GetCard(deck.DealCard());

			currentScore = this.getHand().HandScore();

		}
	}

}
