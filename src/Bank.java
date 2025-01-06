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
    public String toString() {
        return "Bank: " + name + ", Address: " + address;
    }
}