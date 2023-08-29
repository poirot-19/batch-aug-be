package oops3.inheritance.constructorChaining;

public class C extends B{

    public C(String s){
        System.out.println("Constructor of C");
    }

    private C(){
        super("ABC");
        System.out.println("Constructor of C");
    }
}
