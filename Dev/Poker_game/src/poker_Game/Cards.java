package poker_Game;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.*;

public class Cards extends Player{
	
	//Class that has a single card data fields
	private class Card{
		private String suites;
		private String numbers;
	
		Card(String suit, String num){
			this.suites = suit;
			this.numbers = num;
		}
		public String toString() {
			return suites + "-" + numbers;
		}
		public String getSuites() {
			return this.suites;
		}
		public String getNumbers() {
			return this.numbers;
		}
	}
	
	
	//Create an ArrayList to add a single card until we have a full deck
	//we use Card type ArrayList to add the Card data(Two values: suite and number)
	private ArrayList <Card> Deck = new ArrayList<>();
	public void buildDeck() {
		String[] suites = {"C","H","D","S"};
		String[] numbers = {"2","3","4","5","6","7","8","9","10","11","12","13","14"};
		
		for(int i = 0; i < suites.length; i++) {
			for(int j = 0; j < numbers.length; j++) {
				Card card = new Card(suites[i],numbers[j]); // a multiple of Card constructors
				Deck.add(card);
			}
		}
		System.out.println("Deck is built ");
	}
	
	
	
	
	
	//shuffle the Deck
	Random rand = new Random();
	public void shuffleDeck() {
		for (int i = 0; i < Deck.size(); i++) {
			int j = rand.nextInt(Deck.size());
			Card currentCard = Deck.get(i);
			Card randomCard = Deck.get(j);
			Deck.set(i, randomCard);
			Deck.set(j, currentCard);
		}
		System.out.println();
		System.out.println();
	}
	
	
	
	
	//remove two cards on top of the deck for player one
	//if there are more than two players, make an object for multiple players for handing two cards for each
	//storing the two cards on hand in ArrayList for each player
	ArrayList<Card> playerOne = new ArrayList<>(); 
	ArrayList<Card> playerTwo = new ArrayList<>();
	public void handingOne() {
		if(!playerOne.isEmpty()) {
			playerOne.clear();
		}
		System.out.println("Player 1 cards'");
		playerOne.add(Deck.remove(Deck.size()-1));
		playerOne.add(Deck.remove(Deck.size()-1));
		System.out.println(playerOne.toString());
		System.out.println();
		
	}
	
	
	
	
	//remove two cards on top of the deck for player two
	public void handingTwo() {
		if(!playerTwo.isEmpty()) {
			playerTwo.clear();
		}
		System.out.println("Player 2 cards'");
		playerTwo.add(Deck.remove(Deck.size()-1));
		playerTwo.add(Deck.remove(Deck.size()-1));
		System.out.println(playerTwo.toString());
		System.out.println();
		//System.console().flush();
	}
	
	
	
	
	
	//money to bid for each players
	private class Money{
		
		private int money = 1000;
		static private int gameMoney = 10;
		static private int bidMoney = 0;
		public int bidding = 0;
		
		Money(){
			money = 1000;
		}
		Money(int num){
			money = num;
		}
		public static int getBidMoney() {
			return bidMoney;
		}
		public static void setBidMoney(int num) {
			bidMoney = num;
		}
		public int getMoney() {
			return this.money;
		}
		public static void setGameMoney(int num) {
			gameMoney = num;
		}
		public static int getGameMoney() {
			return gameMoney;
		}
		public void gameMoney() {
			this.money -= gameMoney;
			bidMoney += gameMoney;
		}
		public void setMoney(int num) {
			this.money = num;
		}
		public void minus(int num) {
			this.money -= num;
		}
		public void plus(int num) {
			this.money += num;
		}
		public void bid() {
			Scanner input = new Scanner(System.in);
			
			Money.setBidMoney(Money.getBidMoney()-bidding);
			System.out.println("money: " + this.getMoney());
			System.out.print("How much do you want to bid?: (if you want to continue the game, please match the money the other player bid) ");
			bidding = input.nextInt();
			this.money -= bidding;
			System.out.println("Money: " + this.getMoney());
			Money.setBidMoney(Money.getBidMoney()+bidding);
			
			System.out.println("Total money in the pot: " + Money.getBidMoney());
		}
	}
	
	
	
	
	//ask each user to bid, call, or die
	Money []money = new Money[2];
	
	public static int count = 0;
	public static int moneyOne;
	public static int moneyTwo;
	
	public void call() {
		
		if (count == 0) {
			money[0] = new Money();
			money[1] = new Money();
		}else if(count > 0){
			money[0] = new Money(moneyOne);
			money[1] = new Money(moneyTwo);
		}
		count++;

		Scanner input = new Scanner(System.in);
		int [] choice = new int[3];
		
		for(int i = 0; i < choice.length-1; i++) {
			if (Money.getBidMoney() == 0) {
				money[0].gameMoney();
				money[1].gameMoney();
			}

			System.out.println();
			System.out.println();
			System.out.println("player " + (i+1) + " What do you want to do: (1. call 2. bid 3. die)");
			choice[i] = input.nextInt();
			System.out.println("Total money in the pot: " + Money.getBidMoney());
			
			if(choice[i] == 1) {
				// whichever the player wants to bid, the other player should be able to just call to match the bidding.
				if (money[0].bidding != 0) {
					System.out.println();
					System.out.println("following the player's bid: ");
					money[i].bid();
					do {
						if (money[0].bidding < money[1].bidding) {
							money[0].plus(money[0].bidding);
							money[0].bid();	
						}else if (money[0].bidding > money[1].bidding){
							money[1].plus(money[1].bidding);
							money[1].bid();
						}
					}while(money[0].bidding != money[1].bidding);
					System.out.println();
				}
			}else if(choice[i] == 2) {
				//if other player's bidding is higher, then you should be able to follow or bid higher	
				System.out.println();
				System.out.println("player " + (i+1));
				money[i].bid();
				//System.out.println("player 2");
				//money[1].bid();
				if ((money[1] != null) && (money[1].bidding > money[0].bidding)) {
					do {
						if (money[0].bidding < money[1].bidding) {
							System.out.println();
							System.out.println("Player 1");
							money[0].setMoney(money[0].getMoney()+money[0].bidding);
							//Money.setBidMoney(Money.getBidMoney()-money[0].bidding);
							money[0].bid();
							System.out.println();
						} 
						if (money[1].bidding < money[0].bidding) {
							System.out.println();
							System.out.println("Player 2");
							money[1].setMoney(money[1].getMoney()+money[1].bidding);
							//Money.setBidMoney(Money.getBidMoney()-money[1].bidding);
							money[1].bid();
							System.out.println();
						}
					}while(money[0].bidding!=money[1].bidding);
					System.out.println(Money.getBidMoney());
				}					
			}else if(choice[i] == 3) {
				if(i == 1) {
					money[0].plus(Money.getBidMoney());
					Money.setBidMoney(0);
				}else if(i == 0) {
					money[1].plus(Money.getBidMoney());
					Money.setBidMoney(0);
				System.out.println(money[0].getMoney());
				System.out.println(money[1].getMoney());
				System.out.print(Money.getBidMoney());
				}
			}
		}
		moneyOne = money[0].getMoney();
		moneyTwo = money[1].getMoney();
	}
	
	
	
	
	

	//first - find a matching number from the first card 
	//second - find a matching number from the second card 
	
	//since I am just grouping all in one ArrayList. check the error of not picking with the player's cards. For example, it might just give you a straight with the table cards
	
	//third - if both cards on hand have a match AND one has two matching cards AND other has a single matching card, then assign F.H.
	//fourth - if one on hand matches to three cards, declare Four of A Kind.
	
	//fifth - if matching doesn't exist, convert the string into number 
	
	//Sort the ArrayList and pick any one of cards and if the next index array value is bigger by 1
	//and if the picked card is at the end index of the array then start from the first and find if it's 1 bigger
	//if all the consecutive elements are same suite declare straight Flush.
	//seventh check if the suites are from where the picked one getting compared with the next index array
	//eighth again make a new array to squeeze all the elements of two cards and the cards on the table
	//and pick one of any card and look for a matching suite And declare a minimum value to get rid of it except 1='A'
	//NOTES - use a split method to get the "-" out
	
	//calculate the upper hand by the rank of the cards combination 
	
	LinkedList <Integer>pairsOne = new LinkedList<>();
	LinkedList <Integer>pairsTwo = new LinkedList<>();
	
	LinkedList <Integer>straightOne = new LinkedList<>();
	LinkedList <Integer>straightTwo = new LinkedList<>();
	
	LinkedList <Integer>sortedNumberOne = new LinkedList<>();
	LinkedList <Integer>sortedNumberTwo = new LinkedList<>();
	
	LinkedList<Card> combinedOne = new LinkedList<>();
	LinkedList<Card> combinedTwo = new LinkedList<>();
	
	public void open() {
		
		if(!pairsOne.isEmpty()) {
			pairsOne.clear();
		}  
		if(!pairsTwo.isEmpty()) {
			pairsTwo.clear();
		}
		
		System.out.println("player 1 cards");
		sorting();
		System.out.println("Player 2 cards");
		sortingTwo();
		
		System.out.println();
		System.out.println();

		int count = 0;
		
		//for pairs
		for (int i = 0; i < sortedNumberOne.size(); i++) {
			for (int j = i+1; j <sortedNumberOne.size(); j++) {
				if(sortedNumberOne.get(i) == (sortedNumberOne.get(j))) {
					pairsOne.add(sortedNumberOne.get(j));
					count++;
					if(pairsOne != null && (count > 0)) {
						pairsOne.add(sortedNumberOne.get(i));
					}
				}
			}
			count = 0;
		}
		
		for (int i = 0; i < sortedNumberTwo.size(); i++) {
			for (int j = i+1; j <sortedNumberTwo.size(); j++) {
				if(sortedNumberTwo.get(i) == sortedNumberTwo.get(j)) {
					pairsTwo.add(sortedNumberTwo.get(j));
					count++;
					if(pairsTwo != null) {
						pairsTwo.add(sortedNumberTwo.get(i));
					}
				}
			}
			count = 0;
		}
		
		
		if (pairsOne.size() > pairsTwo.size() || (pairsOne != null && pairsTwo == null) ) {
			System.out.println("Player one won");
			System.out.println();
			money[0].setMoney(money[0].getMoney() + Money.bidMoney);
			System.out.println("Player 1 Money: " + money[0].getMoney());
			System.out.println("Player 2 Money: " + money[1].getMoney());
		}else if(pairsOne.size() < pairsTwo.size() || (pairsTwo != null && pairsOne == null)) {
			System.out.println("Player Two won");
			System.out.println();
			money[1].setMoney(money[1].getMoney() + Money.bidMoney);
			System.out.println("Player 1 Money: " + money[0].getMoney());
			System.out.println("Player 2 Money: " + money[1].getMoney());
		}else if(pairsOne.size() == pairsTwo.size() && (!pairsOne.isEmpty() && !pairsTwo.isEmpty())) {
			if(pairsOne.get(0) < pairsTwo.get(0)) {
				System.out.println("Player Two won");
				System.out.println();
				money[1].setMoney(money[1].getMoney() + Money.bidMoney);
				System.out.println("Player 1 Money: " + money[0].getMoney());
				System.out.println("Player 2 Money: " + money[1].getMoney());
			}else {
				System.out.println("Player one won");
				System.out.println();
				money[0].setMoney(money[0].getMoney() + Money.bidMoney);
				System.out.println("Player 1 Money: " + money[0].getMoney());
				System.out.println("Player 2 Money: " + money[1].getMoney());
			}
		}else if((pairsOne == null && pairsTwo == null)){
			if(sortedNumberOne.getLast() > sortedNumberTwo.getLast()) {
				System.out.println("Player one won");
				System.out.println();
				money[0].setMoney(money[0].getMoney() + Money.bidMoney);
				System.out.println("Player 1 Money: " + money[0].getMoney());
				System.out.println("Player 2 Money: " + money[1].getMoney());	
			}else {
				System.out.println("Player Two won");
				System.out.println();
				money[1].setMoney(money[1].getMoney() + Money.bidMoney);
				System.out.println("Player 1 Money: " + money[0].getMoney());
				System.out.println("Player 2 Money: " + money[1].getMoney());
			}
		}
		moneyOne = money[0].getMoney();
		moneyTwo = money[1].getMoney();
		
		
		/*
		//for straight
		if(sortedNumberOne.get(0) == 2 && sortedNumberOne.get(-1) == 14) {
			straightOne.add(0);
			straightOne.add(-1);
			for(int i = -1; i < -sortedNumberOne.size(); i--) {
				
				if(Math.abs(sortedNumberOne.get(i)-sortedNumberOne.get(i-1)) == 1) {
					straightOne.add(straightOne.get(i-1));
					
				}else if(straightOne.size() < 5 && (Math.abs(sortedNumberOne.get(i)-sortedNumberOne.get(i-1)) != 1)) {
					straightOne.clear();
					
					for(int j = 0; j < sortedNumberOne.size(); j++) {
						if(Math.abs(sortedNumberOne.get(j)-sortedNumberOne.get(j+1)) == 1) {
							straightOne.add(straightOne.get(i+1));
						}else if(straightOne.size() < 5 && (Math.abs(sortedNumberOne.get(j)-sortedNumberOne.get(j-1)) != 1)) {
							straightOne.clear();
						}
						
					}
				}
			}
			
			if(straightOne.size() >= 5) {
				System.out.println("straight has been found: ");
				System.out.println(straightOne);
			}
		}else {
			for(int i = -1; i < -sortedNumberOne.size(); i--) {
				straightOne.add(straightOne.get(-1));
				if(Math.abs(sortedNumberOne.get(i)-sortedNumberOne.get(i-1)) == 1) {
					straightOne.add(straightOne.get(i-1));
				}else if(straightOne.size() < 5 && (Math.abs(sortedNumberOne.get(i)-sortedNumberOne.get(i-1)) != 1)) {
					straightOne.clear();
					for(int j = 0; j < sortedNumberOne.size(); j++) {
						straightOne.add(straightOne.get(0));
						if(Math.abs(sortedNumberOne.get(j)-sortedNumberOne.get(j+1)) == 1) {
							straightOne.add(straightOne.get(j+1));
						}else if(straightOne.size() < 5 && (Math.abs(sortedNumberOne.get(j)-sortedNumberOne.get(j+1)) != 1)) {
							straightOne.clear();
						}
					}
				}
			}
			if(straightOne.size() >= 5) {
				System.out.println("straight has been found: ");
				System.out.println(straightOne);
			}
		}
		*/
		
		
		
		
		Money.setBidMoney(0);
		System.out.println();
	}
		
	
	
	

	public void sorting() {
		
		if(!sortedNumberOne.isEmpty()) {
			sortedNumberOne.clear();
		}
		if(!combinedOne.isEmpty()) {
			combinedOne.clear();
		}
		combinedOne.addAll(playerOne);
		combinedOne.addAll(table);
		
		int find;
		int minPivot = 0;
		LinkedList <Card> numberDummy = new LinkedList<>();
		if(!numberDummy.isEmpty()) {
			numberDummy.clear();
		}
		numberDummy.addAll(combinedOne);
		for (int i = 0; i < numberDummy.size(); i++) {
				find = Integer.parseInt(numberDummy.get(i).getNumbers());
				sortedNumberOne.add(find);
			}
		
		int minNum;
		int i = 0;

		do {
			minNum = sortedNumberOne.get(i);

			for(int j = i + 1; j < sortedNumberOne.size(); j++) {
				if(minNum > sortedNumberOne.get(j)) {
					minNum = sortedNumberOne.get(j);
					sortedNumberOne.set(sortedNumberOne.lastIndexOf(sortedNumberOne.get(j)), sortedNumberOne.get(i));
					sortedNumberOne.set(i, minNum);
				}
			}
			i++;
		}while(i < 7);
		System.out.println(sortedNumberOne);
	}
	

	
	public void sortingTwo() {
		
		if(!sortedNumberTwo.isEmpty()) {
			sortedNumberTwo.clear();
		}
		if(!combinedTwo.isEmpty()) {
			combinedTwo.clear();
		}
		
		combinedTwo.addAll(playerTwo);
		combinedTwo.addAll(table);
		
		int find;
		int minPivot = 0;
		LinkedList <Card> numberDummy = new LinkedList<>();
		if(!numberDummy.isEmpty()) {
			numberDummy.clear();
		}
		numberDummy.addAll(combinedTwo);
		for (int i = 0; i < numberDummy.size(); i++) {
				find = Integer.parseInt(numberDummy.get(i).getNumbers());
				sortedNumberTwo.add(find);
			}
		
		int minNum;
		int i = 0;

		do {
			minNum = sortedNumberTwo.get(i);

			for(int j = i + 1; j < sortedNumberTwo.size(); j++) {
				if(minNum > sortedNumberTwo.get(j)) {
					minNum = sortedNumberTwo.get(j);
					sortedNumberTwo.set(sortedNumberTwo.lastIndexOf(sortedNumberTwo.get(j)), sortedNumberTwo.get(i));
					sortedNumberTwo.set(i, minNum);
				}
			}
			i++;
		}while(i < 7);
		System.out.println(sortedNumberTwo);
	}
	
	
	
	
	
		
	ArrayList<Card> table = new ArrayList<>();	
	//lays three cards on the table and ask user to bid before putting 4th and 5th card on the table and finally open()
	public void setTable() {
		if(!table.isEmpty()) {
			table.clear();;
		}
		System.out.println("Dealing three cards on the table: ");
		table.add(Deck.remove(Deck.size()-1));
		table.add(Deck.remove(Deck.size()-1));
		table.add(Deck.remove(Deck.size()-1));
		System.out.println();
		System.out.println();
		System.out.println(table.toString());
		System.out.println();
		call();
		table.add(Deck.remove(Deck.size()-1));
		System.out.println();
		System.out.println();
		System.out.println(table.toString());
		System.out.println();
		call();
		table.add(Deck.remove(Deck.size()-1));
		System.out.println();
		System.out.println();
		System.out.println(table.toString());
		System.out.println();
		call();
		open();
		//reset ArrayList to 0
	}	 
	
	
	
	
	
	
	//if user want to quit or run out of money break or return false value to stop the loop
	public void close() {
		
		String choice;
		Scanner input = new Scanner(System.in);
		
		
		
		if (money[0].getMoney() > 0 && money[1].getMoney() > 0) {
			System.out.println("you wanna continue: (y/n)");
			choice = input.nextLine();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			if (choice.charAt(0) == 'n' || choice.charAt(0) == 'N') {
				System.exit(0);
			}
		}else if(money[0].getMoney() <= 0 || money[1].getMoney() <= 0) {
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("PLAYER " + 1 + " has : " + money[0].getMoney());
			System.out.println("PLAYER " + 2 + " has : " + money[1].getMoney());
			if (money[0].getMoney() > money[1].getMoney()) {
				System.out.println();
				System.out.print("Congratulation Player 1!!! you outplayed Player 2");
			}else {
				System.out.println();
				System.out.print("Congratulation Player 2!!! you outplayed Player 1");
			}
			System.exit(0);
		}
	}
	
}
