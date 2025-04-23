public class TestSort {
    public static void main(String[] args) {
        
        Student[] students = {
            new Student(102, "Mia", 3.4),
            new Student(100, "Katlego", 3.9),
            new Student(101, "Aneesah", 2.8)
        };

        System.out.println("Before Sorting by Student ID:");
        for (Student s : students) {
            System.out.println(s.getStudentID() + " - " + s.getName());
        }

        // Sorting students by ID using selectionSort
        Sorter.selectionSort(students);

        
        System.out.println("\nAfter Sorting by Student ID:");
        for (Student s : students) {
            System.out.println(s.getStudentID() + " - " + s.getName());
        }

        // Resetting the array to its original state for GPA sorting
        students = new Student[] {
            new Student(102, "Mia", 3.4),
            new Student(100, "Katlego", 3.9),
            new Student(101, "Aneesah", 2.8)
        };

        // Sorting students by GPA using insertionSort
        Sorter.insertionSort(students);

        System.out.println("\nAfter Sorting by GPA (Insertion Sort):");
        for (Student s : students) {
            System.out.println(s.getStudentID() + " - " + s.getName() + " - GPA: " + s.getGPA());
        }
    }
}
