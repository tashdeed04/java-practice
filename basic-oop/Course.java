public class Course {
  public String name ;
  public String course ;
  public int credit ;
  

  
  public void updateDetails(String name, String course, int credit) {
    this.name = name;
    this.course = course;
    this.credit = credit;
  }
  public void displayCourse () {
    System.out.println("Course Name: "+name);
    System.out.println("Course Code: "+course);
    System.out.println("Course Credit: "+credit);
  }
}