public class Employee {
 public String name;
 public double salary = 30000.0;
 public String designation = "junior";
 
 public void newEmployee(String name){
   this.name = name;
 }
 
 public void calculateTax() {
   if (salary > 50000){
     double tax = salary * 0.30;
     System.out.println(name+" Tax Amount: "+tax+" Tk");
   } else if (salary > 30000) {
     double tax = salary * 0.10;
     System.out.println(name+" Tax Amount: "+tax+" Tk");
   } else if (salary == 30000) {
     System.out.println(" No need to pay tax");
   }
 }
 
 public void promoteEmployee(String newDes) {
   designation = newDes;
     if (newDes.equals("junior")){
      salary += 0;     
   } else if (newDes.equals("senior")) {
      salary += 25000;
   } else if (newDes.equals("lead")) {
      salary += 50000;
      System.out.println(name+" has been promoted to lead");
      System.out.println("New Salary: "+ salary);
   } else if (newDes.equals("manager")) {
      salary += 75000;
      System.out.println(name+" has been promoted to manager");
      System.out.println("New Salary: "+ salary);
   } 
 }
 
 public void displayInfo() {
   System.out.println("Employee Name: "+name);
   System.out.println("Employee Salary: "+salary+" Tk");
   System.out.println("Employee designation: "+designation);
   }
}