public class Summation {
    public static void main(String[] args) {
        int counter = 0;
        int total = 0;

//        while(counter <= 10) {
//            total+=counter;
//            counter++;
//        }

        while(++counter <= 10) { // Easier way to add increment in a variable without spending a line.
            total+=counter;
//            counter++;
        }

        System.out.println("The sum of 0 to 10 is: " + total);
    }
}
