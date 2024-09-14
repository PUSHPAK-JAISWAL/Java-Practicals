package CreationAndAccessingOfPackagesImplementingInterface;
import CreationAndAccessingOfPackagesImplementingInterface.mypackage.MyInterface;

public class MyInterfaceImplementation implements MyInterface {

    // Implementing the interface methods
    @Override
    public void sayHello() {
        System.out.println("Hello from MyInterfaceImplementation!");
    }

    @Override
    public void sayGoodbye() {
        System.out.println("Goodbye from MyInterfaceImplementation!");
    }
}
