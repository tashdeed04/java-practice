public class Player {
  public static int total = 0;
  public static final int MAX_PLAYERS = 11;
  public static String[] players = new String[MAX_PLAYERS];
  
  private String name;
  private String country;
  private int jerseyNumber;
  
  public Player(String name, String country, int jerseyNumber) {
    if (total < MAX_PLAYERS) {
      this.name = name;
      this.country = country;
      this.jerseyNumber = jerseyNumber;
      players[total] = name;
      total++;
    } else {
      System.out.println("Cannot add more players. Maximum limit reached.");
    }
  }
  
  public static void info() {
    System.out.println("Total number of players: " + total);
    System.out.print("Players enlisted so far: ");
    for (int i = 0; i < total; i++) {
      System.out.print(players[i]);
      if (i < total - 1) {
        System.out.print(", ");
      }
    }
    System.out.println();
  }
  
  public String player_detail() {
    return "Player Name: " + name + "\n" +
      "Jersey Number: " + jerseyNumber + "\n" +
      "Country: " + country;
  }
}