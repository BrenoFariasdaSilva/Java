public class SavingsAccount extends Account {

    public SavingsAccount(int agency, int number) {
        super(agency, number);
    }

    @Override
    public boolean deposit(double value) {
        super.balance += value;
        return false;
    }
}
