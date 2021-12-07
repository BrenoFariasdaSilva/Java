public class Connection  implements AutoCloseable {
    public Connection() {
        System.out.println("Opening connection...");
        throw new IllegalStateException();
    }

    public void readData() {
        System.out.println("Recieving Data...");
        throw new IllegalStateException();
    }
    @Override
    public void close() {
        System.out.println("Closing Connection...");
    }
}