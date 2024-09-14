package FunctionOverloadingConstructorsParametersReference.Constructors;

public class CopyConstructor {
    int x;
    int y;

    public CopyConstructor(int a, int b) {
        x = a;
        y = b;
    }

    public CopyConstructor(CopyConstructor obj) {
        this.x = obj.x;
        this.y = obj.y;
    }

    public void display() {
        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);
    }

    public static void main(String[] args) {
        CopyConstructor obj1 = new CopyConstructor(10, 20);
        obj1.display();

        CopyConstructor obj2 = new CopyConstructor(obj1);
        obj2.display();
    }
}
