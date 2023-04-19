import java.sql.PseudoColumnUsage;

public class MethodTest {
    public static void main(String[] args) {
        Account sonAccount = new Account();

        sonAccount.balance += 100;
        sonAccount.deposit(100);

        System.out.println("Account balance " + sonAccount.balance);

        boolean withdrawSuccess = sonAccount.withdraw(20);

        System.out.println(withdrawSuccess);
        System.out.println("Account balance " + sonAccount.balance);

        Account fatherAccount = new Account();
        fatherAccount.deposit(1000);

        System.out.println("Before Transfer method: ");
        System.out.println("Son account balance " + sonAccount.balance);
        System.out.println("Father account balance " + fatherAccount.balance);
        if (fatherAccount.transfer(100, sonAccount)) {
            System.out.println("Transference was successful: ");
            System.out.println("Son account balance " + sonAccount.balance);
            System.out.println("Father account balance " + fatherAccount.balance);
        }

        sonAccount.owner = "Breno Farias da Silva";
        System.out.println("Son Account Name: " + sonAccount.owner);
    }
}
