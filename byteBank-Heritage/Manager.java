public class Manager extends Employee {

    public double getBonus () {
        System.out.println("Manager.getBonus()");
        return super.getSalary();
    }
}
