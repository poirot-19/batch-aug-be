package DesignPatterns.PrototypeRegistry;

public class Student implements Prototype<Student>{
    private int age;
    private String name;
    private double studentPsp;
    private String batch;
    private double avgBatchPsp;

    public Student(){}

    public Student(Student student){
        this.age = student.age;
        this.name = student.name;
        this.studentPsp = student.studentPsp;
        this.batch = student.batch;
        this.avgBatchPsp = student.avgBatchPsp;
    }

//    public int getAge() {
//        return age;
//    }

    public void setAge(int age) {
        this.age = age;
    }

//    public String getName() {
//        return name;
//    }

    public void setName(String name) {
        this.name = name;
    }

//    public double getStudentPsp() {
//        return studentPsp;
//    }

    public void setStudentPsp(double studentPsp) {
        this.studentPsp = studentPsp;
    }

//    public String getBatch() {
//        return batch;
//    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

//    public double getAvgBatchPsp() {
//        return avgBatchPsp;
//    }

    public void setAvgBatchPsp(double avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }

    @Override
    public Student clone() {
//        Student copy = new Student();
//        copy.age = this.age;
//        copy.name = this.name;
//        copy.studentPsp = this.studentPsp;
//        copy.batch = this.batch;
//        copy.avgBatchPsp = this.avgBatchPsp;
//        return copy;
        return new Student(this);
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", studentPsp=" + studentPsp +
                ", batch='" + batch + '\'' +
                ", avgBatchPsp=" + avgBatchPsp +
                '}';
    }
}
