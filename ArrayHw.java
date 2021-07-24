import java.util.Scanner;

class ArrayHw
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        //Asking the length of the array
        System.out.print("Enter the length of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        //Storing the values
        System.out.println("Enter " + n + " values: ");
        for (int i = 0; i < n; i++)
        {
            arr[i] = scanner.nextInt();
        }

        //Printing out the array
        System.out.println("The values are: ");
        for (int el: arr)
        {
            System.out.print(el + "\t");
        }

        System.out.println("");

        //Finding the largest value
        int largestValue = 0; 
        int secondLargest = 0;

        for (int el : arr)
        {
            if (el > largestValue) 
            {  
                secondLargest = largestValue;
                largestValue = el;
                System.out.println("The largest value is " + largestValue);
                System.out.println("The second largest value is " + secondLargest);
            }
            else if (el > secondLargest)
            {
                secondLargest = el;
                System.out.println("The largest value is " + largestValue);
                System.out.println("The second largest value is " + secondLargest);
            }
        }

        System.out.println("The largest value is " + largestValue);
        System.out.println("The second largest value is " + secondLargest);
    }
}