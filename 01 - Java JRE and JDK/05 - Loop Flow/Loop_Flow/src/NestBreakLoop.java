public class NestBreakLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            // for (int j = 1; j <= 10; j++) {
            //  if (j > i) { break; }
            //  System.out.print("*");
            // }

            // Simplification
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}