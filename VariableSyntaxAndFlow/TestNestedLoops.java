public class TestNestedLoops {
    public static void main(String[] args) {
        for (int multiplier = 1; multiplier <= 10; multiplier++) {
            for (int counter = 0; counter <= 10; counter++) {
                System.out.println(multiplier * counter);
            }
        }
    }
}