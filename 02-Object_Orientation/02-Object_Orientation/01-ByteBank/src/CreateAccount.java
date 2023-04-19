public class CreateAccount {
    public static void main(String[] args) {
        Account firstAccount = new Account(); // firstAccount receives a reference to an Account

        firstAccount.balance = 200;
        System.out.println("firstAccount.balance: " + firstAccount.balance);
        System.out.println("firstAccount.agency: " + firstAccount.agency);
        System.out.println("firstAccount.number: " + firstAccount.number);
        System.out.println("firstAccount.owner: " + firstAccount.owner);

        firstAccount.balance += 100;
        System.out.println(firstAccount.balance);

        Account secondAccount = new Account();

        secondAccount.balance += 100;
        System.out.println(secondAccount.balance);

        System.out.println(secondAccount); // Reference to where the object secondAccount is stored in memory.

        if (firstAccount == secondAccount) {
            System.out.println("firstAccount equals to secondAccount!");
        } else {
            System.out.println("firstAccount different to secondAccount!");
        }

    }
}
