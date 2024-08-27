package two;

public class SavingAccount extends BaseAccount {
	private Card card;
	private Employee em;
	private double balance;
	
	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public SavingAccount(Employee em) {
		DebitCard d = new DebitCard("xxx-xxx-5555");
		this.card = d;
		this.em = em;
		em.setSa(this);
	}

	public boolean withdraw(double amount) {
		this.balance -= amount;
		return false;
	}

	public boolean deposit(double amount) {
		this.balance += amount;
		return false;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public class DebitCard extends Card{
		private String sa;

		public DebitCard(String id) {
			super(id);
		}
		public boolean withdraw(double amount) {
			return SavingAccount.this.withdraw(amount);
		}
	
		public String type() {
			return "visa";
		}
	
		public double discount() {
			return 2.5;
		}
		
	}

}
