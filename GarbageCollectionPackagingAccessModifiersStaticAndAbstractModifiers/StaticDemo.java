package GarbageCollectionPackagingAccessModifiersStaticAndAbstractModifiers;

public class StaticDemo {

    static int count = 0;

    public StaticDemo() {
        count++;
    }

    static void displayCount() {
        System.out.println("Number of objects created: " + count);
    }

    public static void main(String[] args) {
        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();

        StaticDemo.displayCount();
    }
}
