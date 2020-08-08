package app;

public class ConservCPU extends CPU {

	ConservCPU(Hand hand, String name){
		super(hand,name);
	}
	@Override
	public void speak() {
		System.out.println(this.getName()+": Great draw");
	}

	public void ConservPlay(Deck deck){
			int currentScore = this.getHand().HandScore();
			while (currentScore+7 < 21 && currentScore != -1) {
				this.getHand().GetCard(deck.DealCard());

				currentScore = this.getHand().HandScore();

			}
	}
}
