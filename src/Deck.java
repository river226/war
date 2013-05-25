import java.util.Collections;
import java.util.Stack;


public class Deck 
{
	//Stores the cards
	Stack<Card> deck;
	//Stores the current number of cards in the deck.
	int size;
	//Sets the max size of the deck. If the size limit is set to -1, there is no limit. 
	int maxsize;
	
	
	//CONSTRUCTORS
	//Creates an empty deck with no size limit and no cards.
	public Deck()
	{
		size = 0;
		maxsize = -1;
	}
	public Deck(int maxsize)
	{
		size = 0;
		this.maxsize = maxsize;
	}
	public Deck(String type)
	{
		//Generate a traditional card deck.
		if(type == "traditional")
		{
			maxsize = 52;
			for(int i = 0; i<4; i++)
			{
				for(int j = 1; j<14; j++)
					addCard(new TraditionalCard(i,j));
			}
			
		}
		//Generate a traditional card deck with two joker cards.
		else if (type == "traditionaljoker")
		{
			maxsize = 54;
			for(int i = 0; i<4; i++)
			{
				for(int j = 1; j<14; j++)
					addCard(new TraditionalCard(i,j));
			}
			addCard(new TraditionalCard(0,14));
			addCard(new TraditionalCard(1,14));
			
		}
	}
	
	
	//MUTATORS AND ACCESSORS
	public void setMaxSize(int s)
	{
		maxsize = s;
	}
	public int getMaxSize()
	{
		return maxsize;
	}
	public int getSize()
	{
		return size;
	}
	public boolean isEmpty()
	{
		return size==0;
	}
	//OTHER
	//Draws the card from the top of the deck.
	public Card draw()
	{
		if(size > 0)
		{
			size--;
			return deck.pop();
		}
		else return new Card(); // REPLACE LATER WITH EXCEPTION
		
	}
	//Shuffles the deck.
	public void shuffle()
	{
		Collections.shuffle(deck);
	}
	//Adds a card to the top of the deck.
	public void addCard(Card c)
	{
		if(size<maxsize || maxsize == -1)
		{
			deck.push(c);
			size++;
		}
		else;
			//Will throw a full deck exception. Shouldn't really ever happen unless cards are spawned outside of the deck. 
	}
	//Will print out all of the cards in the deck, in order, and then return them to the deck. 
	public String toString()
	{
		return "";
	}
}
