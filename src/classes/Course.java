/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author xrist
 */
public class Course {

    static Scanner sc = new Scanner(System.in);
    private String title;
    private String stream;
    private String type;
    private LocalDate start_date;
    private LocalDate end_date;
    private static ArrayList<Course> listOfCourses = new ArrayList();
    private ArrayList<Student> listOfCourseStudents = new ArrayList();
    private ArrayList<Trainer> listOfCourseTrainers = new ArrayList();
    private ArrayList<Assignment> listOfCourseAssignments = new ArrayList();
    public static ArrayList<Student> listOfAllStudents = new ArrayList<>();
    public static ArrayList<Trainer> listOfAllTrainers = new ArrayList<>();
    public static ArrayList<Course> listOfAllCourses = new ArrayList<>();
    public static ArrayList<Assignment> listOfAllAssignments = new ArrayList<>();

    public static void addCoursesToList() {

        listOfCourses.add(new Course("Bootcamp 9 ", "Java", "Full-Time", LocalDate.of(1990, 03, 20), LocalDate.of(1990, 06, 20)));
        listOfCourses.add(new Course("Bootcamp 9 ", "Java", "Part-Time", LocalDate.of(1990, 03, 20), LocalDate.of(1990, 9, 20)));
        listOfCourses.add(new Course("Bootcamp 9 ", "C#", "Full-Time", LocalDate.of(1990, 03, 20), LocalDate.of(1990, 06, 20)));
        listOfCourses.add(new Course("Bootcamp 9 ", "C#", "Part-Time", LocalDate.of(1990, 03, 20), LocalDate.of(1990, 9, 20)));
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getStart_date() {
        return start_date;
    }

    public void setStart_date(LocalDate start_date) {
        this.start_date = start_date;
    }

    public LocalDate getEnd_date() {
        return end_date;
    }

    public void setEnd_date(LocalDate end_date) {
        this.end_date = end_date;
    }

    public static ArrayList<Course> getListOfCourses() {
        return listOfCourses;
    }

    public ArrayList<Student> getListOfCourseStudents() {
        return listOfCourseStudents;
    }

    public ArrayList<Trainer> getListOfCourseTrainers() {
        return listOfCourseTrainers;
    }

    public ArrayList<Assignment> getListOfCourseAssignments() {
        return listOfCourseAssignments;
    }

    public Course(String title, String stream, String type, LocalDate start_date, LocalDate end_date) {
        this.title = title;
        this.stream = stream;
        this.type = type;
        this.start_date = start_date;
        this.end_date = end_date;
    }

    @Override
    public String toString() {
        return "Course : " + " Title : " + title + " Stream : " + stream + ", Type : " + type + " Start Date : " + start_date + " End Date : " + end_date + "\n";
    }

    public static void menu() {
        int choice = -1;
        while (choice < 0 || choice > 7) {
            System.out.println(" - Choose what do you want to get inform about : ");
            System.out.println("#1. A List Of All Students : ");
            System.out.println("#2. A List Of All Trainers : ");
            System.out.println("#3. A List Of All Assignments : ");
            System.out.println("#4. A List Of All Courses : ");
            System.out.println("#5. A List Of All Students Per Course : ");
            System.out.println("#6. A List Of Trainers Per Course : ");
            System.out.println("#7. A List Of Assignments Per Course : ");
            System.out.println("#8. A List Of Assignments Per Student : ");
            System.out.println("#0. Press 0 to terminate the program ");

            choice = Integer.parseInt(sc.nextLine());
            
            switch (choice) {

                case 1:
                    System.out.println(" A List Of All Students : ");
                    System.out.println(Student.getListOfStudents());
                    menu();
                    break;

                case 2:
                    System.out.println(" A List Of All Trainers : ");
                    System.out.println(Trainer.getListOfTrainers());
                    menu();
                    break;

                case 3:
                    System.out.println(" A List Of All Assignments : ");
                    System.out.println(Assignment.getListOfAssignments());
                    menu();
                    break;

                case 4:
                    System.out.println(" A List Of All Courses : ");
                    System.out.println(Course.getListOfCourses());
                    menu();
                    break;

                case 5:
                    System.out.println(" A List Of All Students Per Course : ");
                    studentsPerCourse();
                    break;

                case 6:
                    System.out.println(" A List Of Trainers Per Course : ");
                    trainersPerCourse();
                    break;

                case 7:
                    System.out.println(" A List Of Assignments Per Course : ");
                    assignmentsPerCourse();
                    break;

                case 8:
                    System.out.println("A List Of Assignments Per Student : ");
                    Student.assignmentsPerStudent();
                    break;
                case 0:
                    System.out.println(" GoodBye. \n  Remember if it works, don't touch it.");
                    System.exit(0);
                default:
                    System.out.println(" Invalid input. Choose between what i gave you, stupid!!! ");

            }

        }
    }

    public static void studentsPerCourse() {
        System.out.println(" - Choose which course you want to see the students of : ");
        for (int i = 0; i < listOfCourses.size(); i++) {
            System.out.println("#" + (i + 1) + " " + listOfCourses.get(i).getTitle() + " " + listOfCourses.get(i).getStream() + " " + listOfCourses.get(i).getType());
        }
        int choice = Integer.parseInt(sc.nextLine());
        for (int j = 0; j < listOfCourses.size(); j++) {
            if (choice == j + 1) {
                System.out.println(Course.listOfCourses.get(j).listOfCourseStudents);

            }

        }
        menu();
    }

    public static void trainersPerCourse() {
        System.out.println(" - Choose which course you want to see the trainers of : ");
        for (int i = 0; i < listOfCourses.size(); i++) {
            System.out.println("#" + (i + 1) + " " + listOfCourses.get(i).getTitle() + " " + listOfCourses.get(i).getStream() + " " + listOfCourses.get(i).getType());
        }
        int choice = Integer.parseInt(sc.nextLine());
        for (int j = 0; j < listOfCourses.size(); j++) {
            if (choice == j + 1) {
                System.out.println(Course.listOfCourses.get(j).listOfCourseTrainers);

            }

        }
        menu();
    }

    public static void assignmentsPerCourse() {
        System.out.println(" - Choose which assignment you want to see per course : ");
        for (int i = 0; i < listOfCourses.size(); i++) {
            System.out.println("#" + (i + 1) + " " + listOfCourses.get(i).getTitle() + " " + listOfCourses.get(i).getStream() + " " + listOfCourses.get(i).getType());
        }
        int choice = Integer.parseInt(sc.nextLine());

        for (int j = 0; j < listOfCourses.size(); j++) {
            if (choice == j + 1) {
                System.out.println(Course.listOfCourses.get(j).listOfCourseAssignments);

            }

        }
        menu();
    }
}

    
    


