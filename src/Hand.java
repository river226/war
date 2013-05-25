import java.util.Vector;


public class Hand 
{
	Vector<Card> hand;
	
	//Creates the Hand.
	public Hand()
	{
		
	}
	//Will return the card at index i.
	public Card getCard(int i)
	{
		return hand.get(i);
	}
	//Will return the vector containing the cards
	public Vector<Card> getHand()
	{
		return hand;
	}
	//Will return a list of the names of the cards in the Vector
	public String toString()
	{
		return "";
	}
}
