public class TestNegativeWithdraw {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(100);
        System.out.println("Try to withdraw 200: " + account.withdraw(200));
        // It didn't work, right? But you could always simply do the following:

        account.balance -= 200;
        // It worked, but if you go to the Account class and change the balance attribute to private, it won't work anymore.
        // Now you need to use the logic of the getters and setters.

        System.out.println(account.getBalance());

    }

}
