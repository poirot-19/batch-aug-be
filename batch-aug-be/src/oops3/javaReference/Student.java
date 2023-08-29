package oops3.javaReference;

public class Student {
    int age;
    double psp;

    void doSomething(Student abc){
        System.out.println("address of abc " + abc);
        abc = null;
    }
}
