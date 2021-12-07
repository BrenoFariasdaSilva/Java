public class TestScope {
    public static void main(String[] args) {
        System.out.println("Testing Scope: ");

        int age = 19;
        int peopleQuantity = 4;
        boolean paired = peopleQuantity >= 2 ;

        if (age >= 18 && paired){
            // If paired was not initialized, the condition would carry and error.

            System.out.println("You are welcome!");
        }

        else {
            System.out.println("You aren't welcome!");
        }
    }
}
