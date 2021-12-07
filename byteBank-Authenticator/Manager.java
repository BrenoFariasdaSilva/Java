public class Manager extends Employee implements Authenticable{
    private Authenticator authenticator;

    public Manager() {
        this.authenticator = new Authenticator();
    }

    public double getBonus () {
        System.out.print("Manager.getBonus(): ");
        return super.getSalary();
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
