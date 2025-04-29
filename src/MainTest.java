import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class MainTest {
    public static void main(String[] args) {
        // Creating a list of students
        List<Student> studentsList = new ArrayList<>();

        try{

        Student s1 = new Student(1001, "Lone");
        s1.addCourse(new Course("OOP", "CSI142", 3, 89.5));
        s1.addCourse(new Course("Math", "MAT111", 3, 76.0));

        Student s2 = new Student(1002, "Aminah");
        s2.addCourse(new Course("Networks", "NET202", 4, 84.0));
        s2.addCourse(new Course("Databases", "DB203", 3, 91.0));

        Student s3 = new Student(1003, "Bonang");
        s3.addCourse(new Course("Programming", "CSI41", 3, 70.0));
        s3.addCourse(new Course("Systems", "SYS104", 3, 65.5));

        Student s4 = new Student(1004, "Thobo");
        s4.addCourse(new Course("Web Dev", "WEB203", 3, 88.0));
        s4.addCourse(new Course("AI", "AI302", 3, 92.0));

        studentsList.add(s1);
        studentsList.add(s2);
        studentsList.add(s3);
        studentsList.add(s4);

        }catch(InvalidGradeException e) {
            System.err.println(e.getMessage());
        }

        // Converting list to array for sorting/searching
        Student[] studentsArray = studentsList.toArray(new Student[0]);

        // Demonstrating Insertion Sort by GPA
        System.out.println("\nBefore Insertion Sort (by GPA):");
        for (Student s : studentsArray) {
            s.display();
            System.out.println();
        }

        Sorter.insertionSort(studentsArray);

        System.out.println("\nAfter Insertion Sort (by GPA):");
        for (Student s : studentsArray) {
            s.display();
            System.out.println();
        }

        // Demonstrating Selection Sort by Student ID
        System.out.println("\nBefore Selection Sort (by Student ID):");
        for (Student s : studentsArray) {
            System.out.println(s);
        }

        Sorter.selectionSort(studentsArray);

        System.out.println("\nAfter Selection Sort (by Student ID):");
        for (Student s : studentsArray) {
            System.out.println(s);
        }

        // Demonstrating Linear Search by name
        System.out.println("\nLinear Search for 'Aminah':");
        Student foundByName = SearchUtils.linearSearchByName(studentsArray, "Aminah");
        if (foundByName != null) {
            foundByName.display();
        } else {
            System.out.println("Student not found.");
        }

        // Demonstrating Binary Search by ID
        System.out.println("\nBinary Search for ID 1003:");
        Student foundByID = SearchUtils.binarySearchByID(studentsArray, 1003);
        if (foundByID != null) {
            foundByID.display();
        } else {
            System.out.println("Student not found.");
        }
    }
}
