
public class Account {
	private String name; 
	private double money; 
	private int accountNumber; 
	
	public Account() {}
	
	public Account(String name, double money, int accountNumber) {
		this.name = name; 
		this.money = money; 
		this.accountNumber = accountNumber; 
	}
	
	public String getName() {
		return name; 
	}
	
	public double getMoney() {
		return money; 
	}
	
	public int getAccountNumber() {
		return accountNumber; 
	}
}
