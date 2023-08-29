package oops2.constructors;

public class Client {
    public static void main(String[] args) {
        Student student = new Student(21, "ABC");
        Student student1 = new Student(student);

        System.out.println("Before updating");
        System.out.println(student.name);
        System.out.println(student1.name);

        System.out.println("After updating");
        student.name = "adfafafasfasf";
        System.out.println(student.name);
        System.out.println(student1.name);

//        System.out.println("Student details are " + student.name + " " + student.age);
//
//        Student abhinav = new Student(student);
//        System.out.println("Student details of Abhinav " + student.name + " " + student.age);
//
//        System.out.println("Student addresses " + student + " and " + abhinav);
//
//        Student student2 = abhinav;
//
//        System.out.println("Student addresses " + student2 + " and " + abhinav);
    }
}
