public class TestReferences {
    public static void main(String[] args) {
        int firstValue = 10;
        int secondValue = 20;

        secondValue = firstValue;
        firstValue = 15;

        System.out.println(secondValue);
    }
}
