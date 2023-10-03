//package DesignPatterns.Builder.SimpleBuilderPROD;
//
//public class Builder {
//    private String name;
//    private int age;
//    private String universityName;
//    private double psp;
//    private String address;
//
//    public String getName() {
//        return name;
//    }
//
//    public Builder setName(String name) {
//        this.name = name;
//        return this;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public Builder setAge(int age) {
//        this.age = age;
//        return this;
//    }
//
//    public String getUniversityName() {
//        return universityName;
//    }
//
//    public Builder setUniversityName(String universityName) {
//        this.universityName = universityName;
//        return this;
//    }
//
//    public Student build(){
//        if(this.getAge() < 21)
//            throw new IllegalArgumentException("Age is less than 21");
//        if(this.getName().equals(""))
//            throw new IllegalArgumentException("Name is empty");
//
//        return new Student(this);
//    }
//}
