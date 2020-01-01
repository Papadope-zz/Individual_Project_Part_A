/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;

/**
 *
 * @author xrist
 */
public class Trainer {

    private String firstName;
    private String lastName;
    private String subject;
    private static ArrayList<Trainer> listOfTrainers = new ArrayList();

    public static void addTrainerToList() {

        listOfTrainers.add(new Trainer("Dimitris", "Mauromixaloglou", "Java"));
        listOfTrainers.add(new Trainer("Giorgos", "Papadopoulos", "Java"));
        listOfTrainers.add(new Trainer("Baggelis", "Barnas", "C#"));
        listOfTrainers.add(new Trainer("Mixalis", "Papazoglou", "C#"));

        Course.getListOfCourses().get(0).getListOfCourseTrainers().add(listOfTrainers.get(0));
        Course.getListOfCourses().get(1).getListOfCourseTrainers().add(listOfTrainers.get(1));
        Course.getListOfCourses().get(2).getListOfCourseTrainers().add(listOfTrainers.get(2));
        Course.getListOfCourses().get(3).getListOfCourseTrainers().add(listOfTrainers.get(3));

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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public static ArrayList<Trainer> getListOfTrainers() {
        return listOfTrainers;
    }

    public Trainer(String firstName, String lastName, String subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Trainer :" + " First Name : " + firstName + " Last Name : " + lastName + " Subject : " + subject + "\n";
    }

}
