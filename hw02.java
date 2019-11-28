interface Shape {
    abstract double getArea();   
}
class Rectangle implements Shape{
    private double length;
    private double width;
    public Rectangle(double l,double w){
        length = l;
        width = w;
    }
    public double getArea(){        
        return length*width;
    }
    public String toString(){
        return "area="+getArea();
    }
}
class Triangle implements Shape{
    private double base;
    private double height;
    public Triangle(double b,double h){
        base = b;
        height = h;
    }
    public double getArea(){
        
        return base*height*0.5;
    }
    public String toString(){
        return "area=" + getArea();
    }
}
public class Main
{
    public static void main(String args[]){
        Rectangle rec;
        rec = new Rectangle(10,10);
        System.out.println(rec);

        Triangle tri;
        tri = new Triangle(10,10);
        System.out.println(tri);

    }
}