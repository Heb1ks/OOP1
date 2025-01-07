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
    public int hashCode() {
        int result = super.hashCode();
        long temp = Double.doubleToLongBits(balance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!super.equals(obj)) return false;
        if (getClass() != obj.getClass()) return false;
        Account other = (Account) obj;
        return Double.compare(other.balance, balance) == 0;
    }

    @Override
    public String toString() {
        return super.toString() + ", Balance: " + balance;
    }
}