package OperatorsArithmeticPromotionMethodCalling.MethodCalling;

public class MethodCalling3 {
    public static void main(String[] args) {
        int result1 = multiply(10, 5);
        double result2 = multiply(2.5, 4.5);

        double chainedResult = square(addNumbers(3, 7));

        System.out.println("Multiplication of integers: " + result1);
        System.out.println("Multiplication of doubles: " + result2);
        System.out.println("Chained result (square of sum): " + chainedResult);
    }

    public static int multiply(int a, int b) {
        return a * b;
    }


    public static double multiply(double a, double b) {
        return a * b;
    }

    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static double square(int num) {
        return num * num;
    }
}
