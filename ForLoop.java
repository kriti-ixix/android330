class ForLoop
{
    public static void main(String[] args)
    {
        //for (initialisation; condition; inc/dec)
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(i);
        }

        int i = 1;

        while (i < 11)
        {
            System.out.println(i);
            i++;
        }

        int i = 20;

        do
        {
            System.out.println(i);
        } while(i == 10);
    }
}
