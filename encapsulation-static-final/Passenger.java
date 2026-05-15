public class Passenger {
  public static int no_of_passenger = 0;
  public static double total_fare = 0.0;
  
  private String name;
  private double distance;
  private double baggageWeight;
  private double fare;
  
  public Passenger(String name, double distance) {
    this.name = name;
    this.distance = distance;
    this.baggageWeight = 0.0;
    calculateFare();
    no_of_passenger++;
  }
  
  public void storeBaggageWeight(double baggageWeight) {
    total_fare -= this.fare;
    this.baggageWeight = baggageWeight;
    calculateFare();
  }
  
  private void calculateFare() {
    this.fare = (20 * distance) + (10 * baggageWeight);
    total_fare += this.fare;
  }
  
  public void passengerDetails() {
    System.out.println("Name: " + name);
    System.out.println("Fare: " + fare + " TK");
  }
}