import java.util.Scanner;

class ExceptionHandling
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            //Normal execution of the code
            System.out.println("Enter two numbers:");
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = x/y;

            System.out.println(z);
        }

        catch (Exception e)
        {
            //In case of any exception
            System.out.println("Division by zero is not possible");
        }

        finally 
        {
            //Optional block
            System.out.println("Execution finished");
        }
    }
}