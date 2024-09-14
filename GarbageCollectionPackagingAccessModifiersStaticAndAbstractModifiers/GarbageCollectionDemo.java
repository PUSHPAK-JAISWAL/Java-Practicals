package GarbageCollectionPackagingAccessModifiersStaticAndAbstractModifiers;

public class GarbageCollectionDemo {

    public GarbageCollectionDemo() {
        System.out.println("Object created");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage Collected!");
    }

    public static void main(String[] args) {
        GarbageCollectionDemo obj1 = new GarbageCollectionDemo();
        GarbageCollectionDemo obj2 = new GarbageCollectionDemo();

        obj1 = null;

        System.gc();

        obj2 = null;

        System.gc();
    }
}
