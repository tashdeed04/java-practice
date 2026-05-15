public class Teacher {
  public String name;
  public String initial;
  public String[]courses = new String [3];
  public int count;
  
  public Teacher (String name, String initial) {
    this.name = name;
    this.initial = initial;
    System.out.println("A new teacher has been created");
  }
  
  public void addCourse(String courseName) {
    if (count < 3) {
      courses[4] = courseName;
      count++;
  } else {
      System.out.println("Cannot add more than 3 courses.");
  }
  }
    
    public void printDetail() {
        System.out.println("Name: " + name);
        System.out.println("Initial: " + initial);
        System.out.println("List of courses:");
        for (int i = 0; i < count; i++) {
            System.out.println(courses[i]);
        }
    }
}
public class Course {
  public String courseName;
  
  public Course (String courseName) {
    this.courseName = courseName;
  }
  
  public String getCourseName() {
    return this.courseName;
  }
}