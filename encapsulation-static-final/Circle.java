public class Circle {
  public static int count = 0;
  private double radius;
  
  public Circle(double radius) {
    this.radius = radius;
    count++;
  }
  
  public double getRadius() {
    return radius;
  }
  
  public void setRadius(double radius) {
    this.radius = radius;
  }
  
  public double area() {
    return Math.PI * radius * radius;
  }
}