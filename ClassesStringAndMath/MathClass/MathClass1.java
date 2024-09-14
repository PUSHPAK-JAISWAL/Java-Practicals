package ClassesStringAndMath.MathClass;

public class MathClass1 {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;

        int max = Math.max(a, b);
        int min = Math.min(a, b);
        double squareRoot = Math.sqrt(16);

        
        System.out.println("Max of 10 and 20: " + max);
        System.out.println("Min of 10 and 20: " + min);
        System.out.println("Square root of 16: " + squareRoot);
    }
}
