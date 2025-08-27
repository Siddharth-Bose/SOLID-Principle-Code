public class PPFAccount implements DepositOnlyAccount {
    Double balance;

    PPFAccount(Double balance) {
        this.balance = balance;
    }

    public void deposit(Double amount) {
        balance += amount;
        System.out.println("Added " + amount + " to your PPF Account");
        System.out.println("New Balance:  " + balance);
    }

}
