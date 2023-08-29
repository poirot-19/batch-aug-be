package oops3.inheritance.constructorChaining;

public class B extends A{

    public B(){
        super(1, "abc");
        System.out.println("Constructor with no params");
    }

    public B(String s){
        super(1, "adef");
        System.out.println("Parameterized Constructor of B");
    }
}
