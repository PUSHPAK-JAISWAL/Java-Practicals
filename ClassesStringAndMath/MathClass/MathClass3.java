package ClassesStringAndMath.MathClass;

import java.util.Scanner;

public class MathClass3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        
        double discriminant = calculateDiscriminant(a, b, c);
        if (discriminant < 0) {
            System.out.println("No real solutions exist.");
        } else {
            double root1 = calculateRoot1(a, b, discriminant);
            double root2 = calculateRoot2(a, b, discriminant);
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        }

        scanner.close();
    }

    
    public static double calculateDiscriminant(double a, double b, double c) {
        return Math.pow(b, 2) - 4 * a * c;
    }


    public static double calculateRoot1(double a, double b, double discriminant) {
        return (-b + Math.sqrt(discriminant)) / (2 * a);
    }

    
    public static double calculateRoot2(double a, double b, double discriminant) {
        return (-b - Math.sqrt(discriminant)) / (2 * a);
    }
}
