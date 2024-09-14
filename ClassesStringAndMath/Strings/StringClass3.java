package ClassesStringAndMath.Strings;

public class StringClass3 {
    public static void main(String[] args) {
        
        String message = "  Learn Java at your own pace  ";
        
        
        String trimmed = trimString(message);
        String[] words = splitString(message.trim(), " ");
        String replaced = replaceWord(message, "Java", "Python");

        
        System.out.println("Original String: '" + message + "'");
        System.out.println("Trimmed String: '" + trimmed + "'");
        System.out.println("Words in the string: ");
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println("Replaced String: " + replaced);
    }

    
    public static String trimString(String str) {
        return str.trim();
    }

    
    public static String[] splitString(String str, String delimiter) {
        return str.split(delimiter);
    }

    
    public static String replaceWord(String str, String target, String replacement) {
        return str.replace(target, replacement);
    }
}
