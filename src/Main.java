public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Bank Qwerty", "Ulitsa Puskina");

        Account account1 = new Account(1, 2930290);
        Account account2 = new Account(404, 228);
        Account account3 = new Account(320, 803);

        Customer customer1 = new Customer(1, "Gleb", "Gleb@gmail.com");
        Customer customer2 = new Customer(2, "Hleb", "hleb_228@email.ry");
        Customer customer3 = new Customer(3, "Tom", "Tom@gmail.com");

        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);
        bank.addCustomer(customer3);

        System.out.println(bank);
        System.out.println("Filtered accounts (balance >= 1000): " + bank.filterAccountsByBalance(1000));
        System.out.println("Sorted accounts by balance: " + bank.sortAccountsByBalance());
        System.out.println("Find account with ID 404: " + bank.findAccountById(404));
    }
}
