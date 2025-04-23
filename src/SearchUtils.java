public class SearchUtils {

    // Linear Search for Student by name 
    public static Student linearSearchByName(Student[] arr, String targetName) {
        for (Student student : arr) {
            if (student.getName().equalsIgnoreCase(targetName)) {
                return student;
            }
        }
        return null; //if not found
    }

    // Binary Search for Student by student ID
    public static Student binarySearchByID(Student[] arr, int targetID) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid].getStudentID() == targetID) {
                return arr[mid];
            } else if (arr[mid].getStudentID() < targetID) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null; // if not found
    }
}
