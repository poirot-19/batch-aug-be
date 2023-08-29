package oops3.inheritance;

public class Client {
    public static void main(String[] args) {
        Student student = new Student();
        student.psp = 90.0;
        student.takeATest();
        student.userName = "ABC";
        student.login();

        User user = new User();
        user.userName = "NewUser";
        user.login();
//        user.takeAtest();
    }
}
