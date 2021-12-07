public class TestTaxables {
    public static void main(String[] args) {
        CheckingAccount checkAccount = new CheckingAccount (111, 1337);

        checkAccount.deposit(100);

        TaxesCalculator taxesAmount = new TaxesCalculator();
        LifeInsurance lifeInsurance = new LifeInsurance();
        taxesAmount.register(checkAccount);
        taxesAmount.register(lifeInsurance);

        System.out.println(taxesAmount.getTotalTaxes());
    }
}