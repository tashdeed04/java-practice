public class Student {
  public String name;
  public int id;
  public String department;
  public String email;
  public String password;
  
  public Student(String name, int id, String department) {
    this.name = name;
    this.id = id;
    this.department = department;
  }
}
public class Usis {
  public Student[] advisees;
  public int total;
  public int max = 5;
  
  public Usis() {
    advisees = new Student[max];
    total = 0;
  }
  
  public void login(Student student) {
    System.out.println("Login functionality not implemented.");
  }
  
  public void advising(Student student) {
    if (total >= max) {      
      System.out.println("Usis is at full capacity. Cannot advise more students.");
      return;
    }
    if (total == 0) {
      advisees[total] = student;
      total++;
      System.out.println("Advisee added successfully!");
    } else {
      System.out.println("Please login to advise courses!");
    }
  }
  public void allAdviseeInfo() {
    System.out.println("Total Advisee: " + total);
    for (int i = 0; i < total; i++) {
      Student student = advisees[i];
      System.out.println("Name: " + student.name + " ID: " + student.id);
      System.out.println("Department: " + student.department);
      System.out.println("===============");
    }
  }
}