public class TestAccountWithCheckException {
     public static void main(String[] args) {
         Account account = new Account();
         try {
             account.deposit();
         } catch (MyException exception) {
            System.out.println("Handiling...");
         }
     }
}
