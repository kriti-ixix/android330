interface MyInterface
{
    void calArea();
    void calPerimeter();
}

class Square implements MyInterface
{
    public void calArea()
    {
        int side = 5;
        System.out.println("Area of square: " + side * side);
    }

    public void calPerimeter()
    {
        int side = 10;
        System.out.println("Perimeter of square: " + 4 * side);
    }
}

class Rectangle implements MyInterface
{
    public void calArea()
    {
        int length = 10, breadth = 5;
        System.out.println("Area of rectangle: " + length * breadth);
    }

    public void calPerimeter()
    {
        int length = 10, breadth = 5;
        System.out.println("Perimeter of rectangle: " + 2 * (length + breadth) );
    }
}

class AreaInterface
{
    public static void main(String[] args)
    {
        Square s = new Square();
        Rectangle r = new Rectangle();
        s.calArea();
        r.calArea();
        s.calPerimeter();
        r.calPerimeter();
    }
}