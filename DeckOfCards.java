package bridgelabz.java.practice;

import bridgelabz.java.practice.DeckOfCards.Ranks;
import bridgelabz.java.practice.DeckOfCards.Suits;

public class DeckOfCards {
	public enum Suits {
	    SPADES, 
	    HEARTS, 
	    DIAMONDS,
	    CLUBS;  
	}
	 enum Ranks {
		Ace,
		One,
		Two,
		Three,
		Four,
		Five,
		Six,
		Seven,
		Eight,
		Nine,
		Ten,
		Jack,
		Queen,
		King;
	}
	
	
		  public static void main(String[] args) {
		    int[] deck = new int[52];
		    
		    //String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
		    //String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

		    // Initialize cards
		    for (int i = 0; i < deck.length; i++) {
		      deck[i] = i;
		    }

		    // Shuffle the cards
		    for (int i = 0; i < deck.length; i++) {
		      int index = (int)(Math.random() * deck.length);
		      int temp = deck[i];
		      deck[i] = deck[index];
		      deck[index] = temp;
		    }

		    // Display the all the cards
		    for (Suits s : Suits.values()) {
		        for (Ranks r : Ranks.values()) {
		        	DeckOfCards c = new DeckOfCards();
		        	
		        	System.out.println(s + "  " +r);
		        }  
		    }
		    }
		  }

		