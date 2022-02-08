package Zrobione;

public class University {
    public static void main(String[] args) {


        Student student1 = Student.creatingStudent();
        Student student2 = Student.creatingStudent();


        System.out.println(student1.firstName + student1.lastName + student1.pesel + Student.index);
        System.out.println(student2.firstName + student2.lastName + student1.pesel + Student.index);
    }
}
