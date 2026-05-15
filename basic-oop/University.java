public class University {
  public static void main (String [] args){
    University uni1 = new University();
    University uni2 = new University();
    
    uni1.name = "Imperial College London";
    uni1.country = "England";
    
    System.out.println("Name: "+uni1.name);
    System.out.println("Country: "+uni1.country);
    
    uni2.name = "Brac University";
    uni2.country = "Bangladesh";
    
    System.out.println("Name: "+uni2.name);
    System.out.println("Country: "+uni2.country);
    
  }
}