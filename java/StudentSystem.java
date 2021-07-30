import java.util.*;

class StudentSystem
{
    String sName = ""; int sRollNo; double sMarks;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userName = sc.next();
        System.out.println("Welcome to the System, " + userName + "!");

        System.out.print("How many students information do you want to store? ");
        int n = sc.nextInt();

        ArrayList<StudentSystem> studentsList = new ArrayList<StudentSystem>();
        StudentSystem[] studentArray = new StudentSystem[n];

        for (int i = 0; i < n; i++)
        {
            StudentSystem student = new StudentSystem();
            student.sName = sc.next();
            student.sRollNo = sc.nextInt();
            student.sMarks = sc.nextDouble();
            studentsList.add(student);
        }

        System.out.println("Enter your choice: ");
        System.out.println("1. Quit\n2. View\n3. Update");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        if (choice == 1)
        {
            //Quit
            System.out.println("Thank you!");
            System.exit(0);
        }
        else if (choice == 2)
        {
            //View
            for (StudentSystem x : studentsList)
            {
                System.out.println("Name: " + x.sName + " Roll No: " + 
                x.sRollNo + " Marks: " + x.sMarks);
            }

        }
        else if (choice == 3)
        {
            //Update
            System.out.print("Enter the roll number you want to edit: ");
            int edit = sc.nextInt();

            for (StudentSystem x : studentsList)
            {
                if (x.sRollNo == edit)
                {
                    System.out.print("What value do you want to store: ");
                    x.sRollNo = sc.nextInt();
                    System.out.println("Value updated!");
                }
            }

        }
        else
        {
            System.out.println("Invalid input");
        }
    }
}