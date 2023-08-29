package oops3.javaReference;

public class Client {
    public static void main(String[] args) {
        Student student = new Student();
        student.age = 21;
        student.psp = 90.0;

        System.out.println("address of student " + student);
        student.doSomething(student);

        System.out.println("Student age " + student.age);
        System.out.println("Student psp " + student.psp);
    }
}
