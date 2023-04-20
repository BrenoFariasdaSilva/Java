public class VariablesScope {
    public static void main(String[] args) {
        System.out.println("Testing Conditions!");

        int age = 12;
        int peopleQuantity = 2;

        // boolean type accepts true, false or an expression.
        boolean escorted = (peopleQuantity >= 2);
        // Any declared variable doesn't have any default value.
        // boolean testDefaultValue;
        // System.out.println(testDefaultValue);
        // The previous two lines would give this error: Variable 'testDefaultValue' might not have been initialized

        // OR is done with ||
        // AND is done with &&
        // Equals to is done with ==
        if (age >= 18 || escorted) {
            System.out.println("You are over 18 years old. \nWelcome!");
        } else {
            System.out.println("You are not over 18 years old!");
        }
    }
}
