
public class Account1 {
	private String name;
	private double balance;
	
	public Account1() {
		
	}
	public Account1(String n) {
		name = n;
		balance = 0.0;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}
	
	public void credit(double b) {
		balance = b;
	}
	public void print() {
		System.out.println("������ :"+name);
		System.out.println("�ܾ� :" +balance);
	}
	
	public void addInterest(double interestRates) {
		balance = balance * interestRates;
	}
	

}
