package getset;
 public class Circle {
    private double radius;
     Circle(double radius)
     {
        this.radius=radius;
     }
     public double getRadius()
     {
        return radius;
     }
    public void setRadius(double radius)
    {
        this.radius=radius;

    }
    public double calculateArea()
    {
        return 3.14*(getRadius()*getRadius());
    }
    
}
 class circleDriver
{
    public static void main(String[] args) {
        Circle c=new Circle(4.5);
        System.err.println(c.getRadius());
    }
}
