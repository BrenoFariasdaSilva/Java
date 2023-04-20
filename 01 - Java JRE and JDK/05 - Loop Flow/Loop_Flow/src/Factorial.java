import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.print("Insert the value of the factorial to be calculated, or insert -1 to exit ");
        int factorialInput = 0;
        do {
            Scanner userInput = new Scanner(System.in);
            System.out.print("Insert the value of the factorial to be calculated: ");
            factorialInput = userInput.nextInt();

            if (factorialInput < 0) {
                System.exit(0);
            } else if (factorialInput == 0) {
                System.out.println("The result of " + factorialInput + "! is: 1");
            } else {
                int total = 1;
                for (int i = 1; i <= factorialInput; i++) {
                    total *= i;
                }
                System.out.println("The result of " + factorialInput + "! is: " + total);
            }
        } while (factorialInput != -1);
    }
}
