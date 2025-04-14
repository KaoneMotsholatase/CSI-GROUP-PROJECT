import java.util.ArrayList;

public class Student {
    private String studentID;
    private String name;
    private double gpa;
    private ArrayList<Course> courses;

    public Student(String studentID, String name) {
        this.studentID = studentID;
        this.name = name;
        this.gpa = 0.0;
        this.courses = new ArrayList<>();
    }

    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public double getGPA() {
        return gpa;
    }

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

        if (gpa < 0.0 || gpa > 4.0) {
            throw new InvalidGPAException("GPA must be between 0.0 and 4.0!");
        }
    }

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

    // display method
    public void display() {
        System.out.println(toString());
        System.out.println("Course Details:");
        for (Course c : courses) {
            System.out.println(" - " + c.toString());
        }
    }
}
