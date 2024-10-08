package GarbageCollectionPackagingAccessModifiersStaticAndAbstractModifiers;

abstract class Animal {
    
    abstract void sound();

    void sleep() {
        System.out.println("This animal sleeps.");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("The cat meows.");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Animal dog = new Dog(); 
        dog.sound();            
        dog.sleep();             

        Animal cat = new Cat();
        cat.sound();
        cat.sleep();
    }
}
