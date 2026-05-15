public class Shape2D {
  public int length;
  public int breadth;
  public int height;
  public int base;
  public String shapeType;
  
  public Shape2D() {
    this.length = 5;
    System.out.println("A Square has been created with length: " + length);
  }
  
  public Shape2D(int length, int breadth) {
    this.length = length;
    this.breadth = breadth;
    System.out.println("A Rectangle has been created with length: " + length + " and breadth: " + breadth); 
  }
  
  public Shape2D(int height, int base, String shapeType) {
    this.height = height;
    this.base = base;
    this.shapeType = shapeType;
    System.out.println("A Triangle has been created with height: " + height + " and base: " + base);
  }
  
  public Shape2D(int side1, int side2, int side3) {
    this.height = side1;
    this.base = side2;
    System.out.println("A Triangle has been created with the following sides: " + side1 + ", " + side2 + ", " + side3);
  }
  
  public void area() {
    if (length != 0 && breadth == 0) {
      double area = length * length;
        System.out.println("The area of the Square is: " + area);
    } else if (length != 0 && breadth != 0) {
      double area = length * breadth;
        System.out.println("The area of the Rectangle is: " + area);
    } else if (height != 0 && base != 0) {
      double area = 0.5 * height * base;
        System.out.println("The area of the Triangle is: " + area);
    }
  }
}