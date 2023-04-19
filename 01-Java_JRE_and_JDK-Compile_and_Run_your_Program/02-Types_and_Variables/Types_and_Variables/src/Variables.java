public class Variables {
    public static void main (String[] args) {
        System.out.println("Testing Variables!");

        final int constantVariable = 10; // This a constant value.

        int age;
        // integer variable declaration. int a 32 bits type.
        // If you need a longer one, use long int, which is a 64 bits int type, but you also need to put a "L" at the end
        // Example: long bigNumber = 123456789L;
        // If you need a 16 bits type, use short. Example: short smallValue = 2000;
        // If you need an 8 bits type, use byte. Example: byte byteValue = 127;

        age = 21; // age receives 21.

        System.out.println("Integer variable - My age is: " + age); // The plus symbol means concatenate the variable into the string.

        double salary = 1250.70; //

        // Java accepts to have int value inside double type, although it is not a good practice.
        // Example: double age = 10;

        System.out.printf("Double variable - My Salary %.2f \n\n", salary); // Also works the printf function just like in C language.

        double firstDivision = 3.14 / 2;
        System.out.println("3.14 / 2 in a double variable = " + firstDivision);

        int secondDivision = 5 / 2;
        // In Java, first it sees the denominator of the division.
        // If it is an integer, it will truncate.
        // If it is a double, it will do the real division.

        System.out.println("5 / 2 in a integer variable = " + secondDivision + ". The result is truncated");

        double thirdDivision = 5 / 2;
        System.out.println("5 / 2 in a double variable = " + thirdDivision + ". The result is also truncated");

        double fourthDivision = 5 / 2.0;
        System.out.println("5 / 2.0 in a double variable = " + fourthDivision + ". The result is now a real division");

        double finalDivision = 5.0 / 2;
        System.out.println("5.0 / 2 in a double variable = " + finalDivision + ". The result is now also a real division \n");

        int randomIntValue = 10;
        double randomDoubleValue = randomIntValue; //

        System.out.println("The result of a int value inside an double var is valid: " + randomDoubleValue);
        System.out.println("But the other way around is not true: \"randomIntValue = randomDoubleValue;\" This would never compile!");
    }
}
