package exercise1B;

public class Circle
{
private int radius;
public static final double PI =3.14159;
 
public double getRad(int r)
{
    return r;
}
public double getArea(int r)
{
   double area = r*r*PI;
    return area;
}
public String toString()
{
    return "the radius is " + radius + " the area is " + getArea(radius);
}
}