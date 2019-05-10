package contents;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Master {
	public void DisplayDeck(Deck d) {
		System.out.println("Deck Contains:");
		for (Card card : d.GetDeck()) {
			System.out.println(card);
		}
	}

	public static void main(String[] args) {
		// Initialization
		Deck Deck1 = new Deck();
		Deck1.InitDeck();
		Hand PlayersHand = new Hand();
		Hand CPUsHand = new Hand();

		//Game Start
		System.out.println("Welcome to Jono's BlackJack");
		for (int i = 0;i<=30;i++){
		System.out.print("-");
		}
		System.out.println();

		PlayersHand.GetCard(Deck1.DealCard());
		PlayersHand.GetCard(Deck1.DealCard());
		CPUsHand.GetCard(Deck1.DealCard());
		CPUsHand.GetCard(Deck1.DealCard());
		System.out.print("Your hand is:");
		PlayersHand.DisplayHand();
		System.out.print("CPU's hand is:");
		CPUsHand.DisplayHand(true);
		int rnum = new Random().nextInt(2);
		if (rnum == 0){
			ConservCPU Bob = new ConservCPU(CPUsHand,"Bob");
			Bob.ConservPlay(Deck1);
			Bob.speak();
		}
		else if(rnum == 1){
			AggroCPU Jenny = new AggroCPU(CPUsHand,"Jenny");
			Jenny.AggroPlay(Deck1);
			Jenny.speak();
		}

//
		Scanner sc = new Scanner(System.in);
		String ans = "";
		do {
		System.out.println("Do you want to add a card? (Y/N)");
		// take input

		ans = sc.nextLine().toLowerCase();
		if (!ans.equals("n")) {
				if (ans.equals("y")) {
					PlayersHand.GetCard(Deck1.DealCard());
					System.out.println("Your new hand is:");
					PlayersHand.DisplayHand();
				}
				 else {
					System.out.println("That's not a valid input!");
					System.out.println("Please enter Y or N.");
				}
				}
		}
			 while (!ans.equals("n"));
		sc.close();
		//Computer autoplays




		//Compare and Display results
		System.out.println("\nShow Hand!");
		System.out.print("Your hand is:");
		PlayersHand.DisplayHand();
		System.out.print("CPU's hand is:");
		CPUsHand.DisplayHand();
		PlayersHand.Compare(CPUsHand);
	}
	List<CPU> j = new ArrayList<CPU>();
}
