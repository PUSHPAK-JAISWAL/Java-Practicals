package InheritanceAndPolymorphism.Polymorphism;

interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle.");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle.");
    }
}

public class Polymorphism3 {
    public static void main(String[] args) {
        Shape myShape;

        myShape = new Circle();
        myShape.draw(); 

        myShape = new Rectangle();
        myShape.draw(); 
    }
}
