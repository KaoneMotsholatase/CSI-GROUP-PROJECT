import java.util.Scanner;
public class App
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String courseName="";
        String courseCode="";
        int creditHours=0;
        double finalGrade=0.0;

        int option;

        do{
            
            System.out.println("======================Choose your options============================");
            System.out.println("1.Course code");
            System.out.println("2.Course name");
            System.out.println("3.Credit hours");
            System.out.println("4.Final grade");
            System.out.println("5.Display All");
            System.out.println("0. Exit");
            option = in.nextInt();
            in.nextLine();

            
            switch (option) {
                case 1:
                    
                System.out.println("Enter course code");
                courseCode = in.nextLine();
                System.out.println("you entered "+courseCode);

                break;
                
                case 2:
                
                System.out.println("Enter course name");
                courseName = in.nextLine();
                
                System.out.println("you entered "+courseName);
                    
                 break;

                case 3:

                System.out.println("Enter credit hours");
                creditHours = in.nextInt();
                System.out.println("you entered "+creditHours);

                break;

                case 4:

                System.out.println("Enter final grade");
                 finalGrade = in.nextDouble(); 
                 System.out.println("you entered "+finalGrade);

                 break;
                case 5:
                try {
                    Course course = new Course(courseCode, courseName, creditHours, finalGrade);
                    System.out.println(course.toString());
                    } 
                catch (InvalidGradeException e) 
                {
                    System.err.println("Error: " + e.getMessage());
                }

                case 0:
                System.out.println("Exiting......... ");
                    break;
                    

                default: System.out.println("Invalide input !!!!");
                    break;
            }

       
        }
        while(option!=0);
       
        in.close();
    }
}
