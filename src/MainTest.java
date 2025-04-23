import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class MainTest {
    public static void main(String[] args) {
        // Creating a list of students
        List<Student> studentsList = new ArrayList<>();

        Student s1 = new Student(1001, "Lone", 0);
        s1.addCourse(new Course("OOP", "CSI142", 3, 89.5));
        s1.addCourse(new Course("Math", "MAT111", 3, 76.0));

        Student s2 = new Student(1002, "Aminah", 0);
        s2.addCourse(new Course("Networks", "NET202", 4, 84.0));
        s2.addCourse(new Course("Databases", "DB203", 3, 91.0));

        Student s3 = new Student(1003, "Bonang", 0);
        s3.addCourse(new Course("Programming", "CSI41", 3, 70.0));
        s3.addCourse(new Course("Systems", "SYS104", 3, 65.5));

        Student s4 = new Student(1004, "Thobo", 0);
        s4.addCourse(new Course("Web Dev", "WEB203", 3, 88.0));
        s4.addCourse(new Course("AI", "AI302", 3, 92.0));

        studentsList.add(s1);
        studentsList.add(s2);
        studentsList.add(s3);
        studentsList.add(s4);

        // Calculating GPA for each student
        for (Student student : studentsList) {
            try {
                student.calculateGPA();
            } catch (InvalidGPAException e) {
                System.err.println("Error calculating GPA: " + e.getMessage());
            }
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
        System.out.println("\nLinear Search for 'Amina':");
        Student foundByName = SearchUtils.linearSearchByName(studentsArray, "Amina");
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
