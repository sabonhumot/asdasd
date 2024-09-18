package javaapplication78;

import java.util.Scanner;

/**
 * to get the user input
 *
 */
public class Grade {

    public void addGrade() {

        Scanner input = new Scanner(System.in);
        Grades[] gr = new Grades[100];

        System.out.print("Enter no. of students: ");
        int noStuds = input.nextInt();

        for (int x = 0; x < noStuds; x++) {
            System.out.print("Enter details of student " + (x + 1) + ".\n");

            System.out.print("Student ID: ");
            int sid = input.nextInt();
            input.nextLine();

            System.out.print("Name: ");
            String name = input.nextLine();

            System.out.print("Prelim: ");
            double pl = input.nextDouble();

            System.out.print("Midterm: ");
            double m = input.nextDouble();

            System.out.print("Prefinal: ");
            double pf = input.nextDouble();

            System.out.print("Final: ");
            double f = input.nextDouble();

            gr[x] = new Grades();
            gr[x].addGrades(sid, name, pl, m, pf, f);

        }

        System.out.println("-------------------------------------------------------------------------------");
        System.out.printf("-%15s %-10s %-10s %-10s %-10s %-10s %-10s %-10s", "Student ID", "Name", "Prelim", "Midterm", "Prefinal", "Final", "Average", "Remarks\n");
        System.out.println("-------------------------------------------------------------------------------");
        for (int x = 0; x < noStuds; x++) {
            gr[x].viewGrades();

        }
    }

}
