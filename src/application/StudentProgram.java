package application;

import entities.Student;

import java.util.Scanner;

public class StudentProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Student Name: ");
        student.name = sc.nextLine();

        System.out.println("First Note: ");
        student.note1 = sc.nextDouble();

        System.out.println("Second Note: ");
        student.note2 = sc.nextDouble();

        System.out.println("Third Note: ");
        student.note3 = sc.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n", student.finalNote());

        if (student.finalNote() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", student.missingPoints());
        } else {
            System.out.println("PASS");
        }


    }
}
