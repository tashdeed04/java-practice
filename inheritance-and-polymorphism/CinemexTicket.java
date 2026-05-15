public class CinemexTicket extends MovieTicket {
  public static int totalTickets = 0;
  public String ticketId;
  public String genre;
  public String seatType;
  public double finalPrice;
  public boolean isPaid = false;
  
  public CinemexTicket(String movie, String showtime, String genre, String date) {
    super(movie, date, showtime, seatPrices[0]);
    this.genre = genre;
    this.seatType = seatTypes[0];
    totalTickets++;
    generateTicketId();
  }
  
  public CinemexTicket(String movie, String showtime, String genre, String date, String seatType) {
    super(movie, date, showtime, seatPrices[getSeatTypeIndex(seatType)]);
    this.genre = genre;
    this.seatType = seatType;
    totalTickets++;
    generateTicketId();
  }
  
  public void generateTicketId() {
    char seatTypeFirstLetter = seatType.charAt(0);
    this.ticketId = getMovie() + "-" + seatTypeFirstLetter + "-" + totalTickets;
  }
  
  public static int getSeatTypeIndex(String seatType) {
    for (int i = 0; i < seatTypes.length; i++) {
      if (seatTypes[i].equalsIgnoreCase(seatType)) {
        return i;
      }
    }
    
    return 0;
  }
  
  public void calculateTicketPrice() {
    int hour = Integer.parseInt(showtime.split(":")[0]);
    int minute = Integer.parseInt(showtime.split(":")[1]);
    finalPrice = getPrice();
    
    if ((hour == 18 && minute >= 0) || (hour > 18 && hour < 23) || (hour == 23 && minute == 0)) {
      finalPrice += (finalPrice * nightShowCharge) / 100.0;
    }
    setPrice(finalPrice);
    System.out.println("Ticket price is calculated successfully.");
  }
  
  public String confirmPayment() {
    if (!isPaid) {
      isPaid = true;
      return "Payment Successful.";
    } else {
      
      return "Ticket price is already paid!";
    }
  }
  
  public static int getTotalTickets() {
    return totalTickets;
  }
  
  public String toString() {
    String status = isPaid ? "Paid" : "Not Paid";
    return "Ticket ID: " + ticketId + "\n" +
      super.toString() + "\n" +
      "Genre: " + genre + "\n" +
      "Seat Type: " + seatType + "\n" +
      "Price(tk): " + finalPrice + "\n" +
      "Status: " + status;
  }
}
