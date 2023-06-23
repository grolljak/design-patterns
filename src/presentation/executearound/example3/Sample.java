package presentation.executearound.example3;

public class Sample {
    public static void main(String[] args) {
        Resource.use(resource -> resource.op1().op2());
    }
}
