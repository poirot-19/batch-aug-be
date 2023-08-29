package oops2.accessModifiers.pkg2;

import oops2.accessModifiers.pkg1.Student;

public class StudentChild extends Student {

    public static void main(String[] args) {
        StudentChild studentChild = new StudentChild();
        studentChild.psp = 90.0;
        studentChild.universityName = "Abc";
//        studentChild.name = "ASD";
//        studentChild.age = 20;

        Student student = new Student();
        student.universityName = "ABC";
//        student.psp = 10.0;

    }
}

