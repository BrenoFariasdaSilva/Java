public class CreateAccount {
	public static void main(String[] args) {
		Account firstAccount = new Account();
		
		firstAccount.money = 1275.50;
		firstAccount.money += 100;

		Account secondAccount = new Account();
		secondAccount.money = 330.00;

		// firstAccount.money = secondAccount.money = 100;

		System.out.println("The first account has " + firstAccount.money);	
		System.out.println("The second account has " + secondAccount.money);	

		System.out.println("The first account agency " + firstAccount.agency);	
		System.out.println("The first account number " + firstAccount.number);	
		System.out.println("The first account owner " + firstAccount.owner);
		
		if (firstAccount == secondAccount) {
            System.out.println("They are the same account!");
        } else {
            System.out.println("They aren't the same account!");
        }

		System.out.println(firstAccount);
        System.out.println(secondAccount);
	}
}