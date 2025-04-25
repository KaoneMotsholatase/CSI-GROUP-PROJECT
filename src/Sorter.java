import java.util.List;

public class Sorter{
  //sort based on Student ID
    public static void selectionSort(Student[] arr) {
         for (int i = 0; i < arr.length - 1; i++) {
             int minIndex = i;
             for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].getStudentID() < arr[minIndex].getStudentID()) {
              minIndex = j;
                }
            }
            
            Student temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
         }     
   } 
  
  //sort based on GPA
  public static void insertionSort(Student[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Student key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].getGPA() > key.getGPA()) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
