public class TestSomatoria {
    public static void main(String[] args) {
        int contador = 0, total = 0;
        while (contador++ < 100) {
            // contador = contador + 1;
            // contador += 1;;
            // contador++;
            total += contador;
        }
        System.out.println(total);
    }
}
