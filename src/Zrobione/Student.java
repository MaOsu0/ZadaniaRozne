package Zrobione;

import java.util.Scanner;

public class Student {
    static Scanner sc = new Scanner(System.in);

    String firstName;
    String lastName;
    String pesel;
    static int index = 0;

    public Student(String firstName, String lastName, String pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
    }


    static Student creatingStudent() {
        System.out.println("Podaj imię, nazwisko, pesel");
        Student student = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine());
        index++;
        return student;
    }
}
