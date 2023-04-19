public class ReferenceTest {
    public static void main(String[] args) {
        Account firstAccount = new Account(); // firstAccount receives a reference to an Account.
        // It's like a pointer to an object Account.

        firstAccount.balance = 300;

        Account secondAccount = firstAccount; // Second pointer to the object account.
        secondAccount.balance += 100;

        System.out.println("firstAccount.balance: " + firstAccount.balance);
        System.out.println("secondAccount.balance: " + secondAccount.balance);

        if (firstAccount == secondAccount) {
            System.out.println("firstAccount equals to secondAccount!");
            System.out.println("Accounts reference: " + firstAccount + " and " + secondAccount);
        } else {
            System.out.println("firstAccount different to secondAccount!");
        }
    }
}
