package FunctionOverloadingConstructorsParametersReference.Constructors;

public class DefaultConstructor {
    int x;
    public DefaultConstructor() {
        x = 10; 
    }

    public void display() {
        System.out.println("Value of x: " + x);
    }

    public static void main(String[] args) {
        DefaultConstructor obj = new DefaultConstructor();
        obj.display();
    }
}
