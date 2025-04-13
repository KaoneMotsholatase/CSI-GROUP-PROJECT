public class Course {
    private String courseCode;
    private String courseName;
    private int creditHours;
    private double finalGrade;

    // Constructor with validation
    public Course(String courseCode, String courseName, int creditHours, double finalGrade)
            throws InvalidGradeException {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.creditHours = creditHours;
        setFinalGrade(finalGrade);
    }

    // Setter with exception
    public void setFinalGrade(double finalGrade) throws InvalidGradeException {
        if (finalGrade < 0 || finalGrade > 100) {
            throw new InvalidGradeException("Grade must be between 0 and 100");
        }
        this.finalGrade = finalGrade;
    }

    // Getters
    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public double getFinalGrade() {
        return finalGrade;
    }

    // toString() for display
    @Override
    public String toString() {
        return String.format(
                "Course[Code: %s, Name: %s, Credits: %d, Grade: %.2f]",
                courseCode, courseName, creditHours, finalGrade);
    }
}