package ClassesStringAndMath.Strings;

public class StringClass2 {
    public static void main(String[] args) {
        
        String message = "Java Programming";
        
        
        String reversed = reverseString(message);
        String upperCase = convertToUpperCase(message);

        
        System.out.println("Original String: " + message);
        System.out.println("Reversed String: " + reversed);
        System.out.println("Uppercase String: " + upperCase);
    }

    
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    
    public static String convertToUpperCase(String str) {
        return str.toUpperCase();
    }
}
