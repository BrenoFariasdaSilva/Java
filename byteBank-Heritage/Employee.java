// You can't create and instance of and abstract class.
public abstract class Employee {
    protected String name;
    protected String cpf;
    protected double salary;
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getCpf() {
        return this.cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public double getSalary() {
        return this.salary;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method without body. No implementation. Every child needs to have it's own implementation.
    public abstract double getBonus ();
}
