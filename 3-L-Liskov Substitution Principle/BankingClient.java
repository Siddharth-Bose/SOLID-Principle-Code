import java.util.ArrayList;
import java.util.List;
// Violation
// public class BankingClient {
//     List<Account> accounts = new ArrayList<>();

//     public void addAccount(Account a) {
//         accounts.add(a);
//     }

//     public void processTransaction() {
//         for (Account acc : accounts) {
//             try {
//                 acc.deposit(1000.0);
//                 acc.withdraw(500.0);
//             } catch (UnsupportedOperationException e) {
//                 System.out.println(e.getMessage());
//             }
//         }
//     }
// }

public class BankingClient {
    List<WithdrawableAccount> wAccounts = new ArrayList<>();
    List<DepositOnlyAccount> nWAccounts = new ArrayList<>();

    public void addWithdrawableAccount(WithdrawableAccount a) {
        wAccounts.add(a);
    }

    public void addNonWithdrawableAccount(DepositOnlyAccount a) {
        nWAccounts.add(a);
    }

    public void processTransaction() {
        for (WithdrawableAccount acc : wAccounts) {
            acc.deposit(1000.0);
            acc.withdraw(500.0);
        }
        for (DepositOnlyAccount acc : nWAccounts) {
            acc.deposit(1000.0);
        }
    }
}