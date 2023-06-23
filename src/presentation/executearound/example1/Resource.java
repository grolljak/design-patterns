package presentation.executearound.example1;

public class Resource {

    public Resource() {
        System.out.println("Creating resource.");
    }

    public Resource op1() {
        System.out.println("op1");
        return this;
    }
    public Resource op2() {
        System.out.println("op2");
        return this;
    }
    public void finalize() {
        System.out.println("Cleaning up resource");
    }
}
