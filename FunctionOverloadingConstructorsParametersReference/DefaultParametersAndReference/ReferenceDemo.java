package FunctionOverloadingConstructorsParametersReference.DefaultParametersAndReference;

public class ReferenceDemo {
    int value;

    
    public ReferenceDemo(int value) {
        this.value = value;
    }

    
    public ReferenceDemo modifyValue() {
        this.value += 10; 
        return this;       
    }

    public static void main(String[] args) {
    
        ReferenceDemo obj = new ReferenceDemo(20);
        System.out.println("Before modification: " + obj.value);

        obj.modifyValue();
        System.out.println("After modification: " + obj.value);
    }
}
