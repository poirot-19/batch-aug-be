package oops3.polymorphism.compileTime;

import java.util.Random;

public class Client {
    public static void main(String[] args) {
//        A c = new C();
//        A b = new B();
//        c.print(c);
//        b.print(b);
//          A a = doSomething();
          A a = doSomething();
          a.print(a);
//          a.psp;

    }

    public static B doSomething(){
        Random random = new Random();
        if(random.nextInt() % 2 == 0)
            return new B();
        else
            return new C();
    }
}
