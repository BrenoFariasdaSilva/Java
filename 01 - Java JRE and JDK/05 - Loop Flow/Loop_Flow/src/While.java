public class While {
    public static void main(String[] args) {
        int counter = 0;

        while (counter <= 10) {
            System.out.println("Counter value: " + counter);
            // Same operators simplification as in C language:
            // ++, --, +=, -=, *=, /=;
            counter++;
        }
    }
}