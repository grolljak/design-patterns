package presentation.factorymethod.example2.classic;

public class ConcreteCreator implements Creator {
    public ConcreteProduct createProduct() {
       return new ConcreteProduct();
    }
}
