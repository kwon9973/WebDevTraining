package poker_Game; 
import java.util.ArrayList;
import java.util.Arrays;

public class Poker_Game {

	public static void main(String[] args) {
		Cards cards = new Cards();
		do {
			cards.buildDeck(); 
			cards.shuffleDeck();
			cards.handingOne();
			cards.handingTwo();	
			cards.setTable();
			cards.close();
		}while(true);
	}

}
