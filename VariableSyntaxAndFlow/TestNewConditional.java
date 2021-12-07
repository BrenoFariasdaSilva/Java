public class TestNewConditional {
    public static void main(String[] args) {
        System.out.println("Testing conditionals: ");

        int age = 19;
        int peopleQuantity = 4;
        boolean paired = peopleQuantity >= 2 ;

        if (age >= 18 && paired){
            System.out.println("Welcome");
        }

        else {
            System.out.println("You aren't welcome!");
        }
    }
}
