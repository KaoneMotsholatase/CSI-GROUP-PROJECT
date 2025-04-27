import java.util.*;
import java.util.Arrays;

public class App
{
    public static void main(String[] args)
    {
        /////////////////////////////////////////////////////////////
        Scanner in = new Scanner(System.in);
        ArrayList<Course> courses = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
       //////////////////////////////////////////////
        String courseName="";
        String courseCode="";
        int creditHours=0;
        double finalGrade=0.0;
        /////////////////////////////////
        String studentName="";
        int studentId=0;
        double studentGPA=0;
        /////////////////////
        int option;

        do{
            
            System.out.println("======================Choose your options============================");
            
            System.out.println("1) Course Details");
            System.out.println("2) Student Details");
            System.out.println("3) Display All");
            System.out.println("4) Sort Students");
            System.out.println("5) Search 4 student");
            
            System.out.println("0. Exit");
            option = in.nextInt();
            in.nextLine();

            
            switch (option) {

                //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                case 1:
                
                int courseOptions;
                do{

                    System.out.println("==============Enter Course details===============");

                    System.out.println("1.Course code");
                    System.out.println("2.Course name");
                    System.out.println("3.Credit hours");
                    System.out.println("4.Final grade");
                    System.out.println("5.Add Enteres Details");
                    System.out.println("-1. Exit");

                    courseOptions = in.nextInt();
                try{
                    if(courseOptions==1)
                    {
                     System.out.println("Enter course code");
                     courseCode = in.next();
                     System.out.println("you entered "+courseCode);
                    }

                    if(courseOptions==2)
                    {
                      System.out.println("Enter course name");
                      courseName = in.next();
                      System.out.println("you entered "+courseName);
                    }
                    
                    if(courseOptions==3)
                    {
                        System.out.println("Enter credit hours");
                        creditHours = in.nextInt();
                        System.out.println("you entered "+creditHours);
                    }

                    
                    if(courseOptions==4)
                    {
                        System.out.println("Enter final grade");
                        finalGrade = in.nextDouble(); 
                        System.out.println("you entered "+finalGrade); 
                    }
                    
                    if(courseOptions==5)
                    {
                        System.out.println("Course details Details entered==> "+ courseCode +"  "+ courseName + "  " + creditHours + " " + finalGrade ); 
                        Course course = new Course(courseCode,courseName,creditHours,finalGrade);
                        courses.add(new Course(courseCode,courseName,creditHours,finalGrade));
                    }
                   }
                    catch(InvalidGradeException e){ System.err.println("Error: " + e.getMessage());}

                    if(courseOptions==-1)
                    {
                         System.out.println("<<<<<<<<--------Course Details Added to System------------>>>>>>>");
                        }

                  }
                     while(courseOptions!=-1);

                     break;                
                
                 /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                case 3:

                    System.out.println(">=======================================================<");

                    int count=0;
                    for(Student student:students)
                    {
                       student.display();
                        System.out.println("/=======================================================\\");
                    }

                    System.out.println(">=======================================================<");
                     
                /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                case 2:
                int detailAns;
                do{
                    System.out.println("==============Enter Student details===============");
                    System.out.println("1.Student id");
                    System.out.println("2. student name");
                    System.out.println("3. student gpa");
                    System.out.println("4. Add Student");
                    System.out.println("-1. Exit");
                    detailAns = in.nextInt();

                    if(detailAns==1)
                    {
                        System.out.println("Enter Student Id");
                        studentId = in.nextInt();
                        System.out.println("You entered: " + studentId);
                    }

                    if(detailAns==2)
                    {
                        System.out.println("Enter Student Name");
                        studentName = in.next();
                        System.out.println("You entered: " + studentName);
                    }
                    if(detailAns==3)
                    {
                        System.out.println("Enter Student GPA");
                        studentGPA = in.nextDouble();
                        System.out.println("You entered: " + studentGPA);
                    }

                    if(detailAns==4)
                    {
                        System.out.println("Student Details entered==> "+ studentId +"  "+ studentName + "  " + studentGPA); 
                        Student student = new Student(studentId,studentName,studentGPA);
                        students.add(new Student(studentId, studentName, studentGPA));
                    }

                    if(detailAns==-1)
                    {
                         System.out.println("<<<<<<<<--Students Added to System-->>>>>>>");
                        }
                  }
                  while(detailAns!=-1);                  
                  break;

                  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
                  case 4:
                  int sortOption;
                  do{

                    System.out.println("==============Choose how to Sort===============");

                    System.out.println("current list: ");
                    for(Student x : students)
                    {
                    System.out.println(x.getStudentID() + " - " + x.getName());
                    }

                    System.out.println("1.Sort by Student Id(Selection Sort)");
                    System.out.println("2.Sort by GPA(insertion Sort)");
                    //System.out.println("3.Display Sorted list");
                    System.out.println("-1.Exit");
                    
                    sortOption=in.nextInt();

                    Student[] studentsArray = students.toArray(new Student[0]);

                   if(sortOption==1)
                   { 
                    System.out.println("Sorting........Sorting.............Done!!!");
                    Sorter.selectionSort(students.toArray(new Student[0]));

                    students = new ArrayList<>(Arrays.asList(studentsArray));

                    System.out.println("\n======Done Sorting by Student ID======");
                   }
                    
                    if(sortOption==2)
                    {
                    System.out.println("Sorting........Sorting.............Done!!!");

                    Sorter.insertionSort(students.toArray(new Student[0]));
                    students = new ArrayList<>(Arrays.asList(studentsArray));

                    System.out.println("\n======Done Sorting by GPA======");
                    }

                    /* 
                    if(sortOption==3)
                    {
                        for (Student s : students) 
                        {
                        System.out.println(s.getStudentID() + " - " + s.getName());
                        }
                    }
                        */
                    System.out.println("<================Sorted Details Added to System============>");
                    }
                    while(sortOption!=-1);
                  break;
                  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
                  
                  case 5:
                  System.out.println("Choose Search option");
                  int searchOption;
                  do
                  {
                    System.out.println("1. Search by name");
                    System.out.println("2. search by Student Id");
                    System.out.println("-1. Exits");
                    searchOption=in.nextInt();

                    if(searchOption==1)
                    {
                        String searchTarget;
                        System.out.println("Enter name to be checked");
                        searchTarget = in.next();

                        System.out.println("searching........searching.............Done!!!");

                        Student resultByName = SearchUtils.linearSearchByName(students.toArray(new Student[0]), searchTarget);

                        if (resultByName != null) 
                        {
                        System.out.println("Student name of " + resultByName.getName() + " is present in the system");
                        } 
                        else 
                        {
                         System.out.println("Student named "+ searchTarget + "was not found in the System.");
                        }

                    }
                    if(searchOption==2)
                    {
                        int searchTarget2;
                        System.out.println("Enter ID to be found");
                        searchTarget2 = in.nextInt();

                        System.out.println("searching........searching.............Done!!!");

                        Student resultByName = SearchUtils.binarySearchByID(students.toArray(new Student[0]), searchTarget2);

                        if (resultByName != null) 
                        {
                        System.out.println("Id present in system: " + resultByName.getName());
                        } 
                        else 
                        {
                         System.out.println("The Id entred "+ searchTarget2 + " was not found in system.");
                        }
                    }


                  }
                  while(searchOption != -1);

                  break;
                  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                case 0:
                System.out.println("Extiting......... ");
                    break;
                    
                //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                default: System.out.println("Invalide input !!!!");
                    break;
            }

       
        }
        while(option!=0);
       
        in.close();
    }
}
