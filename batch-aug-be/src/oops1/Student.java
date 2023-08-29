package oops1;

public class Student {
    int age = 10;
    String name;
    String batch;
    double score;

    void printAge(){
        System.out.println("Student age is " + age);
        System.out.println("Student name is " + name);
        System.out.println("Student score is " + score);
        System.out.println("Student batch is " + batch);
    }

    void updateBatchName(String batchName){
        batch = batchName;
        System.out.println("Batch has been updated to " + batch);
    }
}
