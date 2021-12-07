public class Account {
    // Standard value is 0 (null) by default!
    // Can have another values by standard!
    double money;
    int agency;
    int number;
    String owner;

    void deposit (double value) {
        this.money += value;
        // Or just: money += value;
    }

    public boolean withdraw (double value) {
        if (this.money >= value) {
            this.money -= value;
            return true;
        }
        return false;
    }

    public boolean transfer (double value, Account destiny) {
        if (this.money >= value) {
            this.withdraw(value);
            destiny.deposit(value);
            return true;
        }
        return false;
    }
}
