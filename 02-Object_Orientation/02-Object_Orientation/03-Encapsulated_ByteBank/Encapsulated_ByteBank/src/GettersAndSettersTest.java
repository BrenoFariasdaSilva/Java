public class GettersAndSettersTest {
    public static void main(String[] args) {
        Account account = new Account(1337, 7331);

        account.setNumber(1337);
        System.out.println("Account Number with getNumber(): " + account.getNumber());

        Client client = new Client();
        client.setName("Breno");

        account.setOwner(client);
        System.out.println(account.getOwner().getName());

        account.getOwner().setJob("Programmer");
        System.out.println(account.getOwner().getJob());

        Account random = new Account(1337, 1337);

        System.out.println(Account.getAccountsCounter());
    }
}
