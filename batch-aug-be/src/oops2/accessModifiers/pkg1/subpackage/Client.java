package oops2.accessModifiers.pkg1.subpackage;

import oops2.accessModifiers.pkg1.Student;

public class Client extends Student {

    public static void main(String[] args) {
        Student student = new Student();
        student.universityName = "abc";
        Client client = new Client();
    }
}
