class InheritThread extends Thread
{
    //What will happen when the thread runs
    public void run()
    {
        try
        {
            for (int i = 1; i <= 10; i++)
            {
                System.out.println(i);
                Thread.sleep(1000); //Pauses the thread for 1 second
            }
        }
        catch (Exception e) //e is the object of the exception class
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        InheritThread t1 = new InheritThread();
        MyThread t2 = new MyThread();
        t1.start();
        t2.start();
    }
}