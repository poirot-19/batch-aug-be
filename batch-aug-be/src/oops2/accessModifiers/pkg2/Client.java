package oops2.accessModifiers.pkg2;

import oops2.accessModifiers.pkg1.Student;

public class Client {
    public static void main(String[] args) {
        Student student = new Student();
        student.universityName = "DEF";
//        student.age = 20; // its a private member
//        student.psp = 90.0; // its a protected member
//        student.name = "Aman"; // default member
    }
}
