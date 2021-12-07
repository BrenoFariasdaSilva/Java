public class TestGetAndSet {
    public static void main(String[] args) {
        Account account = new Account(1337, 2462);

        account.setNumber(1337);
        System.out.println(account.getNumber());

        Client client = new Client();

        account.setOwner(client);

        account.getOwner().setName("Breno Farias");
        account.getOwner().setJob("Programmer");
        account.getOwner().setCPF("111.111.111-11");

        System.out.println(account.getOwner().getName());
        System.out.println(account.getOwner().getJob());
        System.out.println(account.getOwner().getCPF());

        client.setName("Amanda");
        System.out.println(account.getOwner().getName());
    }
}
