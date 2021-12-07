public class TestSystem {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setPassword(2222);

        Administrator admin = new Administrator();
        admin.setPassword(3333);

        Client client = new Client();
        client.setPassword(2222);

        InternSystem system = new InternSystem();
        system.authenticate(manager);
        system.authenticate(admin);
        system.authenticate(client);
    }
}