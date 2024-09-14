package OperatorsArithmeticPromotionMethodCalling.ArithmeticPromotion;

public class ArithmeticPromotion3 {
    public static void main(String[] args) {
        int a = 10;
        double b = 3.0;

        
        double result = a / b;

        System.out.println("Result of division (int promoted to double): " + result);

        
        int c = 10;
        int d = 3;
        int intDivisionResult = c / d;

        System.out.println("Result of integer division (no promotion): " + intDivisionResult);
    }
}
