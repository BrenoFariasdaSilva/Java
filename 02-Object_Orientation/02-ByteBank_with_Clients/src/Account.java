public class Account {
    // You can define standard values for each attribute however, by default, the values in any instance are 0.
    // Private Attributes can't be read or modified from anything other than methods in this class.
    // Protected Attributed
    private double balance;
    int agency = 42;
    int number;
    Client owner;

    public void deposit(final double depositValue) {
        this.balance += depositValue;
    }

    public boolean withdraw(final double withdrawValue) {
        if (this.balance >= withdrawValue) {
            this.balance -= withdrawValue;
            return true;
        }
        return false;
    }

    public boolean transfer(final double value, Account destiny) {
        if (this.withdraw(value)) {
            destiny.deposit(value);
            return true;
        }
        return false;
    }

    public double getBalance() { return this.balance; }
}