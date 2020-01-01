package classes;

import java.util.ArrayList;


public class Course_1 {
    private String title;
    private String stream;
    private String type;
    private String startDate;
    private String endDate;
    private ArrayList<Student_1> studentsOfCourse_1;
    private ArrayList<Assignment_1> assignmentsOfCourse_1;
    private ArrayList<Trainer_1> trainersOfCourse_1;

    public Course_1(String title, String stream, String type, String startDate, String endDate) {
        this.title = title;
        this.stream = stream;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
    

    public Course_1(String title, String stream, String type, String startDate, String endDate, ArrayList<Student_1> studentsOfCourse_1, ArrayList<Assignment_1> assignmentsOfCourse_1, ArrayList<Trainer_1> trainersOfCourse_1) {
        this.title = title;
        this.stream = stream;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
        this.studentsOfCourse_1 = studentsOfCourse_1;
        this.assignmentsOfCourse_1 = assignmentsOfCourse_1;
        this.trainersOfCourse_1 = trainersOfCourse_1;
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

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public ArrayList<Student_1> getStudentsOfCourse() {
        return studentsOfCourse_1;
    }

    public void setStudentsOfCourse_1(ArrayList<Student_1> studentsOfCourse_1) {
        this.studentsOfCourse_1 = studentsOfCourse_1;
    }

    public ArrayList<Assignment_1> getAssignmentsOfCourse() {
        return assignmentsOfCourse_1;
    }

    public void setAssignmentsOfCourse_1(ArrayList<Assignment_1> assignmentsOfCourse_1) {
        this.assignmentsOfCourse_1 = assignmentsOfCourse_1;
    }

    public ArrayList<Trainer_1> getTrainersOfCourse() {
        return trainersOfCourse_1;
    }

    public void setTrainersOfCourse_1(ArrayList<Trainer_1> trainersOfCourse_1) {
        this.trainersOfCourse_1 = trainersOfCourse_1;
    }
    



    
    
    

    
    
   
}
