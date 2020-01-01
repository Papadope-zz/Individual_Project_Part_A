/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package individual_project;

import classes.Student;
import classes.Course;
import classes.Assignment;
import classes.Functions;
;
import classes.Trainer;
import java.util.Scanner;

/**
 *
 * @author xrist
 */


public class Individual_Project {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        do {
            System.out.println("Menu:\n"
                    + "If on main menu, press \"exit\" to terminate\n"
                    + "Press 1 to create Courses\n"
                    + "press 2 to create Trainers\n"
                    + "Press 3 to create Students\n"
                    + "Press 4 to create Assignments\n"
                    + "============================\n"
                    + "Press 5 to print Courses\n"
                    + "Press 6 to print Trainers\n"
                    + "Press 7 to print Students\n"
                    + "Press 8 to print Assignments\n"
                    + "============================\n"
                    + "Press 9 to add Student to Course\n"
                    + "Press 10 to add Trainers to Course\n"
                    + "Press 11 to add Assignments to Course\n"
                    + "Press 12 to add Assignments to Student\n"
                    + "============================\n"
                    + "Press 13 to print Students per Course\n"
                    + "Press 14 to print Trainers per Course\n"
                    + "Press 15 to print Assignments per Course\n"
                    + "Press 16 to print Assignments per Student\n"
                    + "============================\n"
                    + "Press 17 to print a list of Students with more than 1 assignment\n"
                    + "Press 18 to print the school i have made for you\n"
            );
            String choice = sc.next();
            choice = choice.toLowerCase();

            switch (choice) {
                case "1":
                    do {
                        Functions.insertCourses();
                    } while (sc.next().equals("1"));
                    loop = true;
                    break;

                case "2":
                    do {
                        Functions.insertTrainers();
                    } while (sc.next().equals("1"));
                    loop = true;
                    break;

                case "3":
                    do {
                        Functions.insertStudents();
                    } while (sc.next().equals("1"));

                    loop = true;
                    break;
                case "4":
                    do {
                        Functions.insertAssignments();
                    } while (sc.next().equals("1"));
                    loop = true;
                    break;
                case "5":
                    Functions.printCourses();
                    System.out.println("");
                    break;
                case "6":
                    Functions.printTrainers();
                    System.out.println("");
                    break;
                case "7":
                    Functions.printStudents();
                    System.out.println("");
                    break;
                case "8":
                    Functions.printAssignments();
                    System.out.println("");
                    break;
                case "9":
                    Functions.addStudentToCourse();
                    System.out.println("");
                    break;
                case "10":
                    Functions.addTrainerToCourse();
                    System.out.println("");
                    break;

                case "11":
                    Functions.addAssignmentToCourse();
                    System.out.println("");
                    break;
                case "12":
                    Functions.addAssignmentToStudent();
                    System.out.println("");
                    break;
                case "13":
                    Functions.printStudentsPerCourse();
                    System.out.println("");
                    break;
                case "14":
                    Functions.printTrainersPerCourse();
                    System.out.println("");
                    break;
                case "15":
                    Functions.printAssignmentsPerCourse();
                    System.out.println("");
                    break;
                case "16":
                    Functions.printAssignmentPerStudent();
                    System.out.println("");
                    break;
                case "17":
                    Functions.studentsWithMoreAssignments();
                    System.out.println("");
                    break;
                case "18":
                    Course.addCoursesToList();
                    Student.addStudentToList();
                    Assignment.addAssignmentToList();
                    Trainer.addTrainerToList();
                    Course.menu();
                    System.out.println("");
                    break;
                case "exit":
                    System.out.println("Terminating..!");
                    loop = false;
                    break;

                default:
                    System.out.println("Invalid option");
                    loop = true;
            }

        } while (loop);

    }

}
