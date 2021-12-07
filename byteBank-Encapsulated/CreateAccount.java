public class CreateAccount {
	public static void main(String[] args) {
		Account firstAccount = new Account(1337, 2462);
		
		firstAccount.deposit(1275.50);
		firstAccount.deposit(100);

		Account secondAccount = new Account(420, 7331);
		secondAccount.deposit(330.00);

		// firstAccount.balance = secondAccount.balance = 100;

		System.out.println("The first account has " + firstAccount.getBalance());	
		System.out.println("The second account has " + secondAccount.getBalance());	

		System.out.println("The first account agency " + firstAccount.getAgency());	
		System.out.println("The first account number " + firstAccount.getNumber());	
		System.out.println("The first account owner " + firstAccount.getOwner());
		
		if (firstAccount == secondAccount) {
            System.out.println("They are the same account!");
        } else {
            System.out.println("They aren't the same account!");
        }

		System.out.println(firstAccount);
        System.out.println(secondAccount);
	}
}