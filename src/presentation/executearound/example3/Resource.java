package presentation.executearound.example3;

import java.util.function.Consumer;

public class Resource {

    private Resource() {
        System.out.println("Creating resource.");
    }

    public static void use(Consumer<Resource> block) {
        Resource resource = new Resource();
        try {
            block.accept(resource);
        } finally {
            resource.close();
        }
    }

    public Resource op1() {
        System.out.println("op1");
        return this;
    }

    public Resource op2() {
        System.out.println("op2");
        return this;
    }

    private void close() {
        System.out.println("Cleaning up resource");
    }
}
