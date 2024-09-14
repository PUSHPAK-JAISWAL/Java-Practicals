package FunctionOverloadingConstructorsParametersReference.Constructors;

public class ParameterizedConstructor {
    int x;
    int y;

    public ParameterizedConstructor(int a, int b) {
        x = a;
        y = b;
    }

    public void display() {
        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);
    }

    public static void main(String[] args) {
        ParameterizedConstructor obj = new ParameterizedConstructor(5, 10);
        obj.display();
    }
}
