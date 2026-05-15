public class Student {
  public static int totalStudents = 0;
  public static int cseStudents = 0;
  public static int otherDeptStudents = 0;
  
  private int id;
  private String name;
  private double cgpa;
  private String department;
  
  public Student(String name, double cgpa) {
    this.id = ++totalStudents;
    this.name = name;
    this.cgpa = cgpa;
    this.department = "CSE";
    cseStudents++;
  }
  
  public Student(String name, double cgpa, String department) {
    this.id = ++totalStudents;
    this.name = name;
    this.cgpa = cgpa;
    this.department = department;
    otherDeptStudents++;
  }
  
  public static void printDetails() {
    System.out.println("Total Student(s): " + totalStudents);
    System.out.println("CSE Student(s): " + cseStudents);
    System.out.println("Other Department Student(s): " + otherDeptStudents);
  }
  
  public void individualDetail() {
    System.out.println("ID: " + id);
    System.out.println("Name: " + name);
    System.out.println("CGPA: " + cgpa);
    System.out.println("Department: " + department);
  }
}