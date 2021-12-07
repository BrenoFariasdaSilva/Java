public class TestAccounts {
    public static void main(String[] args) throws InsuficientBalanceException {
        CheckingAccount firstAccount = new CheckingAccount(01, 111);
        firstAccount.deposit(1000.0);

        CheckingAccount newAccount = new CheckingAccount(02, 1337);
        newAccount.deposit(250.0);

        firstAccount.transfer(10.0, newAccount);

        System.out.println("firstAccount: " + firstAccount.getBalance());
        System.out.println("newAccount: " + newAccount.getBalance());
    }
}
