package bridgelabz.java.practice;

import java.util.Scanner;

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
		   Suits[] suits = Suits.values();
		    Ranks[] ranks = Ranks.values();
		    
		    String[] suits1 = {"Spades", "Hearts", "Diamonds", "Clubs"};
		    String[] ranks1 = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

		    // Initialize cards
		    for (int i = 0; i < deck.length; i++) {
		      deck[i] = i ;
		    }

		    // Shuffle the cards
		    for (int i = 0; i < deck.length; i++) {
		      int index = (int)(Math.random() * deck.length);
		      int temp = deck[i];
		      deck[i] = deck[index];
		      deck[index] = temp;
		    }

		    // Displaying all the cards
		    for (Suits s : Suits.values()) {
		        for (Ranks r : Ranks.values()) {
		        	DeckOfCards c = new DeckOfCards();
		        	
		        	System.out.println(s + "  " +r);
		        }  
		    }
		    int numberOfPlayers = 0;
		    Scanner scan = new Scanner(System.in);
		    System.out.println("Please Enter the Number of Players:");
		    int nop = scan.nextInt();
		    	
			System.out.println("Person  1" +" :" );
		    	for (int i = 0; i < 9; i++) { //prints the first 9 cards belonging to 1st player
		    
		 
		    	  String suit1 = suits1[deck[i] / 13];
		    	  String rank1 = ranks1[deck[i] % 13];
		    	 
		    	  System.out.println( rank1 + "   " + suit1 );
		    	}
		    	System.out.println("Person  2" +" :" );
		    	for (int i = 9; i < 18; i++) { //prints the second 9 cards belonging to 2nd player
				    
		   		 
			    	  String suit1 = suits1[deck[i] / 13];
			    	  String rank1 = ranks1[deck[i] % 13];
			    	 
			    	  System.out.println( rank1 + "   " + suit1 );
			    	}
		    	System.out.println("Person  3" +" :" );
		    	for (int i = 18; i < 27; i++) { //prints the Third 9 cards belonging to 3rd player
				    
		   		 
			    	  String suit1 = suits1[deck[i] / 13];
			    	  String rank1 = ranks1[deck[i] % 13];
			    	 
			    	  System.out.println( rank1 + "   " + suit1 );
			    	}
		    	System.out.println("Person  4" +" :" );
		    	for (int i = 27; i < 36; i++) { //prints the Fourth 9 cards belonging to 4th player
				    
		   		 
			    	  String suit1 = suits1[deck[i] / 13];
			    	  String rank1 = ranks1[deck[i] % 13];
			    	 
			    	  System.out.println( rank1 + "   " + suit1 );
			    	}
		    }
}

		    
		    

		