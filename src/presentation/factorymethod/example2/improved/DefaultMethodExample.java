package presentation.factorymethod.example2.improved;

interface Person {
    Pet getPet();

    default void play() {
        System.out.println("Playing with " + getPet());
    }
}

interface Pet {

}

class Dog implements Pet {

}

class Cat implements Pet {

}

class DogPerson implements Person {

    @Override
    public Pet getPet() {
        return new Dog();
    }
}

class CatPerson implements Person {

    @Override
    public Pet getPet() {
        return new Cat();
    }
}

class Main {
    public static void main(String[] args) {
        final Person dogPerson = new DogPerson();
        dogPerson.play();

        final Person catPerson = new CatPerson();
        catPerson.play();
    }
}