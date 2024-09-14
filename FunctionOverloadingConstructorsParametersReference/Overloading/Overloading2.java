package FunctionOverloadingConstructorsParametersReference.Overloading;

public class Overloading2 {
    public static void main(String[] args) {
        
        System.out.println("Multiplication of 2 integers: " + multiply(4, 5));
        System.out.println("Multiplication of 2 doubles: " + multiply(4.5, 2.0));
        System.out.println("Multiplication of 3 integers: " + multiply(4, 5, 6));
    }

    
    public static int multiply(int a, int b) {
        return a * b;
    }

    
    public static double multiply(double a, double b) {
        return a * b;
    }

    
    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }
}
