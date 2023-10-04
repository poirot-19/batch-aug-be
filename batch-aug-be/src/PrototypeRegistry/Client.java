package DesignPatterns.PrototypeRegistry;

public class Client {
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        registerStudents(studentRegistry);

        Student aman = studentRegistry.get("aug_lld_student").clone();
        aman.setName("Aman");
        aman.setAge(21);
        aman.setStudentPsp(80.0);

        Student intelligentAman = studentRegistry.get("intelligent_aug_lld_student").clone();
        intelligentAman.setName("Intelligent Aman");
        intelligentAman.setAge(23);
        intelligentAman.setStudentPsp(95.0);

        System.out.println(aman);
        System.out.println(intelligentAman);

    }

    public static void registerStudents(StudentRegistry studentRegistry){
        Student augLldStudent = new Student();
        augLldStudent.setBatch("Aug_LLD_Student");
        augLldStudent.setAvgBatchPsp(90.0);
        studentRegistry.register("aug_lld_student", augLldStudent);

        IntelligentStudent intelligentStudent = new IntelligentStudent();
        intelligentStudent.iq = 140;
        intelligentStudent.setBatch("Aug batch");
        intelligentStudent.setAvgBatchPsp(90.0);
        studentRegistry.register("intelligent_aug_lld_student", intelligentStudent);
    }
}
