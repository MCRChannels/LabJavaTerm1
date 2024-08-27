package two;

abstract public class Card  implements Withdrawable  {
	private String id;
	public Card(String id) {
		this.id = id;
	}
	public abstract String type();
	
	public abstract double discount();
}
