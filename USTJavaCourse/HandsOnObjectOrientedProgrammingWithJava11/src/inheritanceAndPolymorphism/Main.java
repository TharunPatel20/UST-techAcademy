package inheritanceAndPolymorphism;

abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void makeSound();
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
}
class Lion extends Animal {
    public Lion(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Roar...!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal[] animals = { new Dog("Buddy"), new Cat("Whiskers"), new Lion("simba") };

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
