public class TestWithdraw {
    public static void main(String[] args) {
        Account account = new CheckingAccount(111, 1337);

        account.deposit(1000);
        try {
            account.withdraw(1200);
        } catch (InsuficientBalanceException exception) {
            System.out.println("Exception: " + exception.getMessage());
        }

        System.out.println(account.getBalance());
    }
}
