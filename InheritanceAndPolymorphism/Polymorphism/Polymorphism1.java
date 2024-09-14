package InheritanceAndPolymorphism.Polymorphism;

public class Polymorphism1 {

    void display(int a) {
        System.out.println("Integer value: " + a);
    }

    void display(double a) {
        System.out.println("Double value: " + a);
    }

    public static void main(String[] args) {
        Polymorphism1 obj = new Polymorphism1();

        obj.display(5);       
        obj.display(5.5);       
    }
}
