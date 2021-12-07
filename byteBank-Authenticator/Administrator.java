public class Administrator extends Employee implements Authenticable {
    private Authenticator authenticator;

    public Administrator() {
        this.authenticator =  new Authenticator();
    }

    @Override
    public double getBonus() {
        return 500;
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