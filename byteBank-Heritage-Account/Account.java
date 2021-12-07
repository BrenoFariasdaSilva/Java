public abstract class Account {
    // The value is 0 (null) by default!
    // Can have another values by standard!
    protected double balance;
    private int agency;
    private int number;
    private Client owner; // Could do: Client owner = new Client();
    private static int total; // Static == method from the class, not from the instance.

    public Account (int agency, int number) {
        this.setAgency(agency);
        this.setNumber(number);
        Account.total++;
    }

    public Account (int number) {
        this (1, number);
        // This way we avoid code duplicate!
    }

    public abstract boolean deposit (double value);

    public void withdraw (double value) throws InsuficientBalanceException{

        if (this.balance < value) {
            throw new InsuficientBalanceException("Balance: " + this.balance + ", Withdraw value: " + value);
        }
        this.balance -= value;
    }

    public void transfer (double value, Account destiny) throws InsuficientBalanceException {
        this.withdraw(value);
        destiny.deposit(value);
    }

    public double getBalance () {
        return (this.balance);
    }

    public int getNumber () {
        return (this.number);
    }

    public void setNumber (int number) {
        if (number >= 0) {
            this.number = number;
        }
    }

    public int getAgency () {
        return (this.agency);
    }

    public void setAgency (int agency) {
        if (agency >= 0) {
            this.agency = agency;
        }
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    public Client getOwner() {
        return (this.owner);
    }

    // Static == method from the class, not from the instance.
    public static int getTotal () {
        return Account.total;
    }
}
