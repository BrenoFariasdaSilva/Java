public class Cast {
    public static void main (String[] args) {
        double salary = 1270.50;
        int valor = (int) salary;
        // This won't even compile: int valor = salary;
        System.out.println("Result of \"int valor = (int) salary;\", with \"double salary = 1270.50;\"");
    }

}
