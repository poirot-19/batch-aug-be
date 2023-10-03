package DesignPatterns.Builder.SimpleBuilderPROD;

public class Client {
    public static void main(String[] args) {
        Student student = Student.getBuilder()
                        .setAge(22)
                        .setName("abc")
                        .setUniversityName("xyz")
                        .build();
        System.out.println(student);


    }
}
