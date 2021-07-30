import java.util.Scanner;

class EvenOrOdd
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        float marks = sc.nextFloat();

        if (number%2 == 0)
        {
            System.out.println("This number is even");
        }
        else
        {
            System.out.println("This number is odd");
        }
    }
}