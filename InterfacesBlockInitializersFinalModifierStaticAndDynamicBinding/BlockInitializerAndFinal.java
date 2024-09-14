package InterfacesBlockInitializersFinalModifierStaticAndDynamicBinding;

class BlockInitializerExample {
    final int maxSpeed;
    static int objectCount = 0;

    static {
        System.out.println("Static block executed.");
    }

    {
        maxSpeed = 100;
        objectCount++;
        System.out.println("Instance block executed. Object count: " + objectCount);
    }

    public BlockInitializerExample() {
        System.out.println("Constructor executed.");
    }
}

public class BlockInitializerAndFinal {
    public static void main(String[] args) {
        BlockInitializerExample example1 = new BlockInitializerExample();
        BlockInitializerExample example2 = new BlockInitializerExample();
        System.out.println("Max speed: " + example1.maxSpeed);
    }
}
