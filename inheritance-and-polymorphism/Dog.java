public class Dog extends Animal {  
  private String breed;
  
  public Dog(String name, int age, String color, String breed) {
    super(name, age, color);
    this.breed = breed;
  }
  
  public void makeSound() {
    System.out.println(color + " color " + name + " is barking");
  }
  
  public String info() {
    return super.info() + "Breed: " + breed + "\n";
  }
}
