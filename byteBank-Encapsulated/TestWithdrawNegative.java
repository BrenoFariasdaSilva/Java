public class TestWithdrawNegative {
    public static void main(String[] args) {
        Account account = new Account(1337, 2462);
    
        account.deposit(100);
        
        if (account.withdraw(200)) {
            System.out.println("Withdraw sucessfully!");
        } else {
            System.out.println("Withdraw unsucessfully!");
        }
        System.out.println(account.getBalance());
    }
}
