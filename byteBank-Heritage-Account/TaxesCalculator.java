public class TaxesCalculator {
    private double totalTaxes;

    public void register(Taxable taxable) {
        this.totalTaxes += taxable.getTaxValue();
    }

    public double getTotalTaxes() {
        return totalTaxes;
    }
}
