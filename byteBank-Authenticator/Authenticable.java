public abstract interface Authenticable {
    // You can't do any implementation inside an interface , only prototypes.
    public abstract boolean authenticate (int password);
    public abstract void setPassword(int password);
}
