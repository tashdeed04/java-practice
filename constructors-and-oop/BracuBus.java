public class BracuBus {
  public String route;
  public int maxCapacity;
  public BracuStudent[] passengers;
  public int count;

  public BracuBus(String route) {
    this.route = route;
    this.maxCapacity = 2;
    this.passengers = new BracuStudent[maxCapacity];
    this.count = 0;
  }
  
  public BracuBus(String route, int maxCapacity) {
    this.route = route;
    this.maxCapacity = maxCapacity;
    this.passengers = new BracuStudent[maxCapacity];
    this.count = 0;
  }
  
  public void showDetails() {
    System.out.println("Bus Route: " + route);
    System.out.println("Passenger Count: " + count + " (Max: " + maxCapacity + ")");
    System.out.print("Passengers on Board: ");
    if (count == 0) {
      System.out.println("No passengers");
    } else {
      for (int i = 0; i < count; i++) {
        System.out.print(passengers[i].getHome() + " ");
      }
      System.out.println();
    }
  }
  
  public void board(BracuStudent student) {
    if (!student.hasBusPass()) {
      System.out.println("You don't have a bus pass!");
    } else if (!student.getHome().equals(route)) {
      System.out.println("You got on the wrong bus!");
    } else if (count < maxCapacity) {
      passengers[count++] = student;
      System.out.println(student.getHome() + " boarded the bus.");
    } else {
      System.out.println("Bus is full!");
    }
  }
}