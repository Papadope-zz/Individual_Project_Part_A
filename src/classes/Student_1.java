package classes;

import java.util.ArrayList;


public class Student_1 {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private double tuititionFees;
    private ArrayList<Assignment_1> assignmentsOfStudent;
    private ArrayList<Course_1> coursesOfStudent;

    public Student_1(String firstName, String lastName, String dateOfBirth, double tuititionFees) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.tuititionFees = tuititionFees;
    }
    

    public Student_1(String firstName, String lastName, String dateOfBirth, double tuititionFees, ArrayList<Assignment_1> assignmentsOfStudent_1,ArrayList<Course_1> coursesOfStudent) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.tuititionFees = tuititionFees;
        this.assignmentsOfStudent = assignmentsOfStudent_1;
        this.coursesOfStudent = coursesOfStudent;
    }

    public ArrayList<Assignment_1> getAssignmentsOfStudent() {
        return assignmentsOfStudent;
    }

    public void setAssignmentsOfStudent(ArrayList<Assignment_1> assignmentsOfStudent) {
        this.assignmentsOfStudent = assignmentsOfStudent;
    }

    public ArrayList<Course_1> getCoursesOfStudent() {
        return coursesOfStudent;
    }

    public void setCoursesOfStudent(ArrayList<Course_1> coursesOfStudent) {
        this.coursesOfStudent = coursesOfStudent;
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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getTuititionFees() {
        return tuititionFees;
    }

    public void setTuititionFees(double tuititionFees) {
        this.tuititionFees = tuititionFees;
    }

    

    

    @Override
    public String toString() {
        return  firstName +" "+ lastName+" " + " "+ dateOfBirth + " "+ tuititionFees ;
    }
    
    
    
   

    
    
    
}
