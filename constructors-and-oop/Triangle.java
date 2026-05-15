public class Triangle {
  public int side1;
  public int side2;
  public int side3;
  
  public void updateSides (int side1, int side2, int side3) {
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }
  
  public void triangleDetails() {
    System.out.println("Three sides of the triangle are: "+side1+", "+side2+", "+side3);
    int per = side1+side2+side3;
    System.out.println("Perimeter: "+per);
  }
  
  public String printTriangleType () {
    if (side1 == side2 && side2 == side3) {
      return "This is an Equilateral Triangle.";
    } else if (side1 == side2 || side2 == side3 || side1 == side3) {
      return "This is an Isosceles Triangle.";
    } else {
      return "This is a Scalene Triangle.";
    }
  }
  
  public void compareTrinagles(Triangle t) {    
    if (side1 == side1 && side2 == t.side2 && side3 == t.side3) {
      System.out.println("Addresses are different but the sides of the triangles are equal.");
    }else if ((side1 + side2 + side3) == (t.side1 + t.side2 + t.side3)) {
        System.out.println("Only the perimeter of both triangles is equal.");
    }else {
       System.out.println("Addresses, length of the sides and perimeter all are different.");
    }
  }
}