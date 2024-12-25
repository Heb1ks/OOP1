public class Main {
    public static void main(String[] args) {

        Account account1 = new Account(1, 2930290);
        Account account2 = new Account(404, 228);
        Account account3 = new Account(320, 8023);

        Customer customer1 = new Customer("GLeb", "Gleb@gmail.com");
        Customer customer2 = new Customer("Hleb", "hleb_228@email.ry");
        Customer customer3 = new Customer("Tom", "Tom@gmail.com");

        Bank bank = new Bank("bank qwerty", "ulitsa puskina");

        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);
        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println(customer3);
        System.out.println(bank);

        if (account1.getBalance() > account2.getBalance()) {
            System.out.println("account1 > then account2.");
        }
        else if (account2.getBalance() < account1.getBalance())
        {
            System.out.println("account2 < then account1.");
        }
        else
        {
            System.out.println("account1 = account2.");
        }

    }
}
