abstract class shape
{
    abstract void numberOfslides();
}
class Rectangle extends shape
    { @Override
    public void numberOfslides()
{
        System.out.println("Rectangle has 4 sides");
    }
}

class Triangle extends shape
    { @Override
    public void numberOfslides()
    {
        System.out.println("triangle has 3 sides");
    }
}
class Hexagon extends shape
    { @Override
    public void numberOfslides()
{
        System.out.println("hexagon has 6 slides");
}
}

public class Abstract{
    public static void main(String[] args){
        shape rectangle =new Rectangle();
        shape triangle=new Triangle();
        shape hexagon=new Hexagon();

        rectangle.numberOfslides();
        triangle.numberOfslides();
        hexagon.numberOfslides();

}
}