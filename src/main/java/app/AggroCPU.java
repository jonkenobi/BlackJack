package app;

public class AggroCPU extends CPU {

    AggroCPU(Hand hand, String name) {
        super(hand, name);
    }

    @Override
    public void speak() {
        System.out.println(this.getName() + ": I ain't gonna lose!");
    }

    public void AggroPlay(Deck deck) {
        int currentScore = this.getHand().HandScore();
        while (currentScore < 21 && currentScore != -1) {
            this.getHand().GetCard(deck.DealCard());

            currentScore = this.getHand().HandScore();
        }
    }

}
