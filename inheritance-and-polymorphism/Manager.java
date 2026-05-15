public class Manager extends Employee {
  public double bonusPercentage;
  public double finalSalary;
  
  public Manager(String name, double baseSalary, int hoursWorked, double bonusPercentage) {
    super(name, baseSalary, hoursWorked);
    this.bonusPercentage = bonusPercentage;
  }
  
  public void calculateSalary() {
    double bonus = (getBaseSalary() * bonusPercentage) / 100.0;
    finalSalary = getBaseSalary();
    if (getHoursWorked() > 40) {
      finalSalary += bonus;    
    }
    
    System.out.println("Bonus: " + bonusPercentage + " %");
    System.out.println("Final Salary: $" + finalSalary);
  }
  
  public void requestIncrement(double amount) {
    if (getHoursWorked() > 100) {
      setBaseSalary(getBaseSalary() + amount);
      System.out.println("$" + amount + " Increment approved.");
    } else if (getHoursWorked() > 80) {
      setBaseSalary(getBaseSalary() + (amount / 2));
      System.out.println("$" + (amount / 2) + " Increment approved.");
    } else {
      System.out.println("Increment denied.");
    }
  }
  
  public void displayInfo() {
    super.displayInfo();
    System.out.println("Bonus: " + bonusPercentage + " %");
    System.out.println("Final Salary: $" + finalSalary);
  }
}