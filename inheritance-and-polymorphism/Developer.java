public class Developer extends Employee {
  public String language;
  public double finalSalary;
  
  public Developer(String name, double baseSalary, int hoursWorked, String language) {
    super(name, baseSalary, hoursWorked);
    this.language = language;
  }
  
  public void calculateSalary() {
    finalSalary = getBaseSalary();
    if (language.equalsIgnoreCase("Java")) {
      finalSalary += 700;
    }
    System.out.println("Final Salary: $" + finalSalary);
  }
  
  public void displayInfo() {
    super.displayInfo();
    System.out.println("Language: " + language);
    System.out.println("Final Salary: $" + finalSalary);
  }
}
