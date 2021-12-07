public class Account {
    // The value is 0 (null) by default!
    // Can have another values by standard!
    private double balance;
    private int agency;
    private int number;
    private Client owner; // Could do: Client owner = new Client();
    private static int total; // Static == method from the class, not from the instance.

    public Account (int agency, int number) {
        System.out.println("I'm creating a new account!");
        this.setAgency(agency);
        this.setNumber(number);
        Account.total++;
    }

    public Account (int number) {
        this (1, number);
        // This way we avoid code duplicate!
    }

    public boolean deposit (double value) {
        if (value > 0) {
            this.balance += value;
            return true;
        }
        return false;
        // Or just: balance += value;
    }

    public boolean withdraw (double value) {
        if (this.balance >= value) {
            this.balance -= value;
            return true;
        }
        return false;
    }

    public boolean transfer (double value, Account destiny) {
        if (this.balance >= value) {
            this.withdraw(value);
            destiny.deposit(value);
            return true;
        }
        return false;
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
