import java.util.Scanner;

public class Report2 {
	static void method01() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter deposit amount for account1:");
		Account1 a1 = new Account1();
		double dep1 = scanner.nextDouble();
		a1.credit(dep1);
		
		System.out.print("Enter deposit amount for account2:");
		Account1 a2 = new Account1();
		double dep2 = scanner.nextDouble();
		a2.credit(dep2);
		
		System.out.println("account1 balance: "+ a1.getBalance());
		System.out.println("account2 balance: "+ a2.getBalance());
		
	}
	
	static void method02() {
		Account1 ac = new Account1("ȫ�浿");
		ac.credit(1000.0);
		ac.print();
		
		ac.addInterest(1.1);
		ac.print();
	}
	
	static void method03() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nEnter first Integer : ");
		int x = scanner.nextInt();
		System.out.print("Enter second Integer : ");
		int y = scanner.nextInt();
		System.out.println("Sum is " + (x+y));
		System.out.println("Product is " + (x*y));
		System.out.println("Difference is " + (x-y));
		System.out.println("Quotient is " + (x/y));
	}
	
	public static void main(String[] args) {
		method01();
		method02();
		method03();
	}
}
