public class Cargo {
  private static double totalCapacity = 10.0;
  private static int nextId = 1;
  private int cargoId;
  private String contents;
  private double weight;
  private boolean isLoaded;
  
  public Cargo(String contents, double weight) {
    this.cargoId = nextId++;
    this.contents = contents;
    this.weight = weight;
    this.isLoaded = false;
  }
  
  public static double capacity() {
    return totalCapacity;
  }
  
  public void load() {
    if (isLoaded) {
      System.out.println("Cargo " + cargoId + " is already loaded.");
      return;
    }
    if (totalCapacity >= weight) {
      totalCapacity -= weight;
      isLoaded = true;
      System.out.println("Cargo " + cargoId + " loaded for transport.");
    } else {
      System.out.println("Cannot load cargo, exceeds weight capacity.");
    }
  }
  
  public void unload() {
    if (!isLoaded) {
      System.out.println("Cargo " + cargoId + " is not loaded.");
      return;
    }
    totalCapacity += weight;
    isLoaded = false;
    System.out.println("Cargo " + cargoId + " unloaded.");
  }
  
  public void details() {
    System.out.println("Cargo ID: " + cargoId + ", Contents: " + contents + ", Weight: " + weight + ", Loaded: " + isLoaded);
  }
}