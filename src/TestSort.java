public class TestSort {
    public static void main(String[] args) {
        
        Student[] students = {
            new Student(102, "Mia", 3.4),
            new Student(100, "Katlego", 3.9),
            new Student(101, "Aneesah", 2.8)
        };

        System.out.println("Before Sorting:");
        for (Student s : students) {
            System.out.println(s.getStudentID() + " - " + s.getName());
        }

        // Sort students by ID
        Sorter.selectionSort(students);

        System.out.println("\nAfter Sorting by Student ID:");
        for (Student s : students) {
            System.out.println(s.getStudentID() + " - " + s.getName());
        }
    }
 // Resetting the array to its original state for insertion sort
        students = new Student[] {
            new Student(102, "Mia", 3.4),
            new Student(100, "Katlego", 3.9),
            new Student(101, "Aneesah", 2.8)
        };

        // Sort students by GPA using insertionSort method
        Sorter.insertionSort(students, students.length);

        // Display students after sorting by GPA using insertionSort
        System.out.println("\nAfter Sorting by GPA (Insertion Sort):");
        for (Student s : students) {
            System.out.println(s.getStudentID() + " - " + s.getName() + " - " + s.getGpa());
        }
    }
