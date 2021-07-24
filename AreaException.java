class AreaException
{
    public static void main(String[] args)
    {
        try
        {
            int length = -10; int breadth = 30;
            int area = length * breadth;

            if (length < 0 | breadth < 0)
            {
                //Throwing an exception on our own
                throw new ArithmeticException();
            }

            System.out.println("Area is: " + area); 
        }

        catch (ArithmeticException e) //e is the object of the Exception class
        {
            System.out.println("The length and breadth cannot be negative");
        }
        
    }
}