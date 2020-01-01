/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import static classes.Course.sc;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author xrist
 */
public class Student {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private int tuitionFees;
    private static ArrayList<Student> listOfStudents = new ArrayList();
    private ArrayList<Assignment> listOfStudentAssignments = new ArrayList();
    private String uni;
    
    public static void addStudentToList() {

        listOfStudents.add(new Student("Oliver", "Smith ", LocalDate.of(1991, 03, 27), 1956 , "\u20ac"));
        listOfStudents.add(new Student("George", "Johnson", LocalDate.of(1988, 8, 31), 3000, "\u20ac"));
        listOfStudents.add(new Student("Harry", "Williams", LocalDate.of(1996, 8, 04), 2505, "\u20ac"));
        listOfStudents.add(new Student("Jack", "Jones", LocalDate.of(1997, 06, 12), 1650, "\u20ac"));
        listOfStudents.add(new Student("Jacob", "Brown", LocalDate.of(1986, 06, 11), 3542, "\u20ac"));
        listOfStudents.add(new Student("Noah", "Davis", LocalDate.of(1985, 05, 12), 2541, "\u20ac"));
        listOfStudents.add(new Student("Charlie", "Miller", LocalDate.of(1995, 04, 10), 2365, "\u20ac"));
        listOfStudents.add(new Student("Muhammad", "Wilson", LocalDate.of(1992, 9, 5), 1546, "\u20ac"));
        listOfStudents.add(new Student("Thomas", "Moore", LocalDate.of(1990, 11, 4), 1496, "\u20ac"));
        listOfStudents.add(new Student("Oscar", "Taylor", LocalDate.of(1989, 01, 3), 1135, "\u20ac"));
        Course.getListOfCourses().get(0).getListOfCourseStudents().add(listOfStudents.get(0));
        Course.getListOfCourses().get(0).getListOfCourseStudents().add(listOfStudents.get(1));
        Course.getListOfCourses().get(1).getListOfCourseStudents().add(listOfStudents.get(2));
        Course.getListOfCourses().get(1).getListOfCourseStudents().add(listOfStudents.get(3));
        Course.getListOfCourses().get(2).getListOfCourseStudents().add(listOfStudents.get(4));
        Course.getListOfCourses().get(2).getListOfCourseStudents().add(listOfStudents.get(5));
        Course.getListOfCourses().get(2).getListOfCourseStudents().add(listOfStudents.get(6));
        Course.getListOfCourses().get(3).getListOfCourseStudents().add(listOfStudents.get(7));
        Course.getListOfCourses().get(3).getListOfCourseStudents().add(listOfStudents.get(8));
        Course.getListOfCourses().get(3).getListOfCourseStudents().add(listOfStudents.get(9));
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getTuitionFees() {
        return tuitionFees;
    }

    public void setTuitionFees(int tuitionFees) {
        this.tuitionFees = tuitionFees;
    }

    public static ArrayList<Student> getListOfStudents() {
        return listOfStudents;
    }

    public ArrayList<Assignment> getListOfAssignments() {
        return listOfStudentAssignments;
    }

    public String getUni() {
        return uni;
    }

    public void setUni(String uni) {
        this.uni = uni;
    }
    

    public Student(String firstName, String lastName, LocalDate dateOfBirth, int tuitionFees, String uni) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.uni = uni;
        this.tuitionFees = tuitionFees;
    }

    @Override
    public String toString() {
        return " Student : " + " First Name : " + firstName + " Last Name : " + lastName + " Date Of Birth : " + dateOfBirth + " Tuition Fees : " + tuitionFees + " " + uni + "\n";
    }

    public static void assignmentsPerStudent() {
        System.out.println(" - Choose which assignment you want to see per Student : ");
        for (int i = 0; i < listOfStudents.size(); i++) {
            System.out.println( "#" + (i+1)+ " " + listOfStudents.get(i).getFirstName() + " " + listOfStudents.get(i).getLastName() + " " + listOfStudents.get(i).getTuitionFees() + " " + listOfStudents.get(i).getDateOfBirth());
        }
        int choice = Integer.parseInt(sc.nextLine());

        for (int j = 0; j < listOfStudents.size(); j++) {
            if (choice == j+1) {
                System.out.println(listOfStudents.get(j).listOfStudentAssignments);

            }

        }

    }
}
