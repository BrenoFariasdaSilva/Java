public class Account {
    // You can define standard values for each attribute however, by default, the values in any instance are 0.
    // Private Attributes can't be read or modified from anything other than methods in this class.
    // Protected Attributed

    private static int accountsCounter; // Attribute of the class, and not of the instance, due to "Static" word.
    private double balance;
    private int agency;
    private int number;
    Client owner;

    // Constructor:
    public Account (final int agency, final int number) {
        this.setAgency(agency);
        this.setNumber(number);
        Account.accountsCounter++;
        System.out.println("Creating Account...");
        System.out.println("Total of accounts: " + Account.accountsCounter);
    }

    // Getters:


    public static int getAccountsCounter() { return Account.accountsCounter; }

    public double getBalance() { return this.balance; }

    public int getNumber() { return this.number; }

    public int getAgency() { return this.agency; }

    public Client getOwner() { return this.owner; }

    // Setters:
    public void setNumber(final int number) {
        if (number <= 0) {
            System.out.println("The Account Number can't be minor or equal to 0");
            return;
        }
        this.number = number;
    }

    public void setAgency(final int agency) {
        if (agency <= 0) {
            System.out.println("The Agency Number can't be minor or equal to 0");
            return;
        }
        this.agency = agency;
    }

    public void setOwner(final Client owner) { this.owner = owner; }

    //  Operations:
    public void deposit(final double depositValue) {
        if (depositValue > 0) {
            this.balance += depositValue;
        }
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
}