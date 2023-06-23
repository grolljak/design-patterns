package presentation.executearound.example2;

public class Sample {

    public static void main(String[] args) {
        AutoCloseableResource resource = new AutoCloseableResource();
        resource.op1();
        resource.op2();
    }

}
