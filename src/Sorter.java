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
}
