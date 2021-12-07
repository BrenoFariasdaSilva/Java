public class InternSystem {
    private int password = 2222;

    public void authenticate (Authenticable authenticableEmployee) {
        boolean validation = authenticableEmployee.authenticate(this.password);
        if (validation) {
            System.out.println("Welcome to the system!");
        } else {
            System.out.println("You aren't allowed to view the system!");
        }
    }
}
