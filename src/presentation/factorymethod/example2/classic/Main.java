package presentation.factorymethod.example2.classic;

public class Main {

    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        final Product product = creator.createProduct();

        System.out.println(product);
    }
}
