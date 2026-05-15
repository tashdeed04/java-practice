public class Student2 {
    public int id;
    public double cgpa = -1;
    public String[] courses = new String[4];
    public int courseCount = 0;

    public Student(int id) {
      this.id = id;
      System.out.println("A student with ID " + id + " has been created.");
    }

    public Student(int id, double cgpa) {
      this.id = id;
      this.cgpa = cgpa;
      System.out.println("A student with ID " + id + " and cgpa " + cgpa + " has been created.");
    }

    public void addCourse(String course) {
      if (cgpa == -1) {
        System.out.println("Failed to add " + course);
        System.out.println("Set CG first");
        return;
      }
      if (cgpa < 3 && courseCount >= 3) {
          System.out.println("Failed to add " + course);
          System.out.println("CG is low. Can't add more than 3 courses.");
          return;
      }
      if (courseCount >= 4) {
          System.out.println("Failed to add " + course);
          System.out.println("Maximum 4 courses allowed.");
          return;
      }
      courses[courseCount] = course;
      courseCount++;
    }
    
    public void addCourse(String[] newCourses) {
      for (String course : newCourses) {
        addCourse(course);
        }
    }

    public void storeCG(double cgpa) {
      this.cgpa = cgpa;
    }

    public void storeID(int id) {
      this.id = id;
    }

    public void removeAllCourse() {
      for (int i = 0; i < courseCount; i++) {
        courses[i] = null;
      }
        courseCount = 0;
    }

    public void showAdvisee() {
      System.out.println("Student ID: " + id + ", CGPA: " + cgpa + ".");
      if (courseCount == 0) {
        System.out.println("No courses added.");
      } else { 
        System.out.print("Added courses are: ");
        for (int i = 0; i < courseCount; i++){
          System.out.print(courses[i] + " "); 
        } 
        System.out.println();
      }
    }
}