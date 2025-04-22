import java.util.*;
public class App
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        //////////////////////
        String courseName="";
        String courseCode="";
        int creditHours=0;
        double finalGrade=0.0;
        //////////////////////
        String studentName="";
        int studentId=0;
        double studentGPA=0;
        /////////////////////
        int option;

        do{
            
            System.out.println("======================Choose your options============================");
            System.out.println("1.Course code");
            System.out.println("2.Course name");
            System.out.println("3.Credit hours");
            System.out.println("4.Final grade");
            System.out.println("5.Display All");
            System.out.println("6.Enter student details");
            System.out.println("0. Exit");
            option = in.nextInt();
            in.nextLine();

            
            switch (option) {

                //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                case 1:
                    
                System.out.println("Enter course code");
                courseCode = in.nextLine();
                System.out.println("you entered "+courseCode);

                break;
                
                //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                case 2:
                
                System.out.println("Enter course name");
                courseName = in.nextLine();
                
                System.out.println("you entered "+courseName);
                    
                 break;

                 //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                case 3:

                System.out.println("Enter credit hours");
                creditHours = in.nextInt();
                System.out.println("you entered "+creditHours);

                break;
                //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                case 4:
                System.out.println("Enter final grade");
                 finalGrade = in.nextDouble(); 
                 System.out.println("you entered "+finalGrade);

                 break;
                 /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                case 5:
                try {
                    Course course = new Course(courseCode, courseName, creditHours, finalGrade);
                    System.out.println(">=======================================================<");
                    System.out.println(course.toString());
                    Student student = new Student(studentId,studentName,studentGPA);
                    System.out.println(student.toString());
                    System.out.println(">=======================================================<");
                    } 
                catch (InvalidGradeException e) 
                {
                    System.err.println("Error: " + e.getMessage());
                }
                /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                case 6:
                int detailAns;
                do{
                    System.out.println("==============Enter Student details===============");
                    System.out.println("1.Student id");
                    System.out.println("2. student name");
                    System.out.println("3. student gpa");
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
                    if(detailAns==-1)
                    {
                         System.out.println("Student Details entered==> "+ studentId +"  "+ studentName + "  " + studentGPA);
                        }
                  }
                  while(detailAns!=-1);
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
