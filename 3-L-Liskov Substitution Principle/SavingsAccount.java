public class SavingsAccount implements WithdrawableAccount {
    Double balance;

    SavingsAccount(Double balance) {
        this.balance = balance;
    }

    public void deposit(Double amount) {
        balance += amount;
        System.out.println("Added " + amount + " to your Savings Account");
        System.out.println("New Balance:  " + balance);
    }

    public void withdraw(Double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            System.out.println("Withdrew " + amount + " From your Savings Account.");
        }
    }
}
