public class ActiveState implements AccountState {
    private Account account;

    public ActiveState(Account account) {
        this.account = account;
    }

    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        System.out.println("Deposited " + amount);
    }

    public void withdraw(double amount) {
        account.setBalance(account.getBalance() - amount);
        System.out.println("Withdraw " + amount);  
    }

    public void suspend() {
        account.setAccountState(new SuspendedState(account));
        System.out.println("Account is suspended!");
    }

    public void activate() {
        System.out.println("Account is already activated!");
    }

    public void close() {
        account.setAccountState(new ClosedState(account));
        System.out.println("Account is closed!");
    }
}