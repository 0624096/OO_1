# 0624096 陳乃瑄
## 0624096 陳乃瑄
### 0624096 陳乃瑄
#### 0624096 陳乃瑄
##### 0624096 陳乃瑄
###### 0624096 陳乃瑄
:poop:
:clap:
:bird:
:fire:

---

*Hello*

**Hello**

~~Hello~~

>美食圖鑑
>>披薩

>>鹹酥雞

>>滷味

```
阿囉哈
```

[GOOGLE](https://www.google.com.tw/)

|Number| Name |Gender|
|:-----|:----:|-----:|
|0|BOB|M|
|1|Marry|F|
|2|Bonny|F|

```java
public Die(int numSides)
    {   assert numSides > 1 : "Violation of precondition: numSides = " + numSides + "numSides must be greater than 1";

        iMyNumSides = numSides;
        iMyResult = 1;
        assert getResult() == 1 && getNumSides() == numSides;
    }
```

[![Baby Shark Dance](https://img.youtube.com/vi/XqZsoesa55w/0.jpg)](https://www.youtube.com/watch?v=XqZsoesa55w "Baby Shark Dance")

![Snoopy](001.png "Snoopy")

* 1121 hw01
```java
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
```




* 1128 hw02
```java 
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
public class hw02
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
```
