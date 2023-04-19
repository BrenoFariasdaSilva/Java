public class BankTest {
    public static void main(String[] args) {
        Client brenoClient = new Client();
        brenoClient.name = "Breno Farias";
        brenoClient.cpf = "111.111.111-11";
        brenoClient.job = "Programmer";

        Account brenoAccount = new Account();
        brenoAccount.deposit(100);

        // Associate the breno Client with the breno Account
        brenoAccount.owner = brenoClient;
        System.out.println("brenoAccount.owner.name: " + brenoAccount.owner.name);

        if (brenoAccount.owner == brenoClient) {
            System.out.println("brenoAccount.owner.name: " + brenoAccount.owner + " == brenoClient: " + brenoClient);
        }
    }
}
