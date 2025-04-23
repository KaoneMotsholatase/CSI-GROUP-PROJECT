import java.util.ArrayList;
import java.util.List;

public class Student {
    private int studentID;
    private String name;
    private double gpa;
    private List<Course> courses;

    public Student(int studentID, String name,double gpa) {
        this.studentID = studentID;
        this.name = name;
        this.gpa = gpa;
        this.courses = new ArrayList<>();
    }

    public int getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public double getGPA() {
        return gpa;
    }

    //method to calculate the GPA
    public void calculateGPA() throws InvalidGPAException {
        double totalPoints = 0.0;
        int totalCredits = 0;

        for (Course c : courses) {
            totalPoints += c.getFinalGrade() * c.getCreditHours();
            totalCredits += c.getCreditHours();
        }

        if (totalCredits > 0) {
            this.gpa = totalPoints / totalCredits;
        } else {
            this.gpa = 0.0;
        }

        if (gpa < 0.0 || gpa > 5.0) {
            throw new InvalidGPAException("GPA must be between 0.0 and 5.0!");
        }
    }

    //method to add a Course
    public void addCourse(Course course) {
        courses.add(course);
    }

    // toString method
    @Override
    public String toString() {
        return "Student ID: " + studentID + "\n"
             + "Name: " + name + "\n"
             + "GPA: " + String.format("%.2f", gpa) + "\n"
             + "Courses Enrolled: " + courses.size();
    }

    // display method to diplay all info for Students and courses they do
    public void display() {
        System.out.println(toString());
        System.out.println("Course Details:");
        for (Course c : courses) {
            System.out.println(" - " + c.toString());
        }
    }

}
