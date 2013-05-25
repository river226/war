package flyingbutt.games.war;
/*
 * A generic card class, more exists to be extended off of then to be actually used. Only stores a name. 
 * 
 */


public class Card 
{
	//Stores a name for the card. 
	String name;
	
	//Default Constructor
	public Card()
	{
		name = "";
	}
	//Constructor that takes a name parameter.
	public Card(String s)
	{
		name = s;
	}
	//Returns the name of the card.
	public String getName()
	{
		return name;
	}
	//Essentially the same as above. 
	public String toString()
	{
		return name;
	}
}
