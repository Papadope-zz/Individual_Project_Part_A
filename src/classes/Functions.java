package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Functions {

    public static ArrayList<Student_1> listOfAllStudent_1 = new ArrayList<>();
    public static ArrayList<Trainer_1> listOfAllTrainer_1 = new ArrayList<>();
    public static ArrayList<Course_1> listOfAllCourse_1 = new ArrayList<>();
    public static ArrayList<Assignment_1> listOfAllAssignment_1 = new ArrayList<>();

    public static void insertCourses() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert course title: ");
        String tempName = sc.nextLine();
        System.out.println("Insert course stream: ");
        String tempLastName = sc.nextLine();
        System.out.println("Insert course type: ");
        String tempSubject = sc.nextLine();
        System.out.println("Insert course start date: ");
        String tempStartDate = sc.nextLine();
        System.out.println("Insert course end date: ");
        String tempEndDate = sc.nextLine();
        ArrayList<Student_1> student = new ArrayList<>();
        ArrayList<Assignment_1> assignment = new ArrayList<>();
        ArrayList<Trainer_1> trainer = new ArrayList<>();

        Course_1 c = new Course_1(tempName, tempLastName, tempSubject, tempStartDate, tempEndDate, student, assignment, trainer);
        listOfAllCourse_1.add(c);

        System.out.println("Press 1 to input another Course\n"
                + "Press anything else to return to main menu");

    }

    public static void insertTrainers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert trainer's first name: ");
        String tempName = sc.nextLine();
        System.out.println("Insert trainer's last name: ");
        String tempLastName = sc.nextLine();
        System.out.println("Insert trainer's subject: ");
        String tempSubject = sc.nextLine();

        Trainer_1 t = new Trainer_1(tempName, tempLastName, tempSubject);
        listOfAllTrainer_1.add(t);

        System.out.println("Press 1 to input another Trainer\n"
                + "Press anything else to return to main Menu");

    }

    public static void insertStudents() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert student first name: ");

        String tempName = sc.nextLine();
        System.out.println("Insert student last name: ");
        String tempLastName = sc.nextLine();
        System.out.println("Student's date of birth [DD/MM/YYYY]: ");
        String tempBirthday = sc.nextLine();
        System.out.println("Tutituonal fees: ");
        double tempFees = sc.nextDouble();
        ArrayList<Assignment_1> assignment = new ArrayList<>();
        ArrayList<Course_1> course = new ArrayList<>();

        Student_1 s = new Student_1(tempName, tempLastName, tempBirthday, tempFees, assignment, course);
        listOfAllStudent_1.add(s);

        System.out.println("Press 1 to input another Student\n"
                + "Press anything else to return to main Menu");

    }

    public static void insertAssignments() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert assignment title: ");
        String tempTitle = sc.nextLine();
        System.out.println("Insert assignment description: ");
        String tempDescription = sc.nextLine();
        System.out.println("Insert assignment subdatetime: ");
        String tempSubDateTime = sc.nextLine();
        System.out.println("Insert assignment oral mark: ");
        Double tempOralMark = sc.nextDouble();
        System.out.println("Insert assignment total mark: ");
        Double tempTotalMark = sc.nextDouble();

        Assignment_1 as = new Assignment_1(tempTitle, tempDescription, tempSubDateTime, tempOralMark, tempTotalMark);
        listOfAllAssignment_1.add(as);

        System.out.println("Press 1 to input another Assignment\n"
                + "Press anything else to return to main Menu");

    }

    public static void printCourses() {
        if (listOfAllCourse_1.isEmpty()) {
            System.out.println("No Courses to work with");
        }
        for (Course_1 x : listOfAllCourse_1) {
            System.out.println(x.getTitle() + " " + x.getStream() + " " + x.getType() + " " + x.getStartDate() + " " + x.getEndDate());
        }
    }

    public static void printTrainers() {
        if (listOfAllTrainer_1.isEmpty()) {
            System.out.println("No Trainers to work with");
        }
        for (Trainer_1 x : listOfAllTrainer_1) {
            System.out.println(x.toString());
        }
    }

    public static void printStudents() {
        
        if (listOfAllCourse_1.isEmpty()) {
            System.out.println("No Students to work with");}
        for (Student_1 x : listOfAllStudent_1) {
            System.out.println(x.toString());
        }

    }

    public static void printAssignments() {
        
        if (listOfAllCourse_1.isEmpty()) {
            System.out.println("No Assignments to work with");}
        for (Assignment_1 x : listOfAllAssignment_1) {
            System.out.println(x.toString());
        }
    }

    public static void addStudentToCourse() {

        Scanner sc = new Scanner(System.in);
        boolean boolean1 = true;
        if (listOfAllStudent_1.isEmpty() || listOfAllCourse_1.isEmpty()) {
            System.out.println("There are no data to work with");
            boolean1 = false;
        }

        while (boolean1) {
            for (Course_1 c : listOfAllCourse_1) {

                System.out.println(c.getTitle() + " " + c.getStream() + " " + c.getType() + ":");
                for (Student_1 s : listOfAllStudent_1) {
                    System.out.println(s.getFirstName() + " " + s.getLastName());
                    System.out.println("[1]Yes [0]No");
                    String choice = sc.nextLine();
                    if (choice.equals("1")) {
                        c.getStudentsOfCourse().add(s);
                        s.getCoursesOfStudent().add(c);
                    } else if (choice.equals("0")) {
                        boolean1 = false;
                    } else {
                        System.out.println("Invalid option");
                    }
                }
            }
        }
    }

    public static void addTrainerToCourse() {
        Scanner sc = new Scanner(System.in);
        boolean boolean1 = true;
        if (listOfAllTrainer_1.isEmpty() || listOfAllCourse_1.isEmpty()) {
            System.out.println("There are no data to work with");
            boolean1 = false;
        }
        while (boolean1) {
            for (Course_1 c : listOfAllCourse_1) {

                System.out.println(c.getTitle() + " " + c.getStream() + " " + c.getType() + ":");
                for (Trainer_1 t : listOfAllTrainer_1) {
                    System.out.println(t.getFirstName() + " " + t.getLastName());
                    System.out.println("[1]Yes [0]No");
                    String choice = sc.nextLine();
                    if (choice.equals("1")) {
                        c.getTrainersOfCourse().add(t);
                    } else if (choice.equals("0")) {
                        boolean1 = false;
                    } else {
                        System.out.println("Invalid option");
                    }
                }
            }
        }
    }

    public static void addAssignmentToCourse() {
        Scanner sc = new Scanner(System.in);
        boolean boolean1 = true;
        if (listOfAllAssignment_1.isEmpty() || listOfAllCourse_1.isEmpty()) {
            System.out.println("There are no data to work with");
            boolean1 = false;
        }
        while (boolean1) {
            for (Course_1 c : listOfAllCourse_1) {

                System.out.println(c.getTitle() + " " + c.getStream() + " " + c.getType() + ":");
                for (Assignment_1 as : listOfAllAssignment_1) {
                    System.out.println(as.getTitle() + " " + as.getDescription() + " " + as.getSubDateTime());
                    System.out.println("[1]Yes [0]No");
                    String choice = sc.nextLine();
                    if (choice.equals("1")) {
                        c.getAssignmentsOfCourse().add(as);
                    } else if (choice.equals("0")) {
                        boolean1 = false;
                    } else {
                        System.out.println("Invalid option");
                    }
                }
            }
        }
    }

    public static void addAssignmentToStudent() {
        Scanner sc = new Scanner(System.in);
        boolean boolean1 = true;
        if (listOfAllAssignment_1.isEmpty() || listOfAllStudent_1.isEmpty()) {
            System.out.println("There are no data to work with");
            boolean1 = false;
        }
        while (boolean1) {
            for (Student_1 s : listOfAllStudent_1) {

                System.out.println(s.getFirstName() + " " + s.getLastName() + ":");
                for (Assignment_1 as : listOfAllAssignment_1) {
                    System.out.println(as.getTitle() + " " + as.getDescription() + " " + as.getSubDateTime());
                    System.out.println("[1]Yes [0]No");
                    String choice = sc.nextLine();
                    if (choice.equals("1")) {
                        s.getAssignmentsOfStudent().add(as);
                    } else if (choice.equals("0")) {
                        boolean1 = false;
                    } else {
                        System.out.println("Invalid option");
                    }
                }
            }
        }
    }

    public static void printStudentsPerCourse() {
        for (Course_1 c : listOfAllCourse_1) {
            System.out.println("");
            System.out.println(c.getTitle() + " " + c.getStream() + " " + c.getType() + "\n" + "----------");

            for (Student_1 s : c.getStudentsOfCourse()) {
                System.out.println("[" + s.getFirstName() + " " + s.getLastName() + "]");

            }

        }
    }

    public static void printTrainersPerCourse() {
        for (Course_1 c : listOfAllCourse_1) {
            System.out.println("");
            System.out.println(c.getTitle() + " " + c.getStream() + " " + c.getType() + "\n" + "----------");

            for (Trainer_1 t : c.getTrainersOfCourse()) {
                System.out.println("[" + t.getFirstName() + " " + t.getLastName() + "]");

            }

        }
    }

    public static void printAssignmentsPerCourse() {
        for (Course_1 c : listOfAllCourse_1) {
            System.out.println("");
            System.out.println(c.getTitle() + " " + c.getStream() + " " + c.getType() + "\n" + "----------");

            for (Assignment_1 a : c.getAssignmentsOfCourse()) {
                System.out.println("[" + a.getTitle() + " " + a.getDescription() + "]");

            }

        }
    }

    public static void printAssignmentPerStudent() {
        for (Student_1 s : listOfAllStudent_1) {
            System.out.println("");
            System.out.println(s.getFirstName() + " " + s.getLastName() + "\n" + "----------");

            for (Assignment_1 a : s.getAssignmentsOfStudent()) {
                System.out.println("[" + a.getTitle() + " " + a.getDescription() + "]");

            }

        }
    }
    
    public static void studentsWithMoreAssignments(){

    for (Student_1 s: listOfAllStudent_1){
    if (s.getCoursesOfStudent().size() > 1){
        System.out.println(s.getFirstName()+" "+s.getLastName());
    
    }
           
    
    }
    
    
    
    
    
    }

}
