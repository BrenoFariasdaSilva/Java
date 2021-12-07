public class TestReferences {
    public static void main(String[] args) {
        Account firstAccount = new Account();

        firstAccount.money = 1275.50;

        System.out.println("Money in the first account is " + firstAccount.money);

        // Reference to firstAccount. Equals to pointer in C: *firstAccount = &secondAccount; 
        Account secondAccount = firstAccount;

        firstAccount.money = 12.50;
        System.out.println("Money in the first account is " + firstAccount.money);

        System.out.println("Money in the second account is " + secondAccount.money);

        secondAccount.money = 420.50;
        System.out.println("Money in the first account is " + firstAccount.money);

        System.out.println("Money in the second account is " + secondAccount.money);

        if (firstAccount == secondAccount) {
            System.out.println("They are the same account!");
        } else {
            System.out.println("They aren't the same account!");
        }

        System.out.println(firstAccount);
        System.out.println(secondAccount);
    }
}
