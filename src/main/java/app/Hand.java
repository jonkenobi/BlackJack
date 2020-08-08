package app;

import java.util.ArrayList;

public class Hand {
    ArrayList<Card> Hand = new ArrayList<Card>();

    public void GetCard(Card newcard) {
        this.Hand.add(newcard);
    }

    public void DisplayHand() {
        String dHand = "";
        for (Card card : this.Hand) {
            dHand += "|" + card.toString();
        }
        System.out.println(dHand + "|");
    }

    public void DisplayHand(Boolean HideCards) {
        String dHand = "|";
        dHand += this.Hand.get(0).toString();
        System.out.println(dHand + "| * |");
    }

    int HandScore() {
        int Score1 = 0;
        int acemarker = 0;
        for (Card card : this.Hand) {
            if (card.point() == 0) {
                acemarker += 1;
            }
            Score1 += card.point();
        }
        if (acemarker > 0) {
            for (int i = 0; i < acemarker; i++) {
                if (Score1 + 11 <= 21) {
                    // if adding 11 is possible
                    Score1 += 11;
                } else {
                    // else treat ace as 1
                    Score1 += 1;
                }
            }
        }
        if (Score1 > 21) return -1;
        return Score1;
    }

    void Compare(Hand h2) {
        int myScore = this.HandScore();
        int opScore = h2.HandScore();

        if (myScore > opScore) {
            System.out.println("You win!");
        } else if (myScore == opScore) {
            System.out.println("It's a draw");
        } else if (myScore < opScore) {
            System.out.println("The computer wins!");
        }
    }
}
