package poker_Game;

import java.util.LinkedList;
import java.util.ArrayList;


public class Player <E>{
	
	private ArrayList<Integer> pairs = new ArrayList<>();
	private ArrayList<Integer> straight = new ArrayList<>(); 
	private ArrayList<Integer> sortedNumber = new ArrayList<>();
	private ArrayList<E> combined = new ArrayList<>();
	
	
	public ArrayList <Integer> getPairs() {
		return pairs;
	}
	public ArrayList <Integer> getStraight() {
		return straight;
	}
	public ArrayList <Integer> getSortedNumber() {
		return sortedNumber;
	}
	public ArrayList <E> getCombined() {
		return combined;
	}
}
