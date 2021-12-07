public class CheckingAccount extends Account implements Taxable {
    
    public CheckingAccount(int agency, int number) {
        super(agency, number);
    }

    @Override
    public void withdraw(double value) throws InsuficientBalanceException {
        super.withdraw(value + 0.20);
    }

    @Override
    public boolean deposit(double value) {
        super.balance += value;
        return false;
    }

    public double getTaxValue() {
        return super.balance * 0.01;
    }
}
