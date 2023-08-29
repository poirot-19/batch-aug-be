package oops1;

public class Client {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Abhinav";
        s1.age = 25;
        s1.batch = "aug-lld";
        s1.score  = 90;

        s1.printAge();

        Student s2 = new Student();
        s2.name = "Abhishek";
        s2.batch = "aug-lld-1";
        s2.printAge();
        s2.updateBatchName("Aug-adv-lld");

        Student s3 = new Student();
        s3.printAge();


    }
}
