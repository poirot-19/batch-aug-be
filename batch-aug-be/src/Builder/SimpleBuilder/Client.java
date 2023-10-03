package DesignPatterns.Builder.SimpleBuilder;

public class Client {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.setAge(20);
        builder.setName("abc");
        builder.setUniversityName("xyz");
        Student student = new Student(builder);
        System.out.println(student.name);
    }
}
