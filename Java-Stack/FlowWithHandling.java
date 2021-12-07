public class FlowWithHandling {
    public static void main(String[] args) {
        System.out.println("Main Start");
        try {
            firstMethod();
            // Exception example is more generic. Avoid multiple exceptions name inside catch
        } catch (Exception example) {
            String message = example.getMessage();
            System.out.println("Exception: " + message);    
            example.printStackTrace();        
        }
        System.out.println("Main End");
    }

    private static void firstMethod() throws MyException {
        System.out.println("First Method Start");
        secondMethod();
        System.out.println("First Method End");
    }

    private static void secondMethod() throws MyException {
        System.out.println("Second Method Start");
        throw new MyException("Exception detected.");
        // ArithmeticException exception = new ArithmeticException("Didnt worked out.");
        // throw exception;
        // Or? throw new ArithmeticException("Didnt work out.");
        // After using throw exception, any code that follows won't be executed.
        // You can only throw exceptions, not just any reference!
        // System.out.println("Second Method End");
    }
}