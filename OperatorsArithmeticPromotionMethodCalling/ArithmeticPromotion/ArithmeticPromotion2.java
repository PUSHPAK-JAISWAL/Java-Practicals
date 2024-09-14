package OperatorsArithmeticPromotionMethodCalling.ArithmeticPromotion;

public class ArithmeticPromotion2 {
    public static void main(String[] args) {
        byte a = 10;
        short b = 20;
        int c = 50;
        long d = 100L;
        float e = 12.5f;
        double f = 25.75;

        
        double result = a + b + c + d + e + f;

        System.out.println("Result (types promoted): " + result);
    }
}
