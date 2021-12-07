public class TestConditional {
    public static void main(String[] args) {
        System.out.println("Testing conditionals: ");

        int age = 15;
        int peopleQuantity = 4;

        if (age >= 18){
            System.out.println("You are over 18");
            System.out.println("Welcome");
        }

        else {

            if (peopleQuantity >= 2) {
                System.out.println("You aren't alone. Welcome!");
            }

            else
                System.out.println("You aren't over 18!");
        }
    }
}
