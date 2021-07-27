//Lab 4 - Exercise 3
//Christina Sosa
//Programming Fundamentals, Summer 2021

package lab4Ex3;
import java.util.Random;

public class Card {
	
	private String suit; 
	private String num; 
	
	// Use numbers to represent the suit and the face value and implement a toString method  that returns a String corresponding to the given suit and face value numbers.
	public Card (String suit, String num) {
		this.suit = suit; 
		this.num = num; 
	}
	
	public String getSuit() {
		return suit; 
	}
	
	public void setSuit(String suit) {
		this.suit = suit; 
	}
	
	public String getnum() {
		return num; 
	}
	
	public void setnum(String num) {
		this.num = num; 
	}
	
	public String toString() {
		return num + " of " + suit; 
	}
	
	public static void main(String[] args) {
		//suit and a face value for all cards
		String [] suits = {"Clubs", "Spades", "Hearts", "Diamonds"}; 
		String [] num = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"}; 

		//deal 5 random cards
		Random rand = new Random(); 
		for (int count = 1; count <= 5; count++) {
			Card card = new Card(suits[rand.nextInt(suits.length)], num[rand.nextInt(num.length)]); 
			System.out.println(card); 
		}
	}

}
