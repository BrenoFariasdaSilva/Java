public class Client implements Authenticable {
    private Authenticator authenticator;

    public Client () {
        this.authenticator = new Authenticator();
    }

    @Override
    public boolean authenticate(int password) {
        return this.authenticator.authenticate(password);
    }

    @Override
    public void setPassword(int password) {
        this.authenticator.setPassword(password);
    }
}
