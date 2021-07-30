import java.util.Scanner;

class StdArray 
{
    public static void main(String[] args)
    {
        int[] rollno = new int[5];
        String[] name = new String[5];
        Scanner sc = new Scanner(System.in);

        //int[] rollno = {1, 2, 4, 8, 16};
        //0 -> 1
        //1 -> 2
        //System.out.println(rollno[3]); //Fetching a value
        //rollno[3] = 10; //Overwriting an existing value
        //rollno[21] = 100;

        System.out.println("Storing values in the array: ");
        for (int i=0; i < 5; i++)
        {
            rollno[i] = sc.nextInt();
            name[i] = sc.next();
        }

        System.out.println("Printing out the array: ");
        for (int i = 0; i < 5; i++)
        {
            System.out.println(rollno[i] + ". " + name[i]);   
        }
    }
}