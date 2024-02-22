public class SuspendedState implements AccountState {
    private Account account;

    public SuspendedState(Account account) {
        this.account = account;
    }

    public void deposit(double amount) {
        System.out.println("You cannot deposit to a suspended account!");
    }

    public void withdraw(double amount) {
        System.out.println("You cannot withdraw from a suspended account!");
    }

    public void suspend() {
        System.out.println("Account is suspended!");
    }

    public void activate() {
        account.setAccountState(new ActiveState(account));
        System.out.println("Account is activated!");
    }

    public void close() {
        account.setAccountState(new ClosedState(account));
        System.out.println("Account is closed!");
    }
}

