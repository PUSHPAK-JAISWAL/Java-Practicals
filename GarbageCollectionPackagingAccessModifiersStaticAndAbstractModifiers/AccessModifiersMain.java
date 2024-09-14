package GarbageCollectionPackagingAccessModifiersStaticAndAbstractModifiers;

class AccessModifiersDemo {
    public String publicVariable = "Public Variable"; // Accessible everywhere
    private String privateVariable = "Private Variable"; // Accessible only in this class
    protected String protectedVariable = "Protected Variable"; // Accessible in subclasses or package
    String defaultVariable = "Default (Package-private) Variable"; // Accessible within the same package

    // Public method
    public void showVariables() {
        System.out.println(publicVariable);
        System.out.println(privateVariable);   // Accessible within this class
        System.out.println(protectedVariable);
        System.out.println(defaultVariable);
    }
}

class SubClass extends AccessModifiersDemo {
    public void displayFromSubclass() {
        System.out.println(publicVariable);    // Accessible
        // System.out.println(privateVariable); // Not accessible
        System.out.println(protectedVariable); // Accessible due to inheritance
        System.out.println(defaultVariable);   // Accessible within the same package
    }
}

public class AccessModifiersMain {
    public static void main(String[] args) {
        AccessModifiersDemo demo = new AccessModifiersDemo();
        demo.showVariables();

        // Accessing variables from main
        System.out.println(demo.publicVariable);
        // System.out.println(demo.privateVariable); // Error: privateVariable has private access
        System.out.println(demo.protectedVariable); // Accessible in the same package
        System.out.println(demo.defaultVariable);   // Accessible in the same package

        SubClass subclass = new SubClass();
        subclass.displayFromSubclass();
    }
}
