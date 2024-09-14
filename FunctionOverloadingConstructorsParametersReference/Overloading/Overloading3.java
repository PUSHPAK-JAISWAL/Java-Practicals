package FunctionOverloadingConstructorsParametersReference.Overloading;

public class Overloading3 {
    public static void main(String[] args) {
        System.out.println("Addition of two integers: " + add(5, 10));       
        System.out.println("Addition of two floats: " + add(5.5f, 10.2f));    
        System.out.println("Addition with one int and one float: " + add(5, 10.5f)); 
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static float add(float a, float b) {
        return a + b;
    }
    
    public static float add(int a, float b) {
        return a + b;
    }
}
