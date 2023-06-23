package presentation.executearound.example2;

public class AutoCloseableResource implements AutoCloseable {

    public AutoCloseableResource() {
        System.out.println("Creating resource.");
    }

    public AutoCloseableResource op1() {
        System.out.println("op1");
        return this;
    }
    public AutoCloseableResource op2() {
        System.out.println("op2");
        return this;
    }

    @Override
    public void close() {
        System.out.println("Cleaning up resource");
    }
}
