public class TestReferences {
    public static void main(String[] args) {
        Account firstAccount = new Account(1337, 2462);

        firstAccount.deposit(1275.5);

        System.out.println("balance in the first account is " + firstAccount.getBalance());

        // Reference to firstAccount. Equals to pointer in C: *firstAccount = &secondAccount; 
        Account secondAccount = firstAccount;

        firstAccount.deposit(12.50);
        System.out.println("balance in the first account is " + firstAccount.getBalance());

        System.out.println("balance in the second account is " + secondAccount.getBalance());

        secondAccount.deposit(420.5);
        System.out.println("balance in the first account is " + firstAccount.getBalance());

        System.out.println("balance in the second account is " + secondAccount.getBalance());

        if (firstAccount == secondAccount) {
            System.out.println("They are the same account!");
        } else {
            System.out.println("They aren't the same account!");
        }

        System.out.println(firstAccount);
        System.out.println(secondAccount);
    }
}
