import java.util.Scanner;

class Hello
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.print(x+y + " ");
        System.out.print(x-y + " ");
        System.out.print(x*y + " ");
        System.out.print(x/y + " ");
        System.out.print(x%y + " ");
        //System.out.println("Hello world!");
    }
}