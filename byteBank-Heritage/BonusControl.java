public class BonusControl {
    private double sum;

    // Generic reference to Funcionary allows you to use child classes for the same method.
    public void register (Employee funcionary) {
        double bonus = funcionary.getBonus();
        this.sum += bonus;
    }

    public double getSum() { 
        return this.sum; 
    }
}
