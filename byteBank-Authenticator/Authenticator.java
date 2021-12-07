// Composition. Useful for avodiing code duplicate.

public class Authenticator {
    private int password;

    public boolean authenticate(int password) {
        if (this.password == password) {
            return true;
        }
        return false;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
