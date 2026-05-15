public class Vehicle2010 extends Vehicle {
  
  public Vehicle2010() {
    super();
    x = 0; 
    y = 0; 
  }
  
  public void moveUpperRight() {
    moveUp();
    moveRight();
  }
  
  public void moveLowerLeft() {
    moveDown();
    moveLeft();
    }
  
  public void moveLowerRight() {
    moveDown();
    moveRight();
  }
}