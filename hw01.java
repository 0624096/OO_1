abstract class Cshape
{
    protected String color;
    public void setColor(String str)
    {
        color = str;
    }
    public abstract void show();
}

class CTriangle extends Cshape
{
    protected double length,height,width;
    public CTriangle (double a,double b,double c)
    {
        length = a;
        height = b;
        width = c;
    }
    public void show()
    {
        System.out.print("color="+color+", ");       
        System.out.println("area="+0.5*length*height);       
    }
}
public class Homework{
    public static void main(String args[])
    {
        Cshape shape1 = new CTriangle(3,4,5);
        shape1.setColor("Red");
        shape1.show();
    }
}