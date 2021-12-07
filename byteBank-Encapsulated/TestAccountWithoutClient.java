public class TestAccountWithoutClient {
    public static void main(String[] args) {
        Account brenoAccount = new Account(1337, 2462);
        System.out.println(brenoAccount.getBalance());

        // Pointer to null.
        System.out.println(brenoAccount.getOwner());

        Client client = new Client();
        brenoAccount.setOwner(client);
        System.out.println(brenoAccount.getOwner());

        brenoAccount.getOwner().setName("Breno Farias");

        // No Client associated.
        System.out.println(brenoAccount.getOwner().getName()); 
    }
}
