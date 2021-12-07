public class FuncionaryTest {
    private String name;
    private String cpf;
    private double salary;
    private int type = 0; // 0 - Commun funcionary. 1 - Manager. 2 - Director.
    private int password;
    
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

    public int getType() {
        return this.type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public double getBonus () {
        if (this.type == 0) { // Commun funcionary.
            return this.salary * 0.1;
        } else if (this.type == 1) { // Manager.
            return this.salary;
        }
        return this.salary + 1000; // DIrector.
    }

    public boolean autenticate (int password) {
        if (this.password == password) {
            return true;
        }
        return false;
    }
}
