package DesignPatterns.Builder.SimpleBuilder;

public class Student {
    String name;
    int age;
    String universityName;
    double psp;
    String address;

    // normal way of creating objects
//    public Student(){
//
//    }

    public Student(Builder builder){

        // validations can be performed here
        if(builder.getAge() < 21)
            throw new IllegalArgumentException("Age is less than 21");
        // validations end here

        name = builder.getName();
        age = builder.getAge();
        universityName = builder.getUniversityName();

    }


}
