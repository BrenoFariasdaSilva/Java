public class TestMethods {
    public static void main(String[] args) {
        Account firstAccount = new Account();
		
		firstAccount.money = 1275.50;
        System.out.println(firstAccount.money);
        firstAccount.deposit(100);
        System.out.println(firstAccount.money);

        if (firstAccount.withdraw(375.50)) {
            System.out.println("Withdraw with sucess!");
        } else {
            System.out.println("The withdraw failed!");
        }

        Account secondAccount = new Account();
		secondAccount.money = 300.00;

        if (firstAccount.transfer(100, secondAccount)) {
            System.out.println("Transfer with sucess!");
            System.out.println(firstAccount.money);
            System.out.println(secondAccount.money);
        } else {
            System.out.println("Not enough money!");
        }

        firstAccount.owner = "Breno Farias";
    }
}
