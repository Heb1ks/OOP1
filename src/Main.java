public class Main {
    public static void main(String[] args) {

        Account account1 = new Account(12345, 1000.0);
        Account account2 = new Account(67890, 500.0);

        Customer customer1 = new Customer("Alice", "alice@example.com");
        Customer customer2 = new Customer("Bob", "bob@example.com");

        Bank bank = new Bank("Java Bank", "123 Java Street");

        System.out.println(account1);
        System.out.println(account2);

        account1.deposit(200);
        account2.withdraw(50);

        System.out.println("После операций:");
        System.out.println(account1);
        System.out.println(account2);

        System.out.println(customer1);
        System.out.println(customer2);

        System.out.println(bank);
    }
}
