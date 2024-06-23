package ch07.sec10.exam02;

public class AbstractMethodExample {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.sound();
        dog.sound();

        animalSound(new Dog());
        animalSound(new Cat());

    }

    public static void animalSound(Animal animal) {
        animal.sound();
    }
}
