public class TestBank {
    public static void main(String[] args) {
        Client firstClient = new Client();
		
        firstClient.setName("Breno Farias");
		firstClient.setCPF("111.111.111-11");
        firstClient.setJob("Software Developer");

        Account firstClientAccount = new Account(1337, 2462);
        firstClientAccount.deposit(1500);

        // Associate the client with one account.
        firstClientAccount.setOwner(firstClient);

        System.out.println(firstClientAccount.getOwner().getName());
        System.out.println(firstClientAccount.getOwner());
        System.out.println(firstClient);
    }
}
