class MyThread extends Thread
{
    public void run()
    {
        try
        {
            for (int i = 10; i <= 100; i+=10)
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
}