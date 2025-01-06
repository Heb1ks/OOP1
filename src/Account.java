public class Account extends AbstractEntity {
    private double balance;

    public Account(int id, double balance) {
        super(id);
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return super.toString() + ", Balance: " + balance;
    }
}
