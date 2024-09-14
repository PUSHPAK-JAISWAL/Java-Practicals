package ClassesStringAndMath.MathClass;

public class MathClass2 {
    public static void main(String[] args) {
        
        double angle = 45.0; 

        
        double radians = convertDegreesToRadians(angle);
        double sine = calculateSine(radians);
        double cosine = calculateCosine(radians);
        double power = calculatePower(2, 3);

        
        System.out.println("45 degrees in radians: " + radians);
        System.out.println("Sine of 45 degrees: " + sine);
        System.out.println("Cosine of 45 degrees: " + cosine);
        System.out.println("2 to the power of 3: " + power);
    }

    
    public static double convertDegreesToRadians(double degrees) {
        return Math.toRadians(degrees);
    }

    
    public static double calculateSine(double radians) {
        return Math.sin(radians);
    }


    public static double calculateCosine(double radians) {
        return Math.cos(radians);
    }

    
    public static double calculatePower(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}
