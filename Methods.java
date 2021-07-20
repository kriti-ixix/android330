/*
Types of functions:
- On the basis of parameters
    1. Default Methods
    2. Parameterised Methods

- On the basis of return type
    1. Void
    2. Some return type
*/

import java.util.Scanner;

class Methods
{
    String name; int marks;

    //Method Overloading
    void calPercentage() //Default method
    {
        float percentage = (marks * 100) / 50;
        System.out.println("Percentage: " + percentage);
    }

    void calPercentage(String n, int m) //Parameterised method
    {
        float percentage = (m * 100) / 50;
        System.out.println("Hi " + n + "! You got " + percentage + "%"); 
    }

    public static void main(String[] args)
    {
        Methods student1 = new Methods();
        Scanner sc = new Scanner(System.in);
        student1.name = "ABC";
        student1.marks = 45;
        student1.calPercentage();

        System.out.print("Enter your name: ");
        String userName = sc.next();
        System.out.print("Enter your marks: ");
        int userMarks = sc.nextInt();

        student1.calPercentage(userName, userMarks);
    }

}