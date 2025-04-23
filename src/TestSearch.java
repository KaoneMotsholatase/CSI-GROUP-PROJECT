 public class TestSearch {
    public static void main(String[] args) {
        // test students
        Student[] students = new Student[3];
        students[0] = new Student(103, "Mia", 4.0);
        students[1] = new Student(101, "Katlego", 3.8);
        students[2] = new Student(102, "Aneesah", 4.2);

        // Sort by student ID 
        Sorter.selectionSort(students);

        // Binary search by ID
        Student resultByID = SearchUtils.binarySearchByID(students, 102);
        if (resultByID != null) {
            System.out.println("Found by ID: " + resultByID.getName());
        } else {
            System.out.println("Student with ID 102 not found.");
        }

        // Linear Search by Name
        Student resultByName = SearchUtils.linearSearchByName(students, "Mia");
        if (resultByName != null) {
            System.out.println("Found by Name: " + resultByName.getName());
        } else {
            System.out.println("Student named Mia not found.");
        }
    }
}
