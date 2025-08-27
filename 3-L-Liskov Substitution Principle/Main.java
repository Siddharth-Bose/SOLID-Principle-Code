// LSP Violation
public class Main {
    public static void main(String[] args) {
        BankingClient customer = new BankingClient();

        WithdrawableAccount savings = new SavingsAccount(0.0);
        WithdrawableAccount checking = new CheckingAccount(0.0);
        DepositOnlyAccount ppf = new PPFAccount(0.0);
        customer.addWithdrawableAccount(savings);
        customer.addWithdrawableAccount(checking);
        customer.addNonWithdrawableAccount(ppf);
        customer.processTransaction();
    }
}