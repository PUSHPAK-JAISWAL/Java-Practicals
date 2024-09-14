package CreationAndAccessingOfPackagesImplementingInterface;

// File: Main.java
import CreationAndAccessingOfPackagesImplementingInterface.mypackage.MyClass; // Importing the class from the mypackage

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass(); 
        myClass.displayMessage();        

        MyInterfaceImplementation obj = new MyInterfaceImplementation();
        obj.sayHello();
        obj.sayGoodbye();
    }
}
