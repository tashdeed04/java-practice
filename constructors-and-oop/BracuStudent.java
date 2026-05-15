public class BracuStudent {
  public String name;
  public String home;
  public boolean hasBusPass;

  public BracuStudent(String name, String home) {
    this.name = name;
    this.home = home;
    this.hasBusPass = false;
  }
  
  public void showDetails() {
    System.out.println("Student Name: " + name);
    System.out.println("Lives in " + home);
    System.out.println("Have Bus Pass? " + hasBusPass);
  }
  
  public void getPass() {
    hasBusPass = true;
  }
  
  public void updateHome(String newHome) {
    home = newHome;
  } 

  public String getHome() {
    return home;
  }

  public boolean hasBusPass() {
    return hasBusPass;
  }
}
