import java.util.ArrayList;

class StdArrayList
{
    public static void main(String[] args)
    {
        ArrayList<Integer> rollno = new ArrayList<Integer>();
        ArrayList<String> name = new ArrayList<String>();

        System.out.println("Before adding values: " + rollno.size());
        rollno.add(1);
        rollno.add(2);
        rollno.add(3);

        System.out.println("After adding values: " + rollno.size());

        //Overwriting a value
        rollno.set(1, 15);
        System.out.println(rollno);

        rollno.remove(0);
        System.out.println("After removing values: " + rollno.size());
        System.out.println(rollno);

        rollno.clear();
        System.out.println(rollno);

        // for (int i=0; i < rollno.size(); i++) 
        // {
        //     System.out.println(rollno.get(i));
        // }
    }
}