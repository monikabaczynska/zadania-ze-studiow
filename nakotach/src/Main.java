class animal.Animal {
    public void voice() {
        System.out.println("Voice");
    }
}

class Dog extends animal.Animal {
    public void voice() {
        System.out.println("Barking");
    }
}

class Cat extends animal.Animal {
}

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.voice();

        Cat cat = new Cat();
        cat.voice();
    }
}