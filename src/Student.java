import java.util.ArrayList;

public class Student{
    private String studentID;
    private String name;
    private double gpa;
    private ArrayList<Course> courses;

    public Student(String studentID,String name){
        this.studentID = studentID;
        this.name = name;
        this.gpa = 0.0;
        this.courses = new ArrayList<>();
    }

    public String getStudentID(){
        return studentID;
    }

    public String getName(){
        return name;
    }

    public void calculateGPA(){
        double totalPoints = 0.0;
        int totalCredits = 0;
        for(Course c:courses){
            totalPoints += c.getFinalGrade() * c.getCreditHours();
            totalCredits += c.getCreditHours();
        }
        if(totalCredits > 0){
            this.gpa = totalPoints / totalCredits;
        } else {
            this.gpa = 0.0;
        }
    }

    public void addCourse(Course course){
        courses.add(course);
    }

}