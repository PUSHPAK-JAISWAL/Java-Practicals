package ExceptionHandling;

public class ExceptionHandling2 {
    public static void main(String[] args) {
        try {
            int[] array = {1, 2, 3};
            int a = 10, b = 0;

            int result = a / b;
            System.out.println("Result: " + result);

            System.out.println("Element: " + array[5]);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds.");
        } finally {
            System.out.println("This will always execute.");
        }
        System.out.println("Program continues after exception handling.");
    }
}
