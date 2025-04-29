import java.util.ArrayList;
import java.util.List;

public class PerformanceTest {
    public static void main(String[] args) {
        // small array
        Student[] smallArray = generateStudents(20);

        // large array
        Student[] largeArray = generateStudents(2000);

        // measure insertion sort for small array
        long startTime = System.nanoTime();
        Sorter.insertionSort(smallArray);
        long endTime = System.nanoTime();
        System.out.println("Insertion Sort (20 students): " + (endTime - startTime) + " ns");

        // measure insertion sort for the large array
        startTime = System.nanoTime();
        Sorter.insertionSort(largeArray);
        endTime = System.nanoTime();
        System.out.println("Insertion Sort (2000 students): " + (endTime - startTime) + " ns");

        // measure the binary search for the small array
        startTime = System.nanoTime();
        SearchUtils.binarySearchByID(smallArray, 5);
        endTime = System.nanoTime();
        System.out.println("Binary Search (20 students): " + (endTime - startTime) + " ns");

        // measure binary search for the large array
        startTime = System.nanoTime();
        SearchUtils.binarySearchByID(largeArray, 500);
        endTime = System.nanoTime();
        System.out.println("Binary Search (2000 students): " + (endTime - startTime) + " ns");
    }

    // method to create dummy students.
    public static Student[] generateStudents(int n) {
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            students[i] = new Student(i, "Student" + i);
        }
        return students;
    }
}
