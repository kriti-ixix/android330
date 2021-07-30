class ControlFlow
{
    public static void main(String[] args)
    {
        for (int i=1; i<=10; i++)
        {
            if (i == 5)
            {
                //break; //Terminates the loop
                continue; //Skips over the rest of the loop
            }

            System.out.println(i);
        }
    }
}