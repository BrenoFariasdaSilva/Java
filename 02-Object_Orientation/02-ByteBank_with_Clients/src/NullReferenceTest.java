public class NullReferenceTest {
    public static void main(String[] args) {
        Account myAccount = new Account();

        myAccount.owner.name = "Breno";
        // Inside the myAccount, there is no Client associated to the owner attribute.
        // So, we have a null reference pointer.
        // Solutions: myAccount.owner = new Client();
        // Or you could also do inside the Client class the following default value: Client owner = new Client();

        System.out.println(myAccount.owner.name);
    }

}
