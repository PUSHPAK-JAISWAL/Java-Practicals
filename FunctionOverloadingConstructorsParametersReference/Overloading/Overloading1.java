package FunctionOverloadingConstructorsParametersReference.Overloading;

public class Overloading1 {
    public static void main(String[] args) {
        
        System.out.println("Sum of 2 integers: " + add(5, 10));
        System.out.println("Sum of 3 integers: " + add(5, 10, 15));
    }

    
    public static int add(int a, int b) {
        return a + b;
    }

    
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
}
