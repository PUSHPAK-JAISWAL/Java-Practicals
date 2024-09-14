package OperatorsArithmeticPromotionMethodCalling.Operators;

public class Operators2 {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        int c = 30;

        boolean isEqual = a == b;
        boolean isGreater = a > b;
        boolean isLessOrEqual = a <= c;
        
        boolean andCondition = (a > b) && (b < c);
        boolean orCondition = (a < b) || (b > c);
        boolean notCondition = !(a == c);

        System.out.println("Is a equal to b? " + isEqual);
        System.out.println("Is a greater than b? " + isGreater);
        System.out.println("Is a less than or equal to c? " + isLessOrEqual);
        System.out.println("AND condition: " + andCondition);
        System.out.println("OR condition: " + orCondition);
        System.out.println("NOT condition: " + notCondition);
    }
}
