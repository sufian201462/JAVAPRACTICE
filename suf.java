
class BankAccount {
	String accountHolder;
	double balance;

	BankAccount(String accountHolder, double balance) {
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	public void deposit(double amount) {

		if (amount < 0) {
			System.out.println("Lnvalid deposit amount");
		} else {
			balance += amount;
			System.out.println("Account holder: " + accountHolder);
			System.out.println("Deposited amount: " + amount);
			System.out.println("New balance: " + balance);
		}
	}

	public void withdraw(double amount) {
		if (amount > balance || amount < 0) {
			System.out.println("Invalid withdrawal amount or insufficient funds");
		} else {
			balance -= amount;
			System.out.println("Account Holder: " + accountHolder);
			System.out.println("Withdrawn amount: " + amount);
			System.out.println("new banalce: " + balance);
		}
	}

	public void chekBalance() {
		System.out.println("Account holder name: " + balance);
		System.out.println("Current balance: " + balance);
	}
}

public class suf {
	public static void main(String[] args) {
		
        BankAccount a1 = new BankAccount("sufian",1000);
        BankAccount a2 = new BankAccount("Bob",500);

        a1.deposit(200);
        a1.withdraw(-100);

		a2.withdraw(100);
		a2.withdraw(500);
	}
}