public class Shape {
  public String name;
  public double area;
  
  public void setParameters(String name, double radius) {
        this.name = name;
        this.area = 3.1416 * radius * radius;
  }
  
  public void setParameters(String name, int base, int height) {
        this.name = name;
        this.area = 0.5 * base * height;
  }
  
  public void setParameters(String name, double length, double breadth) {
        this.name = name;
        this.area = length * breadth;
  }
  
  public String details() {
        return "Shape Name: " + name + "\nArea: " + area;  
    }
}