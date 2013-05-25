
/* 
 * Extends the Card class, this class is meant for cards of the traditional card deck that contains four suits(Hearts, Spades, Diamonds and Clubs) and 13 
 * 
 */


public class TraditionalCard extends Card 
{
	//Stores the Suit of the card. 
	public enum Suit{
		HEARTS, SPADES, DIAMONDS, CLUBS}
	Suit suit;
	//This is the value of the card. Ace = 1, Jack = 11, Queen = 12, King =13, Joker = 14;
	int value;
	
	
	//CONSTRUCTORS
	//Default Constructor just creates an Ace of Hearts.
	public TraditionalCard()
	{
		suit = Suit.HEARTS;
		value = 1;
		//Sets the name parameter for the superclass
		name = valueToString() + " of " + getSuit();
	}
	//Creates a card with the suit and value specified. Will return a crap card if bad input is given. 
	public TraditionalCard(int s, int v)
	{
		//Checks that the value that is sent is valid, otherwise sets the value to -1.
		if(v > 0 && v <15)
			value = v;
		else 
			value = -1;
		
		//Checks that the suit that is sent is valid, otherwise sets the value to "Invalid Suit".
		switch(s)
		{
		case 0:
			suit = Suit.HEARTS;
			break;
		case 1:
			suit = Suit.SPADES;
			break;
		case 2:
			suit = Suit.DIAMONDS;
			break;
		default:
			suit = Suit.CLUBS;
		}
		
		//Sets the name parameter for the superclass
		if(value != 14)
			name = valueToString() + " of " + getSuit();
		else name = valueToString();
	}
	
	
	//ACCESSORS
	//Returns the value of the card
	public int getValue()
	{
		return value;
	}
	public String getValueString()
	{
		return valueToString();
	}
	//Returns the suit of the card as a string.
	public String getSuit()
	{
		switch(suit)
		{
		case HEARTS:
			return "hearts";
		case SPADES:
			return "spades";
		case DIAMONDS:
			return "diamonds";
		default:
			return "clubs";
		}
	}
	
	//OTHER METHODS
	//Takes the value of the card, and turns it into the named value, Ace, Jack, Queen, King or Joker.
	public String valueToString()
	{
		return valueToString(value);
	}
	//Takes the value of the card, and turns it into the named value, Ace, Jack, Queen, King or Joker.
	//I'm honestly not sure how useful this will be, but it can't hurt.
	public static String valueToString(int v)
	{
		switch(v)
		{
			case 1:
				return "Ace";
			case 2-10:
				return Integer.toString(v);
			case 11:
				return "Jack";
			case 12:
				return "Queen";
			case 13:
				return "King";
			case 14:
				return "Joker";
			default:
				return "Invalid Card";
		}
	}

}
