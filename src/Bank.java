import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private String address;
    private List<Account> accounts;
    private List<Customer> customers;

    public Bank(String name, String address) {
        this.name = name;
        this.address = address;
        this.accounts = new ArrayList<>();
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public List<Account> filterAccountsByBalance(double threshold) {
        return accounts.stream().filter(a -> a.getBalance() >= threshold).toList();
    }

    public Account findAccountById(int id) {
        return accounts.stream().filter(a -> a.getId() == id).findFirst().orElse(null);
    }

    public List<Account> sortAccountsByBalance() {
        return accounts.stream().sorted((a1, a2) -> Double.compare(a1.getBalance(), a2.getBalance())).toList();
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (accounts != null ? accounts.hashCode() : 0);
        result = 31 * result + (customers != null ? customers.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Bank other = (Bank) obj;
        if (name == null) {
            if (other.name != null) return false;
        } else if (!name.equals(other.name)) return false;
        if (address == null) {
            if (other.address != null) return false;
        } else if (!address.equals(other.address)) return false;
        if (accounts == null) {
            if (other.accounts != null) return false;
        } else if (!accounts.equals(other.accounts)) return false;
        if (customers == null) {
            if (other.customers != null) return false;
        } else if (!customers.equals(other.customers)) return false;
        return true;
    }

    @Override
    public String toString() {
        return "Bank: " + name + ", Address: " + address;
    }
}
