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
public class Assignment {

    private String title;
    private String description;
    private LocalDate subDateTime;
    private int oralMark;
    private int totalMark;
    private static ArrayList<Assignment> listOfAssignments = new ArrayList();
    

    public static void addAssignmentToList() {

        listOfAssignments.add(new Assignment("Individual Project", "Entertainment", LocalDate.of(1990, 03, 20), 100, 100));
        listOfAssignments.add(new Assignment("Individual Project", "Make Your Own Chess Game", LocalDate.of(1990, 03, 20), 100, 100));
        listOfAssignments.add(new Assignment("Individual Project", "Build Your Own Calculator", LocalDate.of(1990, 03, 20), 100, 100));
        listOfAssignments.add(new Assignment("Individual Project", "Create a To-Do List App", LocalDate.of(1990, 03, 20), 100, 100));
        listOfAssignments.add(new Assignment("Individual Project", "Develop a Weight Conversion Tool", LocalDate.of(1990, 03, 20), 100, 100));
        listOfAssignments.add(new Assignment("Individual Project", "Code a Rock, Paper, Scissors Game", LocalDate.of(1990, 03, 20), 100, 100));
        listOfAssignments.add(new Assignment("Individual Project", "Build Your Own Tic Tac Toe", LocalDate.of(1990, 03, 20), 100, 100));
        listOfAssignments.add(new Assignment("Individual Project", "Web Scraping With Python", LocalDate.of(1990, 03, 20), 100, 100));
        listOfAssignments.add(new Assignment("Individual Project", "Build a Basic HTML5 Website", LocalDate.of(1990, 03, 20), 100, 100));
        listOfAssignments.add(new Assignment("Individual Project", "Code Snake With JavaScript", LocalDate.of(1990, 03, 20), 100, 100));
        Course.getListOfCourses().get(0).getListOfCourseAssignments().add(listOfAssignments.get(0));
        Course.getListOfCourses().get(0).getListOfCourseStudents().get(0).getListOfAssignments().add(listOfAssignments.get(0));
        Course.getListOfCourses().get(0).getListOfCourseAssignments().add(listOfAssignments.get(1));
        Course.getListOfCourses().get(0).getListOfCourseStudents().get(1).getListOfAssignments().add(listOfAssignments.get(1));
        Course.getListOfCourses().get(1).getListOfCourseAssignments().add(listOfAssignments.get(2));
        Course.getListOfCourses().get(1).getListOfCourseStudents().get(0).getListOfAssignments().add(listOfAssignments.get(2));
        Course.getListOfCourses().get(1).getListOfCourseAssignments().add(listOfAssignments.get(3));
        Course.getListOfCourses().get(1).getListOfCourseStudents().get(1).getListOfAssignments().add(listOfAssignments.get(3));
        Course.getListOfCourses().get(2).getListOfCourseAssignments().add(listOfAssignments.get(4));
        Course.getListOfCourses().get(2).getListOfCourseStudents().get(0).getListOfAssignments().add(listOfAssignments.get(4));
        Course.getListOfCourses().get(2).getListOfCourseAssignments().add(listOfAssignments.get(5));
        Course.getListOfCourses().get(2).getListOfCourseStudents().get(1).getListOfAssignments().add(listOfAssignments.get(5));
        Course.getListOfCourses().get(2).getListOfCourseAssignments().add(listOfAssignments.get(6));
        Course.getListOfCourses().get(2).getListOfCourseStudents().get(2).getListOfAssignments().add(listOfAssignments.get(6));
        Course.getListOfCourses().get(3).getListOfCourseAssignments().add(listOfAssignments.get(7));
        Course.getListOfCourses().get(3).getListOfCourseStudents().get(0).getListOfAssignments().add(listOfAssignments.get(7));
        Course.getListOfCourses().get(3).getListOfCourseAssignments().add(listOfAssignments.get(8));
        Course.getListOfCourses().get(3).getListOfCourseStudents().get(1).getListOfAssignments().add(listOfAssignments.get(8));
        Course.getListOfCourses().get(3).getListOfCourseAssignments().add(listOfAssignments.get(9));
        Course.getListOfCourses().get(3).getListOfCourseStudents().get(2).getListOfAssignments().add(listOfAssignments.get(9));
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getSubDateTime() {
        return subDateTime;
    }

    public void setSubDateTime(LocalDate subDateTime) {
        this.subDateTime = subDateTime;
    }

    public int getOralMark() {
        return oralMark;
    }

    public void setOralMark(int oralMark) {
        this.oralMark = oralMark;
    }

    public int getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(int totalMark) {
        this.totalMark = totalMark;
    }

    public static ArrayList<Assignment> getListOfAssignments() {
        return listOfAssignments;
    }
    
    public Assignment(String title, String description, LocalDate subDateTime, int oralMark, int totalMark) {
        this.title = title;
        this.description = description;
        this.subDateTime = subDateTime;
        this.oralMark = oralMark;
        this.totalMark = totalMark;
    }

    @Override
    public String toString() {
        return "Assignment : " + " Title : " + title + " Description : " + description + " When Sub Starts : " + subDateTime + " Oral Mark : " + oralMark + " Total Mark : " + totalMark + "\n";
    }

}
