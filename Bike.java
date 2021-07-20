class Bike
{
    int speed, gear;

    Bike() //Default constructor
    {
        speed = 100;
        gear = 2;
    }

    Bike(int s, int g) //Parameterised constructor
    {
        speed = s;
        gear = g;
    }

    public static void main(String[] args)
    {
        Bike bike = new Bike(200, 5);
        System.out.println(bike.speed);

        Bike bike2 = new Bike();
        System.out.println(bike2.speed);
    }
}