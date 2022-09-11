package Exercise_4.question_2;

public class Account {
	private String id;
	private String name;
	private int balance;

	public Account(String id, String name, int balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void credit(int amount) {
		System.out.println(amount);
	}

	public void debit(int amount) {
		System.out.println(amount);
	}

	public void tranferTo(Account account, int amount) {
		System.out.println(account);
		System.out.println(amount);
	}
}
