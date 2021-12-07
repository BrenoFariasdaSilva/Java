public class Flow {

    public static void main(String[] args) {
        System.out.println("Main Start");
        try {
            firstMethod();
        } catch(ArithmeticException | NullPointerException example) {
            String message = example.getMessage();
            System.out.println("Exception: " + message);    
            example.printStackTrace();        
        }
        System.out.println("Main End");
    }

    private static void firstMethod() {
        System.out.println("First Method Start");
        secondMethod();
        System.out.println("First Method End");
    }

    private static void secondMethod() {
        System.out.println("Second Method Start");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            int a = i / 0;
            // Account newAccount = null;
            // newAccount.deposit();
        }
        System.out.println("Second Method End");
    }
}