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
}
