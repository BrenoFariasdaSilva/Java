public class TestConnection {
    public static void main(String[] args) {

        try (Connection connection = new Connection()) {
            connection.readData();
        } catch (IllegalStateException exception) {
            System.out.println("Connection Error: " + exception.getMessage());

        }
        //---------------------------------------------------------------------
        // Connection connection = null;

        // try {
        //     connection = new Connection();
        //     connection.readData();
        // } catch (IllegalStateException e) {
        //     System.out.println("Connection Error: " + exception.getMessage());
        // } finally {
        //     System.out.println("Finally");
        //     if (connection != null) {
        //         connection.close();  
        //     }
        // }
    }
} 