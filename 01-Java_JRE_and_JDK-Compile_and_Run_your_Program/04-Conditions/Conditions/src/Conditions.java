public class Conditions {
    public static void main(String[] args) {
        System.out.println("Testing Conditions!");

        int age = 12;
        int peopleQuantity = 2;

        // boolean type accepts true, false or an expression.
        boolean escorted = (peopleQuantity >= 2);

//        if (age >= 18) {
//            System.out.println("You are over 18 years old. \nWelcome!");
//        } else {
//            if (peopleQuantity >= 2) {
//                System.out.println("You are a minor, but you are accompanied. \nWelcome!");
//            }
//            else {
//                System.out.println("You are not over 18 years old!");
//            }
//        }

        // OR is done with ||
        // AND is done with &&
        // Equals to is done with ==
        // Different to is done with !=
        if (age >= 18 || escorted) {
            System.out.println("You are over 18 years old. \nWelcome!");
        } else {
            System.out.println("You are not over 18 years old!");
        }
    }
}
