package InterfacesBlockInitializersFinalModifierStaticAndDynamicBinding;

class Parent {
    
    public static void staticMethod() {
        System.out.println("Static method in Parent");
    }

    
    public void instanceMethod() {
        System.out.println("Instance method in Parent");
    }
}

class Child extends Parent {
    
    public static void staticMethod() {
        System.out.println("Static method in Child");
    }

    @Override
    public void instanceMethod() {
        System.out.println("Instance method in Child");
    }
}

public class StaticAndDynamicBinding {
    public static void main(String[] args) {
        Parent p = new Child();
        
        p.staticMethod();
        
        p.instanceMethod();  
    }
}
