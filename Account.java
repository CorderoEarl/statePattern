public class Account {
    private String accountNumber;
    private double balance;
    private AccountState accountState;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountState = new ActiveState(this);
    }

    public void setAccountState(AccountState accountState) {
        this.accountState = accountState;
    }

    public void deposit(double amount) {
        accountState.deposit(amount);
    }

    public void withdraw(double amount) {
        accountState.withdraw(amount);
    }

    public void suspend() {
        accountState.suspend();
    }

    public void activate() {
        accountState.activate();
    }

    public void close() {
        accountState.close();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return "Account number: " + accountNumber + ", Balance: " + balance;
    }
}