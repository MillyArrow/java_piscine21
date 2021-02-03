import java.util.UUID;

public class User {
	private Integer Identifier;
	private String Name;
	private Integer Balance;

	User() {
		Name = "";
		Balance = 0;
	}

	User(Integer identifier, String name, Integer balance) {
		Identifier = UserIdsGenerator.getInstance().generateId();
		Name = name;
		Balance = balance;
		if (Balance < 0) {
			System.err.println("Balance is negative");
			System.exit(-1);
		}
	}

	public Integer getBalance() {
		return Balance;
	}

	public Integer getIdentifier() {
		return Identifier;
	}

	public String getName() {
		return Name;
	}

	public void setBalance(Integer balance) {
		Balance = balance;
	}

	public void setName(String name) {
		Name = name;
	}

	public void print() {
		System.out.println("Identifier: " + Identifier + "\n" +
				"Name: " + Name + " Balance: " + Balance + " ");
	}
}