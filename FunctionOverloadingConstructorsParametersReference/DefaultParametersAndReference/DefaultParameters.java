package FunctionOverloadingConstructorsParametersReference.DefaultParametersAndReference;

public class DefaultParameters {
    public void greet(String name, String message) {
        System.out.println(message + ", " + name);
    }

    
    public void greet(String name) {
        greet(name, "Hello"); 
    }

    public static void main(String[] args) {
        DefaultParameters obj = new DefaultParameters();

        
        obj.greet("Alice", "Good morning");

        
        obj.greet("Bob");
    }
}
