

class BankAccount {
    public String accountHolder;
    double balance;

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Invalid deposit amount"+"\n");
        } 
        else {
            this.balance += amount;
            System.out.println("Account holder: " + accountHolder);
            System.out.println("Deposited amount: " + amount);
            System.out.println("New balance: " + balance +"\n");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance || amount < 0) {
            System.out.println("Invalid withdrawal amount or insufficient funds"+"\n");
        } 
        else {
            balance -= amount;
            System.out.println("Account Holder: " + accountHolder);
            System.out.println("Withdrawn amount: " + amount);
            System.out.println("new banalce: " + balance + "\n");
        }
    }

    public void chekBalance() {
        System.out.println("Account holder name: " + balance);
        System.out.println("Current balance: " + balance + "\n");
    }
}

public class BankDemo {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("sufian", 300.9);
        a1.deposit(500);
        a1.withdraw(100);
        a1.deposit(-200);
        a1.withdraw(50000);
        a1.deposit(300);
        a1.chekBalance();
    }
}
