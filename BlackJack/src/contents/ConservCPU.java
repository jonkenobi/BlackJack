package contents;

public class ConservCPU extends CPU {

	ConservCPU(Hand hand){
		super(hand);
	}
	@Override
	public void speak() {
		System.out.println("CPU:「この手札いいですね」");
	}

	public void ConservPlay(Deck deck){
			int currentScore = this.getHand().HandScore();
			while (currentScore+7 < 21 && currentScore != -1) {
				this.getHand().GetCard(deck.DealCard());

				currentScore = this.getHand().HandScore();

			}
	}
}
