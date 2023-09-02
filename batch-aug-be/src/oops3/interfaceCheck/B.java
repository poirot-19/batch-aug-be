package oops3.interfaceCheck;

public class B implements A{
    String name;
    @Override
    public void run() {
        System.out.println("I am running now from B");
    }
}
