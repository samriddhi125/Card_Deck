public class Card{ //encapsulated class
	private String suit;
	private String value;

	public Card(String suit, String value){//constructor
		this.suit = suit;
		this.value = value;
	}

	//Getter and Setter functions for suit and value.
	public String getSuit(){
		return suit;
	}

	public void setSuit(String suit){
		this.suit = suit;
	}

	public String getValue(){
		return value;
	}

	public void setValue(String value){
		this.value = value;
	}

	public String toString(){
		return "\n" + value + " of " +suit ;
	}
}