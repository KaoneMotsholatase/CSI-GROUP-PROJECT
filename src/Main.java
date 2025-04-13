public class Main {
    public static void main(String[] args) {
        try {
            // Test with valid grade
            Course course = new Course("CSI142", "OOP Basics", 3, 85.5);
            System.out.println(course.toString());

        } catch (InvalidGradeException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}